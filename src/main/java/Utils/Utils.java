package Utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Interfaces.IUtils;
import Modelo.Apuesta;
import Modelo.Atributo;
import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.RepoApuesta;
import Modelo.RepoEquipo;
import Modelo.RepoJugador;
import Modelo.RepoTorneo;
import Modelo.Torneo;
import Vistas.Vistas;

public class Utils implements IUtils {
	
	//patron singleton
		private static Utils _instance;
		
	private Utils() {
		
	}
	
	/**
	 * Metodo para convertir vista en patron singleton
	 * @return devuelve vista
	 */
	public static Utils getInstance() {
		if(_instance==null) {
			_instance=new Utils();
		}
		return _instance;
	}
	
	RepoJugador rj = RepoJugador.getInstance();
	RepoEquipo re = RepoEquipo.getInstance();
	RepoApuesta ra = RepoApuesta.getInstance();
	RepoTorneo rt = RepoTorneo.getInstance();
	
	/**
	 * Metodo para leer un jugador por teclado con todos sus atributos
	 * @return jugador creado
	 */
	public Jugador ReadJugador() {
		String nombre;
		Integer dorsal,id;
		String pais;
		Double altura;
		id = leeEntero("Introduce la id del jugador");
		nombre = leeString("Introduce el nombre del jugador");
		ArrayList<Atributo> JAtributos = ReadAtributos();
		dorsal = leeEntero("Introduce el dorsal del jugador");
		pais = leeString("Introduce el pais del jugador");
		altura = leeDouble("Introduce la altura del jugador");
		Jugador j = new Jugador (id,nombre,JAtributos,dorsal,pais,altura);
		return j;
	}
	
	/**
	 * Metodo que crea y añade todos los atributos para el jugador cuando lo creas
	 * @return un array con todos los atributos
	 */
	public ArrayList<Atributo> ReadAtributos() {
		ArrayList<Atributo> misAtributos = new ArrayList<Atributo>();
		Integer tiro = leeEntero("Introduce el tiro del jugador");
		Integer defensa = leeEntero("Introduce la defensa del jugador");
		Integer pos = leeEntero("Introduce el posicionamiento del jugador");
		Integer velocidad = leeEntero("Introduce la velocidad del jugador");
		Integer fuerza = leeEntero("Introduce la fuerza del jugador");
		Integer salto = leeEntero("Introduce el salto del jugador");
		Integer drib = leeEntero("Introduce el regate del jugador");
		Integer res = leeEntero("Introduce la resistencia del jugador");
		Integer vision = leeEntero("Introduce la vision del jugador");
		Integer pase = leeEntero("Introduce el pase del jugador");
		Integer agilidad = leeEntero("Introduce la agilidad del jugador");
		Atributo a = new Atributo(tiro,defensa,pos,velocidad,fuerza,salto,drib,res,vision,pase,agilidad);
		misAtributos.add(a);
		return misAtributos;
	}
	
	/**
	 * Metodo que crea el equipo con los atributos basicos
	 * @return el equipo creado
	 */
	public Equipo ReadEquipo() {
		String nombre = leeString("Introduce el nombre del equipo");
		String color = leeString("Introduce el color del equipo");
		Integer NJugadores = leeEntero("Introduce el numero de jugadores que tendra el equipo");
		Equipo e = new Equipo(nombre,color,NJugadores);
		return e;
	}
	
	/**
	 * Metodo para añadir los jugadores que tenemos al equipo deseado
	 * @param e equipo que le pasamos para añadir jugadores
	 * @return el equipo con los jugadores creados
	 */
	public Equipo AddPlayers(Equipo e) {
		ArrayList<Jugador> misJugadores = ElegirJugador(e);
		Equipo nuevo = new Equipo(e.getNombre(),e.getColor(),e.getnJugadores(),misJugadores);
		return nuevo;
	}
	
	/**
	 * Metodo para elegir jugadores y se añaden a un array
	 * @param e equipo al que deseamos añadirle jugadores
	 * @return arrayList de jugadores que queremos añadir al equipo
	 */
	public ArrayList<Jugador> ElegirJugador(Equipo e) {
		Integer contador = 0;
		ArrayList<Jugador> misJ = new ArrayList<Jugador>();
		while (contador<e.getnJugadores()) {
			rj.showPlayersList(rj.ShowPlayers());
			Integer id = leeEntero("Introduce la ID del jugador que quieres añadir");
			Jugador ju = rj.getJugador(id);
			misJ.add(ju);
			contador++;
		}
		return misJ;
	}
	
	public Torneo ReadTorneo() {
		Integer id= leeEntero("Introduce el identificador del torneo");
		String nombre = leeString("Introduce el nombre del torneo");
		ArrayList<Equipo> misEquipos = ElegirEquipos();
		Torneo t = new Torneo(id,nombre,misEquipos);
		return t;
	}
	
	public ArrayList<Equipo> ElegirEquipos() {
		ArrayList<Equipo> misEquipos = new ArrayList<Equipo>();
		Integer contador = 0;
		while (contador<4) {
			re.showTeamsList(re.ShowTeams());
			String nombre = leeString("Introduce el nombre del equipo");
			Equipo e = re.getEquipo(nombre);
			misEquipos.add(e);
			contador++;
		}
		return misEquipos;
	}
	
	public Apuesta makeApuesta(Torneo t) {
		Integer n = leeEntero("Introduce el numero de la apuesta");
		Integer cantidad = leeEntero("Introduce la cantidad que vas a apostar");
		MostrarEquipos(t);
		String nombre = leeString("¿Que equipo crees que ganara?");
		Equipo e = re.getEquipo(nombre);
		Apuesta a = new Apuesta(cantidad,n,e,100);
		if (comprobarApuesta() == true) {
			Integer o = a.getSaldo()*2;
			a.setSaldo(o);
			return a;
		} else {
			a.setSaldo(0);
			return a;
		}
	}
	
	public boolean comprobarApuesta() {
		boolean s = false;
		Random r = new Random();
		int low = 0;
		int high = 2;
		int result = r.nextInt(high-low) + low;
		if (result==1) {
			print("Felicidades, ganaste la apuesta y doblaste tu saldo");
			s = true;
		} else {
			print("Perdiste la apuesta y por tanto el saldo apostado");
		}
	return s;
	}
	
	public void MostrarEquipos (Torneo t) {
		ArrayList<Equipo> dev = t.getListaEquipos();
		for (Equipo e : dev) {
			printEquipo(e);
		}
	}
	
	/**
	 * Metodo que controla los errores a la hora de introducir un entero
	 */
	public Integer leeEntero(String frase) {
		Scanner teclado= new Scanner(System.in);
		boolean valid=false;
		Integer numero=-1;
		do {
			try {
				System.out.println(frase);
				numero=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error. Vuelve a introducir un valor");
				teclado.next();
			}
		}while(!valid);
		return numero;
	}

	/**
	 * Metodo que controla los errores a la hora de introducir un float
	 */
	public Double leeDouble(String frase) {
		Scanner teclado= new Scanner(System.in);
		boolean valid=false;
		Double numero=1.0;
		do {
			try {
				System.out.println(frase);
				numero=teclado.nextDouble();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error. Vuelve a introducir un valor");
				teclado.next();
			}
		}while(!valid);
		return numero;
	}

	/**
	 * Metodo que lee por teclado una cadena de caracteres
	 */
	public String leeString(String frase) {
		Scanner teclado= new Scanner (System.in);
		String f="";
		System.out.println(frase);
		f=teclado.nextLine();
		return f;
	}

	/**
	 * Metodo para imprimir por pantalla una cadena de caracteres
	 */
	public void print(String s) {
		System.out.println(s);
	}
	
	public void printJugador(Jugador j) {
		System.out.println(j);
	}
	
	public void printEquipo(Equipo e) {
		System.out.println(e);
	}

	/**
	 * Metodo para elegir la opcion del menu para elegir en donde queremos entrar
	 * Controla los errores para que tengamos que elegir una opcion que este en el menu
	 */
	public Integer opcMenu3() {
		boolean valid= false;
		Integer opcion=-1;
		do {
			valid = false;
			opcion=leeEntero("Introduzca una opcion");
			if(opcion<1 || opcion>3) {
			System.out.println("Debe insertar un valor valido");
			valid=true;
			}
		}while(valid);
		return opcion;
	}

	/**
	 * Metodo para elegir la opcion del menu para elegir en donde queremos entrar
	 * Controla los errores para que tengamos que elegir una opcion que este en el menu 
	 */
	public Integer opcMenu6() {
		boolean valid= false;
		Integer opcion=-1;
		do {
			valid = false;
			opcion=leeEntero("Introduzca una opcion");
			if(opcion<1 || opcion>6) {
			System.out.println("Debe insertar un valor valido");
			valid=true;
			}
		}while(valid);
		return opcion;
	}

	/**
	 * Metodo para elegir la opcion del menu para elegir en donde queremos entrar
	 * Controla los errores para que tengamos que elegir una opcion que este en el menu
	 */
	public Integer opcMenu5() {
		boolean valid= false;
		Integer opcion=-1;
		do {
			valid = false;
			opcion=leeEntero("Introduzca una opcion");
			if(opcion<1 || opcion>5) {
			System.out.println("Debe insertar un valor valido");
			valid=true;
			}
		}while(valid);
		return opcion;
	}

	/**
	 * Metodo para elegir la opcion del menu para elegir en donde queremos entrar
	 * Controla los errores para que tengamos que elegir una opcion que este en el menu 
	 */
	public Integer opcMenu4() {
		boolean valid= false;
		Integer opcion=-1;
		do {
			valid = false;
			opcion=leeEntero("Introduzca una opcion");
			if(opcion<1 || opcion>4) {
			System.out.println("Debe insertar un valor valido");
			valid=true;
			}
		}while(valid);
		return opcion;
	}
	
	/**
	 *  Metodo para elegir la opcion del menu para elegir en donde queremos entrar
	 *  Controla los errores para que tengamos que elegir una opcion que este en el menu
	 */
	public Integer opcMenu7() {
		boolean valid= false;
		Integer opcion=-1;
		do {
			valid = false;
			opcion=leeEntero("Introduzca una opcion");
			if(opcion<1 || opcion>7) {
			System.out.println("Debe insertar un valor valido");
			valid=true;
			}
		}while(valid);
		return opcion;
	}
}

package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	
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
	public Float leeFloat(String frase) {
		Scanner teclado= new Scanner(System.in);
		boolean valid=false;
		Float numero=1.f;
		do {
			try {
				System.out.println(frase);
				numero=teclado.nextFloat();
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

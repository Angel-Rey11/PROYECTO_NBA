package Controller;

import Modelo.Equipo;
import Modelo.Partida;
import Modelo.RepoApuesta;
import Modelo.RepoEquipo;
import Modelo.RepoJugador;
import Modelo.RepoTorneo;
import Modelo.Torneo;
import Utils.Utils;
import Vistas.Vistas;

public class Controlador {
	
	Vistas v = new Vistas();
	Utils u = Utils.getInstance();
	RepoJugador rj = RepoJugador.getInstance();
	RepoEquipo re = RepoEquipo.getInstance();
	RepoTorneo rt = RepoTorneo.getInstance();
	RepoApuesta rp = RepoApuesta.getInstance();
	Partida p = new Partida();
	
	/**
	 * Controlador principal del programa, muestra el menu principal
	 * @param op que introduces para navegar por el menu
	 */
	private void SwitchMain(int op) {
		switch (op) {
		case 1:
			v.showMainPlayer();
			SwitchMenuPlayer(u.opcMenu5());
			break;
		case 2:
			v.showMainTeam();
			SwitchMenuTeam(u.opcMenu5());
			break;
		case 3:
			v.showMainTorneos();
			SwitchMenuTorneos(u.opcMenu5());
			break;
		case 4:
			Integer suma = rp.showApuestaList(rp.ShowApuestas());
			u.print("Tu saldo final es de " + suma);
			u.print("Gracias por utilizar nuestro programa y disfruta tu dinero");
			break;
		}
	}
	
	/**
	 * Muestra el menu principal de los jugadores
	 * @param op que introduces para navegar por el menu
	 */
	private void SwitchMenuPlayer(int op) {
		switch (op) {
		case 1:
			rj.AddJugador(u.ReadJugador());
			v.showMainPlayer();
			SwitchMenuPlayer(u.opcMenu5());
			break;
		case 2:
			Integer id = u.leeEntero("Introduce el ID del jugador");
			rj.removeJugador(id);
			v.showMainPlayer();
			SwitchMenuPlayer(u.opcMenu5());
			break;
		case 3:
			v.showModifyPlayer();
			SwitchMenuModifyPlayer(u.opcMenu5());
			break;
		case 4:
			rj.showPlayersList(rj.ShowPlayers());
			v.showMainPlayer();
			SwitchMenuPlayer(u.opcMenu5());
			break;
		case 5:
			v.showMainMenu();
			SwitchMain(u.opcMenu3());
			break;
		}
	}
	
	private void SwitchMenuModifyPlayer(int op) {
		switch (op) {
		case 1:
			Integer ID = u.leeEntero("Introduce el ID del jugador a modificar");
			String name = u.leeString("Introduce el nombre nuevo");
			rj.modifyName(ID, name);
			v.showModifyPlayer();
			SwitchMenuModifyPlayer(u.opcMenu5());
			break;
		case 2:
			Integer ID2 = u.leeEntero("Introduce el ID del jugador a modificar");
			Integer dorsal = u.leeEntero("Introduce el nuevo dorsal");
			rj.modifyDorsal(ID2, dorsal);
			v.showModifyPlayer();
			SwitchMenuModifyPlayer(u.opcMenu5());
			break;
		case 3:
			Integer ID3 = u.leeEntero("Introduce el ID del jugador a modificar");
			Double altura = u.leeDouble("Introduce la nueva altura del jugador");
			rj.modifyAltura(ID3, altura);
			v.showModifyPlayer();
			SwitchMenuModifyPlayer(u.opcMenu5());
			break;
		case 4:
			Integer ID4 = u.leeEntero("Introduce el ID del jugador a modificar");
			String pais = u.leeString("Introduce el nuevo pais del jugador");
			rj.modifyPais(ID4, pais);
			v.showModifyPlayer();
			SwitchMenuModifyPlayer(u.opcMenu5());
			break;
		case 5:
			v.showMainPlayer();
			SwitchMenuPlayer(u.opcMenu5());
			break;
		}
	}
	
	/**
	 * Muestra el menu principal de los equipos
	 * @param op que introduces para navegar por el menu
	 */
	private void SwitchMenuTeam(int op) {
		switch (op) {
		case 1:
			Equipo e = u.ReadEquipo();
			u.print("Introduce los jugadores que quieras en el equipo");
			re.AddEquipo(u.AddPlayers(e));
			v.showMainTeam();
			SwitchMenuTeam(u.opcMenu5());
			break;
		case 2:
			String nombre = u.leeString("Introduce el nombre del equipo");
			re.removeEquipo(nombre);
			v.showMainTeam();
			SwitchMenuTeam(u.opcMenu5());
			break;
		case 3:
			v.showModifyTeam();
			SwitchMenuModifyTeam(u.opcMenu3());
			break;
		case 4:
			re.showTeamsList(re.ShowTeams());
			v.showMainTeam();
			SwitchMenuTeam(u.opcMenu5());
			break;
		case 5:
			v.showMainMenu();
			SwitchMain(u.opcMenu3());
			break;
		}
	}
	
	private void SwitchMenuModifyTeam(int op) {
		switch (op) {
		case 1:
			String nombre = u.leeString("Introduce el nombre del equipo que quieres modificar");
			String color = u.leeString("Introduce el nuevo color del equipo");
			re.modifyColor(nombre, color);
			v.showModifyTeam();
			SwitchMenuModifyTeam(u.opcMenu3());
			break;
		case 2:
			String nombre2 = u.leeString("Introduce el nombre del equipo que quieres modificar");
			Integer nj = u.leeEntero("Introduce el nuevo numero de jugadores del equipo");
			re.modifyNPlayers(nombre2, nj);
			v.showModifyTeam();
			SwitchMenuModifyTeam(u.opcMenu3());
			break;
		case 3:
			v.showMainTeam();
			SwitchMenuTeam(u.opcMenu5());
			break;
		}
	}
	
	/**
	 * Muestra el menu principal de los torneos
	 * @param op que introduces para navegar por el menu
	 */
	private void SwitchMenuTorneos(int op) {
		switch (op) {
		case 1:
			rt.AddTorneo(u.ReadTorneo());
			v.showMainTorneos();
			SwitchMenuTorneos(u.opcMenu5());
			break;
		case 2:
			Integer id = u.leeEntero("Introduce el id del torneo");
			rt.removeTorneo(id);
			v.showMainTorneos();
			SwitchMenuTorneos(u.opcMenu5());
			break;
		case 3:
			v.showStartTorneo();
			SwitchStartTorneo(u.opcMenu4());
			break;
		case 4:
			rt.showTorneosList(rt.ShowTorneos());
			v.showStartTorneo();
			SwitchStartTorneo(u.opcMenu4());
			break;
		case 5:
			v.showMainMenu();
			SwitchMain(u.opcMenu3());
			break;
		}
	}
	
	/**
	 * Muestra el submenu de los torneos donde podremos empezar el torneo, ver los brackets y el menu de apostar
	 * @param op que introduces para navegar por el menu
	 */
	private void SwitchStartTorneo(int op) {
		switch (op) {
		case 1:
			Integer id = u.leeEntero("Introduce el ID del torneo que quieres comenzar");
			Torneo t = rt.getTorneo(id);
			p.PartidaAleatoria(t);
			break;
		case 2:
			Integer id2 = u.leeEntero("Introduce el ID del torneo que quieres ver los emparejamiento");
			Torneo torneo = rt.getTorneo(id2);
			p.verEmparejamientos(torneo);
			v.showStartTorneo();
			SwitchStartTorneo(u.opcMenu4());
			break;
		case 3:
			v.showMenuApuestas();
			SwitchMenuApuestas(u.opcMenu4());
			break;
		case 4:
			v.showMainTorneos();
			SwitchMenuTorneos(u.opcMenu5());
			break;
		}
	}
	
	/**
	 * Muestra el submenu para apostar en los torneos
	 * @param op que introduces para navegar por el menu
	 */
	private void SwitchMenuApuestas(int op) {
		switch (op) {
		case 1:
			Integer id = u.leeEntero("Introduce el ID del torneo al que quieres apostar");
			Torneo t = rt.getTorneo(id);
			rp.AddEquipo(u.makeApuesta(t));
			v.showMenuApuestas();
			SwitchMenuApuestas(u.opcMenu4());
			break;
		case 2:
			Integer id2 = u.leeEntero("Introduce el Numero de la apuesta que quieres eliminar");
			rp.removeEquipo(id2);
			v.showMenuApuestas();
			SwitchMenuApuestas(u.opcMenu4());
			break;
		case 3:
			Integer suma = rp.showApuestaList(rp.ShowApuestas());
			u.print("La suma del saldo total es " + suma);
			v.showMenuApuestas();
			SwitchMenuApuestas(u.opcMenu4());
			break;
		case 4:
			v.showStartTorneo();
			SwitchStartTorneo(u.opcMenu4());
			break;
		}
	}
	
	/**
	 * Programa principal que se encarga de llamar al menu principal y el mismo se encarga de llamar 
	 * a los otros metodos para poder ejecutar el programa
	 */
	public void run() {
		v.showMainMenu();
		SwitchMain(u.opcMenu4());
	}
}

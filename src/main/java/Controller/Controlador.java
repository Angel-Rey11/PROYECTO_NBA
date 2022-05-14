package Controller;

import Interfaces.IUtils;
import Interfaces.IVista;
import Utils.Utils;
import Vistas.Vistas;

public class Controlador {
	
	IVista vista = new Vistas();
	IUtils util = new Utils();
	
	private void SwitchMain(int op) {
		switch (op) {
		case 1:
			SwitchMenuPlayer(util.opcMenu4());
			break;
		case 2:
			SwitchMenuTeam(util.opcMenu4());
			break;
		case 3:
			SwitchMenuTorneos(util.opcMenu5());
			break;
		case 4:
			util.print("Gracias por utilizar nuestro programa");
			break;
		}
	}
	
	private void SwitchMenuPlayer(int op) {
		switch (op) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			vista.showMainMenu();
			SwitchMain(util.opcMenu3());
			break;
		}
	}
	
	private void SwitchMenuTeam(int op) {
		switch (op) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			vista.showMainMenu();
			SwitchMain(util.opcMenu3());
			break;
		}
	}
	
	private void SwitchMenuTorneos(int op) {
		switch (op) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			vista.showMainMenu();
			SwitchMain(util.opcMenu3());
			break;
		}
	}
}

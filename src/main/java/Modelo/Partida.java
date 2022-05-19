package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Partida {
	private ArrayList<Equipo> ladoizquierdo = new ArrayList<Equipo>();
	private ArrayList<Equipo> ladoderecho = new ArrayList<Equipo>();	
	
	public void PartidaAleatoria(Torneo t) {
		generaEmparejamientos(t);
		ArrayList<Equipo> ladoiz = new ArrayList<Equipo>();
		ArrayList<Equipo> ladoder = new ArrayList<Equipo>();
		Random r = new Random();
		int low = 50;
		int high = 140;
		int tamano = ladoizquierdo.size();
		//System.out.println(ladoizquierdo.get(0) + "vs" + ladoderecho.get(1));
		do {
			for (int i = 0; i < tamano/2; i++) {
				int result = r.nextInt(high-low) + low;
				int result2 = r.nextInt(high-low) + low;
				int result3 = r.nextInt(high-low) + low;
				int result4 = r.nextInt(high-low) + low;
				if (result<result2) {
					ladoiz.add(ladoizquierdo.get(1));
				} else if(result>result2) {
					ladoiz.add(ladoizquierdo.get(0));
				}
				if (result3<result4) {
					ladoder.add(ladoderecho.get(1));
				} else if(result3>result4) {
					ladoder.add(ladoderecho.get(0));
				}
				ladoizquierdo.remove(0);
				ladoderecho.remove(0);
				
			}
			//System.out.println(ladoiz.get(0) + "vs" + ladoiz.get(1));
		} while (ladoizquierdo.size()>1);
		ladoiz.add(ladoizquierdo.get(0));
		ladoder.add(ladoderecho.get(0));
		int result = r.nextInt(high-low) + low;
		int result2 = r.nextInt(high-low) + low;
			if(result<result2) {
				System.out.println("Ha ganado el equipo " + ladoiz.get(0));
			} else {
				System.out.println("Ha ganado el equipo " + ladoder.get(0));
			}
	}
	
	/**
	 * Metodo que genera los emparejamientos aleatoriamente dentro de un torneo
	 * @param t torneo del que queremos generar los emparejamientos para empezar ese torneo
	 */
	private void generaEmparejamientos(Torneo t) {
		ArrayList<Equipo> copia = t.getListaEquipos();
		Random r = new Random();
		int div = t.getListaEquipos().size()/2;
		for (int i = 0; i < t.getListaEquipos().size(); i++) {
			int low = 0;
			int high = copia.size();
			int result = r.nextInt(high-low) + low;
			int aleatorio2 = (int) (Math.random()+1);
			if (div>i) {
				ladoizquierdo.add(copia.get(result));
			} else {
				ladoderecho.add(copia.get(result));	
			}
		}
		System.out.println(ladoderecho);
		System.out.println(ladoizquierdo);
	}
}

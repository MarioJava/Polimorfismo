package com.itwall.mainapp;

import java.util.ArrayList;

import com.itwall.polimorfismo.Entrenador;
import com.itwall.polimorfismo.Futbolista;
import com.itwall.polimorfismo.Masajista;
import com.itwall.polimorfismo.SeleccionFutbol;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
		SeleccionFutbol sanPaoli = new Entrenador(1, "Jorge", "Sanpaoli", 55, 28489);
		SeleccionFutbol alexis = new Futbolista(2, "Niño", "Maravilla", 26, 6, "Delantero");
		SeleccionFutbol lola = new Masajista(3, "Lola", "Melnick", 31, "Licenciado en Fisioterapia", 18);

		integrantes.add(sanPaoli);
		integrantes.add(alexis);
		integrantes.add(lola);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();
		}

		// PARTIDO DE FUTBOL
		System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
		System.out.print(sanPaoli.getNombre() + " " + sanPaoli.getApellidos() + " -> ");
		((Entrenador) sanPaoli).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
		System.out.print(alexis.getNombre() + " " + alexis.getApellidos() + " -> ");
		((Futbolista) alexis).entrevista();

		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(lola.getNombre() + " " + lola.getApellidos() + " -> ");
		((Masajista) lola).darMasaje();

	}
}

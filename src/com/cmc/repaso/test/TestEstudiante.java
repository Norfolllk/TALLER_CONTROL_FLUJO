package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("María López");
		e1.calificar(9.5);
		System.out.println("Estudiante: " + e1.getNombre());
		System.out.println("Nota: " + e1.getNota());
		System.out.println("Resultado: " + e1.getResultado());

		System.out.println();

		Estudiante e2 = new Estudiante("Juan Pérez");
		e2.calificar(6.0);
		System.out.println("Estudiante: " + e2.getNombre());
		System.out.println("Nota: " + e2.getNota());
		System.out.println("Resultado: " + e2.getResultado());

		System.out.println();

		Estudiante e3 = new Estudiante("Ana Torres");
		e3.calificar(8.0);
		System.out.println("Estudiante: " + e3.getNombre());
		System.out.println("Nota: " + e3.getNota());
		System.out.println("Resultado: " + e3.getResultado());

	}

}

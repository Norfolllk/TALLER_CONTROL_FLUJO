package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {

		Validacion validacion = new Validacion();

		boolean resultado1 = validacion.validarMonto(150.50);
		System.out.println("Monto 150.50 -> ¿Es válido?: " + resultado1);

		boolean resultado2 = validacion.validarMonto(0);
		System.out.println("Monto 0 -> ¿Es válido?: " + resultado2);

		boolean resultado3 = validacion.validarMonto(-50);
		System.out.println("Monto -50 -> ¿Es válido?: " + resultado3);

	}

}
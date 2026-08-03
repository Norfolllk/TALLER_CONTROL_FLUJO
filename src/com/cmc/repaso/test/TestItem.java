package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {

		// Primer producto
		Item item1 = new Item();
		item1.setNombre("Teclado Mecánico");
		item1.setProductosActuales(20);

		System.out.println("========== Item 1: valores iniciales ==========");
		item1.imprimir();

		item1.vender(5);
		System.out.println("\n========== Item 1: después de vender 5 ==========");
		item1.imprimir();

		item1.devolver(2);
		System.out.println("\n========== Item 1: después de devolver 2 ==========");
		item1.imprimir();

		// Segundo producto
		Item item2 = new Item();
		item2.setNombre("Monitor 24 pulgadas");
		item2.setProductosActuales(20);

		System.out.println("\n========== Item 2: valores iniciales ==========");
		item2.imprimir();

		item2.vender(8);
		System.out.println("\n========== Item 2: después de vender 8 ==========");
		item2.imprimir();

		item2.devolver(3);
		System.out.println("\n========== Item 2: después de devolver 3 ==========");
		item2.imprimir();

	}

}
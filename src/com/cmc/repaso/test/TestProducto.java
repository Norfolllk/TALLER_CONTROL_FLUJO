package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {

		Producto p1 = new Producto("Mouse Inalámbrico", 25.0);
		System.out.println("Precio inicial: " + p1.getPrecio());

		p1.setPrecio(-30);
		System.out.println("Precio después de setPrecio(-30): " + p1.getPrecio());

		p1.setPrecio(40);
		System.out.println("Precio después de setPrecio(40): " + p1.getPrecio());

		double precioPromo = p1.calcularPrecioPromo(20);
		System.out.println("Precio con 20% de descuento: " + precioPromo);
		System.out.println("Precio original (sin cambios): " + p1.getPrecio());

	}

}
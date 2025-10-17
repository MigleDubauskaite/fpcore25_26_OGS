package com.miempresa.coredam2optproyecto0.model;

public class Animal {

	private String tipo;
	private double peso;
	private double precio;

	public Animal(String tipo, double peso, double precio) {
		this.tipo = tipo;
		this.peso = peso;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}
	
	

}

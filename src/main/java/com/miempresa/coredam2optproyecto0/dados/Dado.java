package com.miempresa.coredam2optproyecto0.dados;

import java.util.Random;

public class Dado {
	
	private int numero;
	private static Random random = new Random();

	public Dado(int numero) {
		this.numero = numero;
	}
	
	public static int dadoALazar() {
		
		int numeroRandom = random.nextInt(1, 7);
		
		return numeroRandom;
	}
	
}

package com.cenfotec.estrategia.mundo.conductas;

public class MoverVuelaVuela implements IMovimiento{
	
	@Override
	public void moverse() {
		
		System.out.println("Vuela, vuela, no te hace falta equipaje");
	}
}

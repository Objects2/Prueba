package com.cenfotec.estrategia.mundo.animales;

import com.cenfotec.estrategia.mundo.conductas.IMovimiento;
import com.cenfotec.estrategia.mundo.conductas.MoverVuelaVuela;

public class Aguila implements IMoverAnimal {
	IMovimiento controlMovimiento;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Aguila() {
		this.controlMovimiento = new MoverVuelaVuela();
	}

	@Override
	public void mover() {
		this.controlMovimiento.moverse();
	}
	
}

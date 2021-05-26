package com.ejercicioDelCurso.proyectoDePartidaFracciones;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public static Fraccion simplifica(Fraccion entrada) {
		return entrada; //PONGO ESTO POR EJEMPLO
	}

	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
		return sumando1; //Pongo esto por ejemplo
	}


/*
 * 	Añadir las siguientes operaciones a Fracción
 * 
 * 
 * 

	

	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
	}
*/
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}

}

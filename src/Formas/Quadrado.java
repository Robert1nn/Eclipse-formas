package Formas;

import Corpo.FormaBase;

public class Quadrado extends FormaBase{
	
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculoArea() {
		
		return lado * lado * lado * lado;
	}
	
	public double calculoPerimetro() {
		return lado + lado + lado + lado;
		
	}

}

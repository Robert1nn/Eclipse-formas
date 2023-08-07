package Formas;

import Corpo.FormaBase;

public class Triangulo extends FormaBase{
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public double calculoArea() {
		
		return 0.5 * (base * altura);
	}
	
	public double calculoPerimetro() {
		return lado1 + lado2 + lado3;
		
	}
	

}

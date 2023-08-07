package Formas;

import Corpo.FormaBase;

public class Circulo extends FormaBase{
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
		@Override
		public double calculoArea() {
			return Math.PI * raio * raio;
		}
		@Override
		public double calculoPerimetro() {
			return 2 * Math.PI * raio;
		}
}



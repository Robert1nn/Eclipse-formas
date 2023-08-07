package Formas;

public class Resultados {
	public static void main(String[] args) {
		
		Circulo bola = new Circulo(30.0);	
		Quadrado quadrado = new Quadrado(3.0);
		Triangulo triangulo = new Triangulo(10.0, 8.0, 5.0, 5.0, 5.0);
		
		
		
		System.out.println("Área do circulo: " + bola.calculoArea());
		System.out.println("Área do quadrado: " + quadrado.calculoArea());
		System.out.println("Área de triangulo: " + triangulo.calculoArea());
		System.out.println("Permetro do círculo: " + bola.calculoPerimetro());
		System.out.println("Perímetro do quadrado: " + quadrado.calculoPerimetro());
		System.out.println("Perímetro do triangulo: " + triangulo.calculoPerimetro());
	}

}

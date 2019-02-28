package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Circulo {
	
	protected double areaCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2); 
		return area;
	}
	
	protected double perimetroCirculo(double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
	
	
}

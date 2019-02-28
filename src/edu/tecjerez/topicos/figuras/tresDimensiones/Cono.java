package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Cono {
	
	protected double areaCono(double r, double g) {
		double area = Math.PI * r * g;
		return area;
	}
	
	private double perimetroCono(double radio) {
		double volumen = (1/3) * Math.PI * Math.pow(radio, 2);
		return volumen;	
	}
	
	
	

}

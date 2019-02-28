package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Elipse {

	private double areaElipse(double a, double b) {
		double area = Math.PI * a * b;
		return area;
	}
	
	private double perimetroElipse(double r, double s) {
		double perimetro = Math.PI * ( (3*(r+s)) - Math.sqrt( ((3*r) + s) * (r + (3*s)) ) );
		return perimetro;
	}
	
	
}

package edu.tecjerez.topicos.figuras;

public class Triangulo {
	//Metodo que calcule el area de un triangulo a traves de la formula de Heron
	
	// s = (a+b+c)/2
	// A = SQRT(s*(s-a)*(s-b)*(s-c)
	
	public double obtenerArea(double a, double b, double c) {
		
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	
	
	
}

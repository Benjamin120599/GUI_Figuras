package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Piramide {
	
	
	public double areaPiramide(double perimetro, double altura, double base) {
		double areaLateral = perimetro * altura;
		double areaBase = base * 2;
		double areaTotal = areaLateral + (2*areaBase);
		return areaTotal;
	}
	
	
	

}

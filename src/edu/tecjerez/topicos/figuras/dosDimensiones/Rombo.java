package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Rombo {
	
	double areaRombo(double D, double d) {
		double area = (D*d)/2;
		return area;
	}
	
	double perimetroRombo(double D, double d) {
		double L2 = Math.pow(D/2, 2) + Math.pow(d/2, 2);
		double perimetro = 4 * Math.sqrt(L2);
		return perimetro; 
	}
	

}

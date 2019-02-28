package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Piramide {
	
	
	public double areaPiramide(double perimetroBase, double altura, double base) {
		double areaLateral = perimetroBase * altura;
		double areaBase = base * 2;
		double areaTotal = areaLateral + (2*areaBase);
		return areaTotal;
	}
	
	public double volumenPiramide(double base, double altura) {
		double volumen = (1/3) * base * altura;
		return volumen;		
	}
	
	
	

}

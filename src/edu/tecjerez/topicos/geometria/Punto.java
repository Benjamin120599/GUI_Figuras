package edu.tecjerez.topicos.geometria;

public class Punto {
	//Metodo para calcular la distancia entre dos puntos
	
	int coorX;
	int coorY;
	
	
	public double obtenerDistancia(Punto p1, Punto p2) {
		return Math.sqrt(  Math.pow((p2.coorX - p1.coorX), 2) + Math.pow((p2.coorY - p1.coorY), 2) );
	}
	
}


class PuntoPrueba {  //Modificador de acceso DEFAULT
	
}
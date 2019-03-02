package edu.tecjerez.topicos.vista;

import javax.swing.*;
import edu.tecjerez.topicos.geometria.Punto;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	Font titulo = new Font("Times New Roman", Font.BOLD, 16);
	Font texto = new Font("Times New Roman", Font.PLAIN, 12);
	
	public VentanaPrincipal () {
		
		getContentPane().setLayout(null);
		setSize(660, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JPanel panel1 = new JPanel();
			panel1.setBounds(10, 10, 200, 340);
			panel1.setLayout(null);
			panel1.setVisible(true);
			panel1.setBackground(new Color(137, 216, 231));		
		add(panel1);
		
		JPanel panel2 = new JPanel();
			panel2.setBounds(220, 10, 200, 340);
			panel2.setLayout(null);
			panel2.setVisible(true);
			panel2.setBackground(new Color(231, 128, 107));
		add(panel2);
		
		JPanel panel3 = new JPanel();
			panel3.setBounds(430, 10, 200, 340);
			panel3.setLayout(null);
			panel3.setVisible(true);
			panel3.setBackground(new Color(161, 231, 137));
		add(panel3);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Punto p1 = new Punto();
		
		//PuntoPrueba pp = new PuntoPrueba();
		/*
		 * No se puede usar la clase PuntoPrueba ya que no
		 * es publica y ademas esta en otro paquete
		 */
		
		double dist = p1.obtenerDistancia(new Punto(), new Punto());
		
	}

}

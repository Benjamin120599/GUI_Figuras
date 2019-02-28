
import javax.swing.SwingUtilities;

import edu.tecjerez.topicos.vista.*;

public class PruebaFiguras {

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaPrincipal();
			}
		});
			
	}

}

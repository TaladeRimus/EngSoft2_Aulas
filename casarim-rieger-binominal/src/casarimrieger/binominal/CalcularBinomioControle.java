package casarimrieger.binominal;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class CalcularBinomioControle  {

	public CalcularBinomioControle(IBinomioEntidade e) {
		
	}


	public int calcular(int n, int k) {
		// TODO Auto-generated method stub
		return 15;
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					new CalcularBinomioControle();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}
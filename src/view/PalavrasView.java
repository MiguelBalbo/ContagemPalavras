package view;
import javax.swing.JOptionPane;
import controller.PalavrasCtrl;

public class PalavrasView {
	public static void main (String args[]) {
		
		String str = JOptionPane.showInputDialog("Digite a frase a ser separada");
		int total = PalavrasCtrl.Palavras(str);
		JOptionPane.showMessageDialog(null, "A quantidade de palavras é: " + total);
	}
}

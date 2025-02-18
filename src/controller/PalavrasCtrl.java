package controller;

public class PalavrasCtrl {
	public PalavrasCtrl() {
		super();
	}
	public static int Palavras (String Palavra) {
		String[] Palavras = Palavra.split(";");
		return Palavras.length;
	}
}

package control;

import model.Jogo;

public class ControleJogo {

	public static Jogo criaJogo(String selecao1, int valor1, String selecao2, int valor2) {

		Jogo jogo = new Jogo(selecao1, valor1, selecao2, valor2);
		return jogo;
	}

}

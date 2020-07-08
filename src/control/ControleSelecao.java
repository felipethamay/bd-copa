package control;

import model.Selecao;

public class ControleSelecao {

	public Selecao criaSelecao(String nome, int pontos, int golsPro, int golsContra, int saldoGol) {
		Selecao selecao = new Selecao(nome, pontos, golsPro, golsContra, saldoGol);
		return selecao;
	}

}

package control;

import model.Grupo;

public class ControleGrupo {

	public Grupo criaGrupo(String letra, String selecao1, String selecao2, String selecao3, String selecao4) {

		Grupo grupo = new Grupo(letra, selecao1, selecao2, selecao3, selecao4);
		return grupo;

	}
}

package model;

public class Grupo {

	private String letra;
	private String selecao1;
	private String selecao2;
	private String selecao3;
	private String selecao4;

	public Grupo(String letra, String selecao1, String selecao2, String selecao3, String selecao4) {
		super();
		this.letra = letra;
		this.selecao1 = selecao1;
		this.selecao2 = selecao2;
		this.selecao3 = selecao3;
		this.selecao4 = selecao4;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getSelecao1() {
		return selecao1;
	}

	public void setSelecao1(String selecao1) {
		this.selecao1 = selecao1;
	}

	public String getSelecao2() {
		return selecao2;
	}

	public void setSelecao2(String selecao2) {
		this.selecao2 = selecao2;
	}

	public String getSelecao3() {
		return selecao3;
	}

	public void setSelecao3(String selecao3) {
		this.selecao3 = selecao3;
	}

	public String getSelecao4() {
		return selecao4;
	}

	public void setSelecao4(String selecao4) {
		this.selecao4 = selecao4;
	}

}

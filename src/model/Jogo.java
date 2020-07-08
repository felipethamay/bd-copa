package model;

public class Jogo {

	private String selecao1;
	private int valor1;
	private String selecao2;
	private int valor2;

	public Jogo(String selecao1, int valor1, String selecao2, int valor2) {
		super();
		this.selecao1 = selecao1;
		this.valor1 = valor1;
		this.selecao2 = selecao2;
		this.valor2 = valor2;
	}

	public String getSelecao1() {
		return selecao1;
	}

	public void setSelecao1(String selecao1) {
		this.selecao1 = selecao1;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public String getSelecao2() {
		return selecao2;
	}

	public void setSelecao2(String selecao2) {
		this.selecao2 = selecao2;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public boolean equals(String sel1, String sel2) {
		boolean result;

		if (sel1.equalsIgnoreCase(this.getSelecao1()) && sel2.equalsIgnoreCase(this.getSelecao2())) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public boolean equals(Object jog) {
		if (!(jog instanceof Jogo))
			return false;
		Jogo jogo = (Jogo) jog;
		return (jogo.getSelecao1().equalsIgnoreCase(this.getSelecao1())
				&& jogo.getSelecao2().equalsIgnoreCase(this.getSelecao2()));
	}

}

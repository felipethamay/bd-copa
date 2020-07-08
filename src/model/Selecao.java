package model;

public class Selecao {

	private String nome;
	private int pontos;
	private int golsPro;
	private int golsContra;
	private int saldoGol;

	public Selecao(String nome, int pontos, int golsPro, int golsContra, int saldoGol) {
		super();
		this.nome = nome;
		this.pontos = pontos;
		this.golsPro = golsPro;
		this.golsContra = golsContra;
		this.saldoGol = saldoGol;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getGolsPro() {
		return golsPro;
	}

	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}

	public int getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}

	public int getSaldoGol() {
		return saldoGol;
	}

	public void setSaldoGol(int saldoGol) {
		this.saldoGol = saldoGol;
	}

}

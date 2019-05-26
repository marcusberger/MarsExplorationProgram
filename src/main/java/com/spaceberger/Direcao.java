package com.spaceberger;

public enum Direcao {

	NORTE("norte"), SUL("sul"), LESTE("leste"), OESTE("oeste");

	private String nome;

	private Direcao(String direcao) {
		this.nome = direcao;
	}

	public String getNome() {
		return nome;
	}
	
	public static Direcao getDirecao(String direcao) {
		switch (direcao) {
		case "n":
			return Direcao.NORTE;
		case "s":
			return Direcao.SUL;
		case "l":
			return Direcao.LESTE;
		case "o":
			return Direcao.OESTE;
		default:
			return Direcao.NORTE;
		}

	}

}

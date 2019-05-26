package com.spaceberger;

public class DirecaoFactory {
	public Direcao getDirecao(String direcao) {
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

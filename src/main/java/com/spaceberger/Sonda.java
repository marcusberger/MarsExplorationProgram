package com.spaceberger;

public class Sonda {

	private Direcao direcao;
	private Coordenada coordenada;
	private Planalto planalto;

	public Sonda(Coordenada coordenada, Direcao direcao) {
		this.coordenada = coordenada;
		this.direcao = direcao;

	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public void obtendoInformacaoPlanalto(Planalto planalto) {
		this.planalto = planalto;
	}

	@Override
	public String toString() {
		return coordenada + " " + direcao;
	}

}
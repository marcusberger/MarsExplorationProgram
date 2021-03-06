package com.spaceberger;

public class Planalto {

	private int limiteX;
	private int limiteY;

	public Planalto(int limiteX, int limiteY) {
		this.limiteX = limiteX;
		this.limiteY = limiteY;
	}

	public int getLimiteX() {
		return limiteX;
	}

	public void setLimiteX(int limiteX) {
		this.limiteX = limiteX;
	}

	public int getLimiteY() {
		return limiteY;
	}

	public void setLimiteY(int limiteY) {
		this.limiteY = limiteY;
	}

	public boolean coordenadasDentroPlanalto(Coordenada coordenada) {
		if (coordenada.getX() > getLimiteX() || coordenada.getY() > getLimiteY() || coordenada.getX() < 0
				|| coordenada.getY() < 0) {
			return false;
		}
		return true;

	}
}

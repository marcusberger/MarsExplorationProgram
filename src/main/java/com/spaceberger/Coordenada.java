package com.spaceberger;

public class Coordenada {
	private int x;
	private int y;

	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void incrementaX() {
		this.x += 1;
	}

	public void incrementaY() {
		this.y += 1;
	}

	public void decrementaX() {
		this.x -= 1;
	}

	public void decrementaY() {
		this.y -= 1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return x +" " + y;
	}

}

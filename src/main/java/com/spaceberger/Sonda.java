package com.spaceberger;

public class Sonda {

	private String direcao;
	private int x, y;
	
	public Sonda(int x, int y, String direcao) {
		this.x = x;
		this.y = y;
		this.direcao = direcao;

	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
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

	public void vira90Esquerda() {
		if (direcao.equals("n")) {
			direcao = "o";
		} else if (direcao.equals("s")) {
			direcao = "l";
		} else if (direcao.equals("o")) {
			direcao = "s";
		} else if (direcao.equals("l")) {
			direcao = "n";
		}
	}

	public void vira90Direita() {
		if (direcao.equals("n")) {
			direcao = "l";
		} else if (direcao.equals("l")) {
			direcao = "s";
		} else if (direcao.equals("s")) {
			direcao = "o";
		} else if (direcao.equals("o")) {
			direcao = "n";
		}

	}

	public void moverFrente() {
		if (direcao.equals("n")) {
			y += 1;
		} else if (direcao.equals("l")) {
			x += 1;
		} else if (direcao.equals("s")) {
			y -= 1;
		} else if (direcao.equals("o")) {
			x -= 1;
		}
	}

	public void executarComandos(char[] comandos) {
		for (char lrm : comandos) {

			switch (lrm) {
			case 'l':
				this.vira90Esquerda();
				break;
			case 'r':
				this.vira90Direita();
				break;
			case 'm':
				this.moverFrente();
				break;
			default:
				break;
			}
		}

	}

	@Override
	public String toString() {

		return x + " " + y + " " + direcao;
	}
}
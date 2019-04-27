package com.spaceberger;

public class Sonda {

	String direcao;
	int x, y;
	
	public Sonda(int x, int y, String direcao) {
		this.x = x;
		this.y = y;
		this.direcao = direcao;
		
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

	@Override
	public String toString() {

		return x + " " + y + " " + direcao;
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
}
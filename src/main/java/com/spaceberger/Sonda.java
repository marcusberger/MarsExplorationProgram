package com.spaceberger;

public class Sonda {

	private Direcao direcao;
	private int x, y;
	private Planalto planalto;

	public Sonda(int x, int y, Direcao direcao) {
		this.x = x;
		this.y = y;
		this.direcao = direcao;

	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
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
		if (direcao.equals(Direcao.NORTE)) {
			direcao = Direcao.OESTE;
		} else if (direcao.equals(Direcao.SUL)) {
			direcao = Direcao.LESTE;
		} else if (direcao.equals(Direcao.OESTE)) {
			direcao = Direcao.SUL;
		} else if (direcao.equals(Direcao.LESTE)) {
			direcao = Direcao.NORTE;
		}
	}

	public void vira90Direita() {
		if (direcao.equals(Direcao.NORTE)) {
			direcao = Direcao.LESTE;
		} else if (direcao.equals(Direcao.LESTE)) {
			direcao = Direcao.SUL;
		} else if (direcao.equals(Direcao.SUL)) {
			direcao = Direcao.OESTE;
		} else if (direcao.equals(Direcao.OESTE)) {
			direcao = Direcao.NORTE;
		}

	}

	public void moverFrente() {
		if (direcao.equals(Direcao.NORTE)) {
			y += 1;
		} else if (direcao.equals(Direcao.LESTE)) {
			x += 1;
		} else if (direcao.equals(Direcao.SUL)) {
			y -= 1;
		} else if (direcao.equals(Direcao.OESTE)) {
			x -= 1;
		}
		
		if (planalto != null) {
			boolean ok = planalto.coordenadasDentroPlanalto(x, y);
			if (ok == false) {
				System.out.println("A sonda saiu do planalto");
			}
		}
	}

	public void obtendoInformacaoPlanalto(Planalto planalto) {
		this.planalto = planalto;
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
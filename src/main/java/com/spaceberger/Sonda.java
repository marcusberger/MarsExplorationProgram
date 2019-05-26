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
			coordenada.incrementaY();
		} else if (direcao.equals(Direcao.LESTE)) {
			coordenada.incrementaX();
		} else if (direcao.equals(Direcao.SUL)) {
			coordenada.decrementaY();
		} else if (direcao.equals(Direcao.OESTE)) {
			coordenada.decrementaX();
		}
		
		if (planalto != null) {
			boolean ok = planalto.coordenadasDentroPlanalto(coordenada);
			if (ok == false) {
				System.out.println("A sonda saiu do planalto");
			}
		}
	}

	public void obtendoInformacaoPlanalto(Planalto planalto) {
		this.planalto = planalto;
	}

	public void executarComandos(Comando[] comandos) {
		for (Comando lrm : comandos) {

			switch (lrm) {
			case ESQUERDA:
				this.vira90Esquerda();
				break;
			case DIREITA:
				this.vira90Direita();
				break;
			case MOVER:
				this.moverFrente();
				break;
			default:
				break;
			}
		}

	}

	@Override
	public String toString() {
		return coordenada + " " + direcao;
	}

}
package com.spaceberger;

public enum Direcao {

	NORTE("norte") {
		public void mover(Coordenada c) {
			c.incrementaY();
		}

		public Direcao virarEsquerda() {
			return Direcao.OESTE;
		}

		public Direcao virarDireita() {
			return Direcao.LESTE;
		}
	},
	SUL("sul") {
		public void mover(Coordenada c) {
			c.decrementaY();
		}

		public Direcao virarEsquerda() {
			return Direcao.LESTE;
		}

		public Direcao virarDireita() {
			return Direcao.OESTE;
		}
	},
	LESTE("leste") {
		public void mover(Coordenada c) {
			c.incrementaX();
		}

		public Direcao virarEsquerda() {
			return Direcao.NORTE;
		}

		public Direcao virarDireita() {
			return Direcao.SUL;
		}
	},
	OESTE("oeste") {
		public void mover(Coordenada c) {
			c.decrementaX();
		}

		public Direcao virarEsquerda() {
			return Direcao.SUL;
		}

		public Direcao virarDireita() {
			return Direcao.NORTE;
		}
	};

	private String nome;

	private Direcao(String direcao) {
		this.nome = direcao;
	}

	public String getNome() {
		return nome;
	}
	
	abstract public void mover(Coordenada c);
	abstract public Direcao virarEsquerda();
	abstract public Direcao virarDireita();

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

package com.spaceberger;

public enum Comando {

	MOVER("m") {
		@Override
		public void executa(Sonda sonda) {
			Direcao d = sonda.getDirecao();
			Coordenada c = sonda.getCoordenada();
			d.mover(c);
		}
	},
	ESQUERDA("l") {
		@Override
		public void executa(Sonda sonda) {
			Direcao d = sonda.getDirecao();
			sonda.setDirecao(d.virarEsquerda());
		}
	},
	DIREITA("r") {
		@Override
		public void executa(Sonda sonda) {
			Direcao d = sonda.getDirecao();
			sonda.setDirecao(d.virarDireita());
		}
	};
	
	abstract public void executa(Sonda sonda);
	
	private String nome;

	private Comando(String comando) {
		this.nome = comando;

	}

	public String getNome() {
		return nome;
	}

	public static Comando getComando(char strComandos) {
		switch (strComandos) {
		case 'm':
			return Comando.MOVER;
		case 'l':
			return Comando.ESQUERDA;
		case 'r':
			return Comando.DIREITA;
		default:
			return Comando.MOVER;
		}

	}

}

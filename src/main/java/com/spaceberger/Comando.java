package com.spaceberger;

public enum Comando {

	MOVER("m"), ESQUERDA("l"), DIREITA("r");

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

package com.spaceberger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceComUsuario {
	Sonda sonda = new Sonda(new Coordenada(5, 5), Direcao.NORTE);

	public Planalto lerInformacoesPlanalto() {
		Scanner input = null;
		for (;;) {
			try {
				input = new Scanner(System.in);
				System.out.println("digite maximo de x e y: ");

				int limiteX = input.nextInt();
				int limiteY = input.nextInt();

				Planalto planalto = new Planalto(limiteX, limiteY);

				return planalto;
			} catch (InputMismatchException erro) {
				System.out.println("Digite um valor numérico");
			}
		}
	}

	public Sonda lerInformacoesSonda() {
		Scanner input = null;
		for (;;) {
			try {
				input = new Scanner(System.in);
				System.out.println("Digite as coordenadas iniciais: ");
				int x = input.nextInt();
				int y = input.nextInt();
				System.out.println("Digite a direcao: ");
				Direcao direcao = Direcao.getDirecao(input.next());
				return new Sonda(new Coordenada(x, y), direcao);
			} catch (InputMismatchException erro) {
				System.out.println("Digite um valor numérico");
			}
		}
	}

	public Comando[] lerComandosTela() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um comando para a Sonda: ");

		char[] strComandos = input.next().toCharArray();
		// cria um array de comandos vazio
		Comando[] comandos = new Comando[strComandos.length];
		for (int i = 0; i < strComandos.length; i++) {
			// converte char para um Comando
			Comando comando = Comando.getComando(strComandos[i]);
			// add um comando no array
			comandos[i] = comando;
		}
		return comandos;
	}
}

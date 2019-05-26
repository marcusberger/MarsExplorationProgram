package com.spaceberger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceComUsuario {
	Sonda sonda = new Sonda(new Coordenada(5, 5) , Direcao.NORTE);

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
				Direcao direcao = new DirecaoFactory().getDirecao(input.next());
				return new Sonda(new Coordenada(x, y), direcao);
			} catch (InputMismatchException erro) {
				System.out.println("Digite um valor numérico");
			}
		}
	}

	public char[] lerComandosTela() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um comando para a Sonda: ");
		return input.next().toCharArray();
	}
}

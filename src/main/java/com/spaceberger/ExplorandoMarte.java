package com.spaceberger;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class ExplorandoMarte {

	public static void main(String[] args) {

		Comandos comando = new Comandos();

		Planalto planalto = comando.lerTamanhoPlanalto();
		Sonda sonda = comando.lerInformacoesSonda();
		char comandos[] = comando.lerComandosTela();
		sonda.executarComandos(comandos);

	

		// colocar N sondas
		// caso a sonda saia do mapa
		// colisao entre as sondas
		// executar comandos

		// saida

		System.out.println(sonda);

	}

}

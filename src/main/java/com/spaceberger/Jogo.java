package com.spaceberger;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Jogo {
	
	static int tamanhoX, tamanhoY;
	static char[] comando;
	
	public static void obtendoComandos(Sonda sonda) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Digite um comando para a Sonda: ");
			comando = input.next().toCharArray();
			System.out.println(comando);
			for(char lrm : comando) {
				
				switch(lrm) {
				case 'l':
					sonda.vira90Esquerda();
					System.out.println("virando para esquerda");
					break;
				case 'r':
					sonda.vira90Direita();
					System.out.println("virando para direita");
					break;
				case 'm':
					sonda.moverFrente();
					imprimeSonda(sonda);
					System.out.println("movendo para frente");
					break;
				default:
					break;
				}
			}
		} catch (InputMismatchException erro) {
			System.out.println("Digite um comando valido");
		}
	}
	
	public static void obtendoTamanhoMapa() {
		Scanner input = null;
		for(;;) { 
			boolean ok = false;
			try {
				input = new Scanner(System.in);
				System.out.println("digite maximo de x: ");
				tamanhoX = input.nextInt();
				System.out.println("digite maximo de y: ");
				tamanhoY = input.nextInt();
				ok = true;
			}catch (InputMismatchException erro) {
				System.out.println("Digite um valor numérico");
			}
			if(ok) {
				break;
			}
		}
	}
	
	public static void obtendoCoordernadasIniciaisEDirecaoSonda(Sonda sonda) {
		Scanner input = null;
		for(;;) { 
			boolean ok = false;
			try {
				input = new Scanner(System.in);
				System.out.println("digite x: ");
				sonda.x = input.nextInt();
				
				System.out.println("digite y: ");
				sonda.y = input.nextInt();
				
				System.out.println("Digite a direcao: ");
				
				sonda.direcao = input.next();
				
				ok = true;
			}catch (InputMismatchException erro) {
				System.out.println("Digite um valor numérico");
			}
			if(ok) {
				break;
			}
		}
	}
	
	public static void imprimeSonda(Sonda sonda) {
		System.out.println(sonda.x);
		System.out.println(sonda.y);
		System.out.println(sonda.direcao);
	}
	
	public static void main(String[] args) {
		Sonda sonda = new Sonda();

		//ler tamanho mapa
		obtendoTamanhoMapa();
		
		//ler coordenadas iniciais e direcao
		obtendoCoordernadasIniciaisEDirecaoSonda(sonda);
	
		//ler comandos
		obtendoComandos(sonda);
		//separar metodo de ler comando e executar comando
		//colocar N sondas
		//caso a sonda saia do mapa
		//colisao entre as sondas
		//executar comandos
		
		//saida
		
		//imprimir coordenadas e direcao da sonda
		imprimeSonda(sonda);
		
		
		
		
		
	}

}

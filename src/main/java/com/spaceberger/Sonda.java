package com.spaceberger;

public class Sonda {
	
	String direcao;
	int x, y;
	
	
	
	public void vira90Esquerda() {
		if(direcao.equals("n")) {
			direcao = "o";
		}else if(direcao.equals("s")) {
			direcao = "l";
		}else if(direcao.equals("o")) {
			direcao = "s";
		}else if (direcao.equals("l")) {
			direcao = "n";
		}
	}
	
	public void  vira90Direita() {
		if(direcao.equals("n")) {
			direcao = "l";
		}else if(direcao.equals("l")) {
			direcao = "s";
		}else if(direcao.equals("s")) {
			direcao = "o";
		}else if(direcao.equals("o")) {
			direcao = "n";
		}
		
	}
	
	public void moverFrente() {
		if(direcao.equals("n")) {
			y += 1;
		}else if(direcao.equals("l")) {
			x += 1;
		}else if(direcao.equals("s")) {
			y -= 1;
		}else if(direcao.equals("o")) {
			x -= 1;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Sonda sonda = new Sonda();
		
		sonda.x = 5;
		sonda.y = 6;
		
		sonda.direcao = "n";
		sonda.moverFrente();
		System.out.println(sonda.direcao);
		System.out.println("x: "+ sonda.x);
		System.out.println("y: "+ sonda.y);
		
		
		
		
		
		
	
	
	}
}
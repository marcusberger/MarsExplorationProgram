package com.spaceberger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SondaTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testVira90Esquerda() {
		Sonda sonda = new Sonda(5, 5, Direcao.NORTE);
		sonda.vira90Esquerda();
		Assert.assertEquals(Direcao.OESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.LESTE);
		sonda.vira90Esquerda();
		Assert.assertEquals(Direcao.NORTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.SUL);
		sonda.vira90Esquerda();
		Assert.assertEquals(Direcao.LESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.OESTE);
		sonda.vira90Esquerda();
		Assert.assertEquals(Direcao.SUL, sonda.getDirecao());
	}

	public void testVira90Direita() {
		Sonda sonda = new Sonda(5, 5, Direcao.NORTE);
		sonda.vira90Direita();
		Assert.assertEquals(Direcao.LESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.LESTE);
		sonda.vira90Direita();
		Assert.assertEquals(Direcao.SUL, sonda.getDirecao());

		sonda.setDirecao(Direcao.SUL);
		sonda.vira90Direita();
		Assert.assertEquals(Direcao.OESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.OESTE);
		sonda.vira90Direita();
		Assert.assertEquals(Direcao.NORTE, sonda.getDirecao());
	}

	public void testMoverFrente() {
		Sonda sonda = new Sonda(5, 5, Direcao.NORTE);
		sonda.moverFrente();

		Assert.assertEquals(5, sonda.getX());
		Assert.assertEquals(6, sonda.getY());

		sonda.setX(5);
		sonda.setY(5);
		sonda.setDirecao(Direcao.SUL);
		sonda.moverFrente();
		Assert.assertEquals(5, sonda.getX());
		Assert.assertEquals(4, sonda.getY());

		sonda.setX(5);
		sonda.setY(5);
		sonda.setDirecao(Direcao.OESTE);
		sonda.moverFrente();
		Assert.assertEquals(4, sonda.getX());
		Assert.assertEquals(5, sonda.getY());

		sonda.setX(5);
		sonda.setY(5);
		sonda.setDirecao(Direcao.LESTE);
		sonda.moverFrente();
		Assert.assertEquals(6, sonda.getX());
		Assert.assertEquals(5, sonda.getY());

	}

	public void testExecutarComandos() {
		Sonda sonda = new Sonda(1, 2, Direcao.NORTE);
		String comandos = "l";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals(Direcao.OESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.LESTE);
		comandos = "r";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals(Direcao.SUL, sonda.getDirecao());

		sonda.setDirecao(Direcao.NORTE);
		comandos = "m";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals(3, sonda.getY());
		Assert.assertEquals(1, sonda.getX());

		sonda.setX(3);
		sonda.setY(3);
		sonda.setDirecao(Direcao.LESTE);
		comandos = "mmrmmrmrrm";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals(5, sonda.getX());
		Assert.assertEquals(1, sonda.getY());
		Assert.assertEquals(Direcao.LESTE, sonda.getDirecao());

	}

}

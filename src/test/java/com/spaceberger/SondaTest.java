package com.spaceberger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SondaTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testVira90Esquerda() {
		Sonda sonda = new Sonda(5, 5, "n");
		sonda.vira90Esquerda();
		Assert.assertEquals("o", sonda.getDirecao());

		sonda.setDirecao("l");
		sonda.vira90Esquerda();
		Assert.assertEquals("n", sonda.getDirecao());

		sonda.setDirecao("s");
		sonda.vira90Esquerda();
		Assert.assertEquals("l", sonda.getDirecao());

		sonda.setDirecao("o");
		sonda.vira90Esquerda();
		Assert.assertEquals("s", sonda.getDirecao());
	}

	public void testVira90Direita() {
		Sonda sonda = new Sonda(5, 5, "n");
		sonda.vira90Direita();
		Assert.assertEquals("l", sonda.getDirecao());

		sonda.setDirecao("l");
		sonda.vira90Direita();
		Assert.assertEquals("s", sonda.getDirecao());

		sonda.setDirecao("s");
		sonda.vira90Direita();
		Assert.assertEquals("o", sonda.getDirecao());

		sonda.setDirecao("o");
		sonda.vira90Direita();
		Assert.assertEquals("n", sonda.getDirecao());
	}

	public void testMoverFrente() {
		Sonda sonda = new Sonda(5, 5, "n");
		sonda.moverFrente();

		Assert.assertEquals(5, sonda.getX());
		Assert.assertEquals(6, sonda.getY());

		sonda.setX(5);
		sonda.setY(5);
		sonda.setDirecao("s");
		sonda.moverFrente();
		Assert.assertEquals(5, sonda.getX());
		Assert.assertEquals(4, sonda.getY());

		sonda.setX(5);
		sonda.setY(5);
		sonda.setDirecao("o");
		sonda.moverFrente();
		Assert.assertEquals(4, sonda.getX());
		Assert.assertEquals(5, sonda.getY());

		sonda.setX(5);
		sonda.setY(5);
		sonda.setDirecao("l");
		sonda.moverFrente();
		Assert.assertEquals(6, sonda.getX());
		Assert.assertEquals(5, sonda.getY());

	}

	public void testExecutarComandos() {
		Sonda sonda = new Sonda(1, 2, "n");
		String comandos = "l";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals("o", sonda.getDirecao());

		sonda.setDirecao("l");
		comandos = "r";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals("s", sonda.getDirecao());

		sonda.setDirecao("n");
		comandos = "m";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals(3, sonda.getY());
		Assert.assertEquals(1, sonda.getX());

		sonda.setX(3);
		sonda.setY(3);
		sonda.setDirecao("l");
		comandos = "mmrmmrmrrm";
		sonda.executarComandos(comandos.toCharArray());
		Assert.assertEquals(5, sonda.getX());
		Assert.assertEquals(1, sonda.getY());
		Assert.assertEquals("l", sonda.getDirecao());

	}

}

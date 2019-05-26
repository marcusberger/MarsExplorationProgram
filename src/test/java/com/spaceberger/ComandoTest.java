package com.spaceberger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ComandoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testVira90Esquerda() {
		Coordenada posicao = new Coordenada(5, 5);
		Sonda sonda = new Sonda(posicao, Direcao.NORTE);
		
		Comando cmd = Comando.getComando('l');
		cmd.executa(sonda);
		
		Assert.assertEquals(Direcao.OESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.LESTE);
		cmd = Comando.getComando('l');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.NORTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.SUL);
		cmd = Comando.getComando('l');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.LESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.OESTE);
		cmd = Comando.getComando('l');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.SUL, sonda.getDirecao());
	}

	public void testVira90Direita() {
		Coordenada posicao = new Coordenada(5, 5);
		Sonda sonda = new Sonda(posicao, Direcao.NORTE);
		Comando cmd = Comando.getComando('r');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.LESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.LESTE);
		cmd = Comando.getComando('r');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.SUL, sonda.getDirecao());

		sonda.setDirecao(Direcao.SUL);
		cmd = Comando.getComando('r');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.OESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.OESTE);
		cmd = Comando.getComando('r');
		cmd.executa(sonda);
		Assert.assertEquals(Direcao.NORTE, sonda.getDirecao());
	}

	public void testMoverFrente() {
		Coordenada posicao = new Coordenada(5, 5);
		Sonda sonda = new Sonda(posicao, Direcao.NORTE);
		Comando cmd = Comando.getComando('m');
		cmd.executa(sonda);

		Assert.assertEquals(5, sonda.getCoordenada().getX());
		Assert.assertEquals(6, sonda.getCoordenada().getY());

		sonda.getCoordenada().setX(5);
		sonda.getCoordenada().setY(5);
		sonda.setDirecao(Direcao.SUL);
		cmd = Comando.getComando('m');
		cmd.executa(sonda);
		Assert.assertEquals(5, sonda.getCoordenada().getX());
		Assert.assertEquals(4, sonda.getCoordenada().getY());

		sonda.getCoordenada().setX(5);
		sonda.getCoordenada().setY(5);
		sonda.setDirecao(Direcao.OESTE);
		cmd = Comando.getComando('m');
		cmd.executa(sonda);
		Assert.assertEquals(4, sonda.getCoordenada().getX());
		Assert.assertEquals(5, sonda.getCoordenada().getY());

		sonda.getCoordenada().setX(5);
		sonda.getCoordenada().setY(5);
		sonda.setDirecao(Direcao.LESTE);
		cmd = Comando.getComando('m');
		cmd.executa(sonda);
		Assert.assertEquals(6, sonda.getCoordenada().getX());
		Assert.assertEquals(5, sonda.getCoordenada().getY());

	}

	public void testExecutarComandos() {
		Coordenada posicao = new Coordenada(1, 2);
		Sonda sonda = new Sonda(posicao, Direcao.NORTE);
		Comando[] comandos = { Comando.ESQUERDA };
		for (Comando cmd : comandos) {
			cmd.executa(sonda);
		}
		Assert.assertEquals(Direcao.OESTE, sonda.getDirecao());

		sonda.setDirecao(Direcao.LESTE);
		Comando[] comandos1 = { Comando.DIREITA };
		for (Comando cmd : comandos1) {
			cmd.executa(sonda);
		}
		Assert.assertEquals(Direcao.SUL, sonda.getDirecao());

		sonda.setDirecao(Direcao.NORTE);
		Comando[] comandos2 = { Comando.MOVER };
		for (Comando cmd : comandos2) {
			cmd.executa(sonda);
		}
		Assert.assertEquals(3, sonda.getCoordenada().getY());
		Assert.assertEquals(1, sonda.getCoordenada().getX());

		sonda.getCoordenada().setX(3);
		sonda.getCoordenada().setY(3);
		sonda.setDirecao(Direcao.LESTE);
		Comando[] comandos3 = { Comando.MOVER, Comando.MOVER, Comando.DIREITA, Comando.MOVER, Comando.MOVER,
				Comando.DIREITA, Comando.MOVER, Comando.DIREITA, Comando.DIREITA, Comando.MOVER };
		for (Comando cmd : comandos3) {
			cmd.executa(sonda);
		}
		Assert.assertEquals(5, sonda.getCoordenada().getX());
		Assert.assertEquals(1, sonda.getCoordenada().getY());
		Assert.assertEquals(Direcao.LESTE, sonda.getDirecao());

	}

}

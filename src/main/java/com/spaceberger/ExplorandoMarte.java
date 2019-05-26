package com.spaceberger;

public class ExplorandoMarte {

	public static void main(String[] args) {

		InterfaceComUsuario interfaceComUsuario = new InterfaceComUsuario();
		Planalto planalto = interfaceComUsuario.lerInformacoesPlanalto();
		Sonda sonda = interfaceComUsuario.lerInformacoesSonda();
		sonda.obtendoInformacaoPlanalto(planalto);
		Comando comandos[] = interfaceComUsuario.lerComandosTela();
		sonda.executarComandos(comandos);
		System.out.println(sonda);

	}
}

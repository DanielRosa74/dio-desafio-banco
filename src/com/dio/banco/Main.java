package com.dio.banco;

public class Main {

	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		
		Conta cc = new ContaCorrente(daniel);
		Conta poupanca = new ContaPoupanca(daniel);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

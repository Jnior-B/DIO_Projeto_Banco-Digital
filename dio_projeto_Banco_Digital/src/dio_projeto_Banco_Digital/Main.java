package dio_projeto_Banco_Digital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente clt = new Cliente();
		clt.setNome("Junior Bamba. M");
		
		Conta cc = new ContaCorrente(clt);
		Conta cp = new ContaPoupanca(clt);
		cp.depositar(1450);
		cp.depositar(1000);
		cp.sacar(450);
		
		cc.sacar(575);
		cc.depositar(850);
		
		Cliente clt1 = new Cliente();
		clt1.setNome("Yves Sakuba. M");
		Conta cc1 = new ContaCorrente(clt1);
		Conta cp1 = new ContaPoupanca(clt1);
		
		cc1.depositar(850);
		cc1.depositar(1250);
		cc1.transferir(1000, cp1);
		
		Cliente clt2 = new Cliente();
		clt2.setNome("Grabriela Matos celina");
		Conta cc2 = new ContaCorrente(clt2);
		Conta cp2 = new ContaPoupanca(clt2);
		
		cc2.depositar(950);
		cc2.depositar(1050);
		cc2.transferir(900, cp1);
		
		Cliente clt3 = new Cliente();
		clt3.setNome("Cleiton Silva Melo");
		Conta cc3 = new ContaCorrente(clt3);
		Conta cp3 = new ContaPoupanca(clt3);

		cc3.depositar(650);
		cc3.depositar(450);
		cc3.transferir(700, cp3);
		
		List<Conta> contas = new ArrayList<Conta>();
		List<Conta> contas1 = Arrays.asList(cc,cp,cc1,cp1,cc3,cp3);
		
		Banco br2 = new Banco();
		br2.listarContas(contas1);

		/*
		List<Cliente> clientes = Arrays.asList(clt, clt1);
		for(Cliente clnt:clientes) {
			System.out.println(clnt.cltes(cc1, cp1));
		}
		System.out.println(clientes.toString());
		*/
		
	}

}

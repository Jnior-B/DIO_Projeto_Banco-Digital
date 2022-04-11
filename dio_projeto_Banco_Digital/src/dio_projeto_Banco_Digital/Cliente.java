package dio_projeto_Banco_Digital;

import java.util.List;

public class Cliente {

		private String nome;
		Conta conta;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Cliente(String nome) {
			super();
			this.nome = nome;
			this.conta.agencia = conta.agencia;
			this.conta.numero = conta.numero;
		}
		
		

		public Cliente() {
			super();
		}

		@Override
		public String toString() {
			return "Cliente [nome=" + nome + ", conta=" + conta + ", getNome()=" + getNome() + "]";
		}
		
		public String cltes(Conta contaCorrente, Conta contaPoupanca) {
			return "Cliente [nome=" + nome + ", contaCorrente=" + contaCorrente.agencia + contaCorrente.numero +
					contaPoupanca.numero  + contaCorrente.saldo + contaPoupanca.saldo + "]" ;
		}
		
	
}

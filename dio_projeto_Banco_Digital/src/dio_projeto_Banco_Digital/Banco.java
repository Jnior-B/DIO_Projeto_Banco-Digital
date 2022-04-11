package dio_projeto_Banco_Digital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta>clientes;
	private String nomeAgencia;
	
	public Banco() {
		
	}

	public Banco(List<Conta> clientes, String nomeAgencia) {
		super();
		this.clientes = clientes;
		this.nomeAgencia = nomeAgencia;
	}

	public List<Conta> getClientes() {
		return clientes;
	}

	public void setClientes(List<Conta> clientes) {
		this.clientes = clientes;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	
	public void listarContas(List<Conta> clientes) {
		for(Conta compte: clientes) {
			compte.imprimirExtrato();
		}
		
		
	}
	
	
	

	@Override
	public String toString() {
		return "Banco [contas=" + clientes + ", nomeAgencia=" + nomeAgencia + "]";
	}
	
	}

	
	/*public static void listarContas1(Cliente cliente, Conta conta) {
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Titular: %s",this.numero));
	}
	*/
	

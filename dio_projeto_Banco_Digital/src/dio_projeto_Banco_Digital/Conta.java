package dio_projeto_Banco_Digital;

public class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected String nomeAgencia;
	protected double saldo;
	protected Cliente cliente;
	public Conta( Cliente cliente) {
		super();
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.nomeAgencia = nomeAgencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	@Override
	public void sacar(double valor) {
		if(valor>1000) {
			System.out.println("valor n~~ao permitido \n" + "Não pode sacar valor em cima do seu limite diario");
			saldo =saldo;
		}else if(saldo < valor) {
			System.out.println("Saldo insuficiente \n " + "valor em cima do seu saldo");
		}else {
			saldo -=valor;
		}
		
	}
	
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	@Override
	public void transferir(double valor, IConta ContaDestino) {
	if(valor >1000) {
		System.out.println("Valor não permitido \n " + "não pode transferir valor em cima do seu limite diário ");
		saldo = saldo;
		}else {
			this.sacar(valor);
			ContaDestino.depositar(valor);
			System.out.println("Valor transferido com sucesso  " + valor +" R$");
		}
	}
	
	@Override
	public void imprimirExtrato() {
	imprimirInfosCommuns();
	}
	
	protected void imprimirInfosCommuns() {
		
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Titular: %s",this.numero));
		System.out.println(String.format("Titular: %s",this.saldo));
	}
	

}

package lambdas.model;

public class ContaCorrente {

	private int agencia;
	private int conta;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(int agencia, int conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

}

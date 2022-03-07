package organizacao;

public class Main {

	public static void main(String[] args) {
		Cliente thizo = new Cliente();
		thizo.setNome("Thiago");
		thizo.setCidade("Sorocaba");
		thizo.setTelefone("1512345678");
		
		Conta cc = new ContaCorrente(thizo);
		Conta poupanca = new ContaPoupanca(thizo);

		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

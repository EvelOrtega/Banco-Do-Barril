
public class Main {

	public static void main(String[] args) {
		Cliente marco = new Cliente();
		marco.setNome("Marco");
		
		Conta cc = new ContaCorrente(marco);
		Conta poupanca = new ContaPoupanca(marco);

		cc.depositar(10);
		cc.transferir(10, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

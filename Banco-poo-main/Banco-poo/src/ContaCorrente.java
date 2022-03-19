public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        if (this.isEstaAtiva()){
            super.imprimirExtratos();
        } else {
            System.out.println("Impossivel imprimir extrato de uma conta fechada");
        }
    }

    public void sacar(double valor) {
        if(this.isEstaAtiva() && valor < saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("______________________________");
        } else {
            System.out.println("Saldo insuficiente ou a conta está fechada.");
            System.out.println("______________________________");
        }
    }

    @Override
    public void calcularRendimneto() {

    }
}
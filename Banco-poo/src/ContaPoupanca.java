public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        if (this.isEstaAtiva()){
            super.imprimirExtratos();
        } else {
            System.out.println("Impossivel imprimir extrato de uma conta fechada.");
        }

    }

    @Override
    public void calcularRendimneto() {

    }
}
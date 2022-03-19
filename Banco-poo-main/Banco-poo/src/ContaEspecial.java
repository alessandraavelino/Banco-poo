public class ContaEspecial extends Conta{
    public ContaEspecial(Cliente cliente){
        super(cliente);
    }

    @Override
    public void calcularRendimneto() {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Especial ===");
        if(this.isEstaAtiva()){
            super.imprimirExtratos();
        } else{
            System.out.println("Impossivel imprimir extrato de uma conta fechada");
        }

    }
}

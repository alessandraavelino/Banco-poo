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
        super.imprimirExtratos();

    }
}

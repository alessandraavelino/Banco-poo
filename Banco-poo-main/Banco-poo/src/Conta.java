import java.util.ArrayList;
import java.util.List;
public abstract class Conta implements IConta, Aplicacao {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private boolean estaAtiva;
    protected List<Historico> lhistorico;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Conta(int agencia, int numero, double saldo, String cliente) {
        this.lhistorico = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if(this.isEstaAtiva()){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("______________________________");
        } else {
            System.out.println("Impossivel sacar de uma conta fechada.");
            System.out.println("______________________________");
        }
    }

    @Override
    public void depositar(double valor) {
        if (this.isEstaAtiva()){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso R$ ");
            System.out.println("______________________________");
        } else{
            System.out.println("Impossivel depositar em uma conta fechada.");
            System.out.println("______________________________");
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.getSaldo() > valor && isEstaAtiva() == true) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else{
            System.out.println("Impossivel tranferir. Valor insuficiente ou a conta está fechada");
        }

    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEstaAtiva() {
        return estaAtiva;
    }
    public void setEstaAtiva(boolean s){
        this.estaAtiva = s;
    }

    protected void imprimirExtratos() {
        if (this.isEstaAtiva()){
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
            System.out.println("____________________________________");
        } else{
            System.out.println("Impossivel imprimir extrato de uma conta fechada.");
        }

    }

    public List<Historico> getLHistorico(){
        return lhistorico;
    }

    public void setLhistorico(List<Historico> lhistorico){
        this.lhistorico = lhistorico;
    }

    public void exibirSaldo(){
        if(this.isEstaAtiva()){
            System.out.println(getSaldo());
            System.out.println("____________________________________");
        } else{
            System.out.println("Não pode exibir saldo de uma conta fechada.");
            System.out.println("____________________________________");
        }

    }

    public void abrirConta(){
        this.setEstaAtiva(true);
    }

    public void encerrarConta(){
        if(this.getSaldo() > 0){
            System.out.println("A conta possui dinheiro, então não pode ser fechada");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta está em débito então não pode ser fechada.");
        } else{
            this.setEstaAtiva(false);
            System.out.println("Conta fechada com sucesso.");
            System.out.println("____________________________________");
        }
    }


    public void reativarConta(){
        if (this.isEstaAtiva() == false){
            this.setEstaAtiva(true);
            System.out.println("Conta reativada com sucesso.");
            System.out.println("____________________________________");
        }
    }


}
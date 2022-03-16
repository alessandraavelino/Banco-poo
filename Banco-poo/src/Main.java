public class Main {

    public static void main(String[] args) {
        Cliente ale = new Cliente();
        Cliente jao = new Cliente();
        ale.setNome("ale");
        jao.setNome("jao");


        Conta cc = new ContaCorrente(ale);
        Conta poupanca = new ContaPoupanca(ale);
        Conta especial = new ContaEspecial(jao);



        cc.depositar(1000);
        especial.depositar(456);
        cc.transferir(100, poupanca);
        cc.transferir(500, especial);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        especial.imprimirExtrato();


    }

}

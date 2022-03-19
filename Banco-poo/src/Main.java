

public class Main {

    public static void main(String[] args)  {


        Cliente ale = new Cliente();
        Cliente jao = new Cliente();
        ale.setNome("ale");
        jao.setNome("jao");


        Conta cc = new ContaCorrente(ale);
        Conta poupanca = new ContaPoupanca(ale);
        Conta especial = new ContaEspecial(jao);

        cc.abrirConta();
        poupanca.abrirConta();
        especial.abrirConta();

        cc.depositar(1000);
        especial.depositar(450);
        cc.transferir(100, poupanca);
        cc.transferir(500, especial);
        cc.sacar(150);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        especial.imprimirExtrato();

        cc.exibirSaldo();
        especial.exibirSaldo();
        poupanca.exibirSaldo();

        cc.sacar(250);

        cc.encerrarConta();

        cc.depositar(50);
        cc.exibirSaldo();

        cc.reativarConta();
        cc.depositar(300);
        //cc.exibirSaldo();

        poupanca.sacar(100);
        poupanca.encerrarConta();

        cc.transferir(100, especial);
        poupanca.reativarConta();
        poupanca.depositar(400);

        cc.exibirSaldo();
        poupanca.exibirSaldo();
        especial.exibirSaldo();

        cc.sacar(600);
        cc.exibirSaldo();




    }

}

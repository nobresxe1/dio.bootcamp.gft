package banco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(200);
        cc.trasferencia(150,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}

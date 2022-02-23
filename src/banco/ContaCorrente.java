package banco;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta Conta Corrente");
        imprimirInfComuns();
        System.out.println(String.format("Cheque Especial %.2f", saldo + chequeEspecial));
        //System.out.println(String.valueOf(saldo + chequeEspecial));
    }

    @Override
    public void chequeEspecial(double valor) {

    }


}


package banco;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato conta Conta Poupança: ");
        super.imprimirInfComuns();
    }

    @Override
    public void chequeEspecial(double valor) {

    }

}

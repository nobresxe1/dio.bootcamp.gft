package banco;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUECIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double chequeEspecial = 1000;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUECIAL++;

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


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void trasferencia(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override

    public void chequeEspecial(double valor, double chequeEspecial) {
        this.saldo += chequeEspecial;

    }

    protected void imprimirInfComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f%n", this.saldo));
        //System.out.println(String.format("Cheque Especial %.2f", this.chequeEspecial));

    }


}


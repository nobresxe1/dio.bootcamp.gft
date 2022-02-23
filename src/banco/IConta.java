package banco;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void trasferencia(double valor, Conta contaDestino);

    void imprimirExtrato();

    void chequeEspecial(double valor);

    void chequeEspecial(double valor, double chequeEspecial);

    //void chequeEspecial(double valor);
}

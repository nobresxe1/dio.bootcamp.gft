package desafios;


import java.io.IOException;
import java.util.Scanner;

public class PrecoCinema {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica
        //double valor = (B * 100 / A ) - 100;
        double valor = ((B - A) / A * 100);

        //System.out.println(String.format("%.2f%%", valor));

        System.out.printf("%.2f",valor);
        System.out.print("%");



    }
}

package desafios;

import java.util.Scanner;

public class RaioDoCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double
        double raio = scan.nextFloat();
        double area;

        //continue a solucao

        area = 3.14159 * (Math.pow( raio ,2));

        System.out.printf("A=%.4f\n", area);
    }
}


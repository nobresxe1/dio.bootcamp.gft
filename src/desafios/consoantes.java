package desafios;
/*Faça um programa que leia o vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

//import java.awt.print.Printable;
//import java.security.Principal;
import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Letra: ");
            String letra = sc.next();

            if (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ;
            {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.println("consoantes: ");


        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.println(consoante + " ");

        }
    }
}


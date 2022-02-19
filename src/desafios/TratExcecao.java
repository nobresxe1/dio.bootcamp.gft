package desafios;

import javax.swing.*;
import java.io.*;

public class TratExcecao {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) { //o tratamento da classe filha e primeiro pois e mais especifico
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            e.printStackTrace();
        } catch (IOException e){//o tratamento da classe mãe e bem generico e é mais dificil mostrar a
                                // msg pro usuario onde estao erro
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}

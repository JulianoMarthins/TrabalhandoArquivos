package Caputilo_17;

import java.io.*;
import java.util.Scanner;

public class Aula04 {

    public void conteudo() {



        String[] lines = new String[]{
                "Juliano Martins de Souza",
                "Thiele da Silva Gringer",
                "Regina Maria Martins de Souza"
        };

        String caminho = "D:\\WorkSpace\\Arquivo\\Nomes.txt\\";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }

        }
        catch (IOException e){
            System.out.println("Error! " + e.getMessage());
        }

    }
}

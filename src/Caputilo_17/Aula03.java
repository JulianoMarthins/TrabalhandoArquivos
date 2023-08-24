package Caputilo_17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula03 {

    public void conteudo(){

        String caminho = "D:\\WorkSpace\\Arquivo\\Ordem de estudos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch(IOException e){
            System.out.println("Error! " + e.getMessage());
        }


    }
}

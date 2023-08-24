package Caputilo_17;

import java.io.*;

public class Aula02 {

    public void conteudo() {

        String caminho = "D:\\WorkSpace\\Arquivo\\Ordem de estudos.txt";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        try {
            fileReader = new FileReader(caminho);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
            ;
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            }
            catch( IOException e ){
                System.out.println("Error " + e.getMessage());
            }
        }


    }
}

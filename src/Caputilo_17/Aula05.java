package Caputilo_17;

import java.io.File;
import java.util.Scanner;

public class Aula05 {

    public void conteudo(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho para ser criado uma pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Acessa as pastas contida no caminho digitado
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("\nPastas: \n");

        for(File folder : folders) {
            System.out.println(folder);
        }

        // Acessa os arquivos contidos no caminho digitado
        System.out.println("\nArquivos\n");
        File[] files = path.listFiles(File :: isFile);

        for(File file : files){
            System.out.println(file);
        }

        // Criar uma pasta no caminho digitado
        System.out.println("\nCriação de pasta\n");

        try {
            boolean sucess = new File(strPath
                    + "\\Pasta criada pelo programa").mkdir();
            System.out.println("Pasta criada com sucesso");
        }
        catch(Exception e){
            System.out.println("Pasta não pode ser criada" + e.getMessage());
        }





        sc.close();
    }
}

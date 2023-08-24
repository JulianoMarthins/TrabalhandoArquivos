package Caputilo_17;

import java.io.File;
import java.util.Scanner;

public class Aula06 {

    public static void conteudo(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Pegar nome do arquivo -> .getName():  \n" + path.getName());
        System.out.println();
        System.out.println("Pegar caminho do arquivo -> .getParent: \n" + path.getParent());
        System.out.println();
        System.out.println();

        sc.close();
    }
}

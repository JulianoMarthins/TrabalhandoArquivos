package Caputilo_17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula01 {
  public void conteudo(){
      // Instanciação do objeto File, se passa como parâmetro o endereço do arquivo a ser analisado
      File file = new File("D:\\WorkSpace\\Arquivo\\Ordem de estudos.txt");

      // Importação do objeto Scanner, A instanciação não é realizada porque pode ocurrer excessões durante
      // a tentativa de inicialização do objeto Scanner
      Scanner sc = null;

      try {
          sc = new Scanner(file); // Inicialização do Scanner, parâmetro a variável file
          while (sc.hasNextLine()) { // Enquanto ouver uma próxima linha
              System.out.println(sc.nextLine()); // Imprimir linha
          }

      } catch (IOException e) {
          System.out.println("ERROR:" + e.getMessage()); // Tratamento de excessões
          ;
      } finally {
          if (sc != null) { // Verifica se o Scanner foi instanciado, se sim, encera o mesmo na linha abaixo
              sc.close();
          }
      }

      System.out.println();
  }
}

import java.util.Scanner;

public class Nota{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    Double nota, media;
    for (int i = 0; i < 10; i++) {
      System.out.println("\nDigite as 3 notas do aluno:");
      int i2 = 0;
      media = 0.0;
      while (i2 < 3){
        nota = teclado.nextDouble();
        media += nota;
        i2++;
      }
      System.out.println("A media e: " + media / 3);
    }
  }
}

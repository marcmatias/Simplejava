import java.util.Scanner;

public class Idade{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int i, qtd=0;
    Double media=0.00;
    do {
      System.out.println("Digite idade da pessoa : ");
      i = teclado.nextInt();
      if (i > 0){
        System.out.println("Digite altura da pessoa: ");
        Double a = teclado.nextDouble();
        if (i > 50){
          qtd++;
          media += a;
        }
      }
    } while (i > 0);
    System.out.println("Media de altura dos que tem mais de 50 anos e: " + media/qtd);
  }
}

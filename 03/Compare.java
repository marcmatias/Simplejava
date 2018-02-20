import java.util.Scanner;

public class Compare{

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    String n1, n2;
    System.out.println("Digite 5 nomes:");
    n1 = teclado.next();
    for (int i = 0; i < 4;i++) {
      n2 = teclado.next();
      if (n1.compareTo(n2) > 0) n1 = n2 ;
    }
    System.out.println("Menor nome: " + n1);
  }

}

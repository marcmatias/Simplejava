import java.util.Scanner;

public class Conta{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int n = 0;
    int c = 0;
    do {
        System.out.println("Digite numero: ");
        n = teclado.nextInt();
        if (n == 2) c++;
    } while (n != 0);
    System.out.println(c);
  }
}

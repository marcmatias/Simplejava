
import java.util.Scanner;

public class Senha{

  public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      int p = 123456;
      System.out.println("Digite sua senha:");
      int s = teclado.nextInt();
      if (s == p) System.out.println("Acesso Liberado");
      else System.out.println("Acesso Negado");

  }

}

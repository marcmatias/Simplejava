import java.util.Scanner;

public class Abc{



  public static void main(String[] args){
    int a, b, c;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite 3 numeros: ");
    a = teclado.nextInt();
    b = teclado.nextInt();
    c = teclado.nextInt();
    if (a + b < c) System.out.println(a + "+" + b + " < " + c);
    else if (a + b == c) System.out.println(a + "+" + b + " = " + c);
    else System.out.println( a + "+" + b + " > " + c);
  }
}

import java.util.Scanner;

public class Idade{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int c, idade;
    c = 0;
    System.out.println("Digite a idade das 10 pessoas");
    for (int i = 0; i < 10; i++){
      idade = teclado.nextInt();
      if (idade >= 0 && idade <= 12) c++;
    }
    System.out.println(c + " pessoa(s) tem entre 0 e 12 anos");
  }
}

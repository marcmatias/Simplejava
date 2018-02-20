import java.util.Scanner;

public class Ler{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int sm = 0, sf = 0, i = 0;
    double at = 0.00;
    do {
      System.out.println("Digite o sexo digite o sexo da pessoa m - masculino f - feminino: ");
      String s = teclado.next();
      if (s.equals("m")) {
        sm += 1;
        i++;
      } else if (s.equals("f")) {
        sf += 1;
        i++;
      } else {
        System.out.println("Invalido digite novamente");
      }
      if (i == 10) {
        for (i = 0; i<10 ; i++) {
          System.out.println("Digite a altura da pessoa "+ (i+1) +": ");
          double a = teclado.nextDouble();
          if (a > at) at = a;
        }
      }
    } while (i < 10);
    System.out.println("A contagem de homens foi igual a: " + sm + " A de mulheres: " + sf + " E a maior estatura registrada foi de: " + at);
  }
}

import java.util.Scanner;

public class Menu{

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int s, p;
    Double n1 = 0.00;
    Double n2 = 0.00;
    do {
      System.out.println("\nDigite 1 para Media Aritimetica, 2 para Media Ponderada e 3 para sair");
      s = teclado.nextInt();
      if (s == 1){
        System.out.println("Digite duas notas:");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n1 = (n1+n2)/2;
        System.out.println("A nota e: " + n1);
      }
      else if (s == 2) {
        Double soma = 0.00;
        int somap = 0;
        for (int i = 0; i < 3; i++){
          System.out.println("\nDigite nota:");
          n1 = teclado.nextDouble();
          System.out.println("Digite o peso da nota:");
          p = teclado.nextInt();
          soma += p*n1;
          somap += p;
        }
        System.out.println("Resultado: " + soma/somap);
      }
      else if (s > 3 || s < 1){
        System.out.println("Invalido, tente outra vez.");
      }
    } while (s != 3);
  }
}

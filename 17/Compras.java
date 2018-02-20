import java.util.Scanner;

public class Compras{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    Double soma = 0.00;
    int cod, qtd;
    do {
      System.out.println("Digite o codigo de produto: ");
      cod = teclado.nextInt();
      if (cod != 0){
        System.out.println("Digite a quantidade de produtos: ");
        qtd = teclado.nextInt();
        if (cod == 1){
          System.out.println("Carderno - R$12.00");
          soma += qtd * 12.00;
        } else if (cod == 2){
          System.out.println("Regua - R$ 2.50");
          soma += qtd * 2.50;
        } else if (cod == 3) {
          System.out.println("Borracha - R$ 0.25");
          soma += qtd * 0.25;
        } else if (cod == 4){
          System.out.println("Mochila - R$ 50.00");
          soma += qtd * 50.00;
        }
      }  
    } while (cod != 0);
    System.out.println("Total a ser pago: R$" + soma);
  }
}

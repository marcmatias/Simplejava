import java.util.Scanner;

public class Tennis{


  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a idade do atleta: ");
    int i = teclado.nextInt();
    if (i >= 5 && i <= 10) System.out.println("Infantil");
    else if (i > 10 && i <= 15) System.out.println("Juvenil");
    else if (i > 15 && i <= 20) System.out.println("Junior");
    else if (i > 20 && i <= 25) System.out.println("Profissional");
    else System.out.println("Idade invalida, ou nao se enquadra em nenhuma das categorias");
  }
}

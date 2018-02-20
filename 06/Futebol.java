import java.util.Scanner;

public class Futebol{

  
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite gols marcados pelo Sport:");
    int sgols = teclado.nextInt();
    System.out.println("Digite gols marcados pelo Nautico:");
    int ngols = teclado.nextInt();
    if(sgols > ngols) System.out.println("Sport");
    else if (sgols < ngols) System.out.println("Nautico");
    else System.out.println("Empate");
  }
}

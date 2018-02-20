import java.util.Scanner;

public class Tarefas{

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("Distancia percorrida");
      Double d = teclado.nextDouble();
      System.out.println("Tempo que o atleta levou para percorrer a distancia");
      Double t = teclado.nextDouble();
      System.out.println("Velocidade " + d/t);
      System.out.println("Deseja continuar a executar o programa?");
      String i = teclado.next();
    } while (i.equals("nao") == false);
  }
}

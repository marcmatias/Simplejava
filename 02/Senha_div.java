import java.util.Scanner;

public class Senha_div{


    public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Cadastre a senha: ");
      String sc = teclado.next();
      System.out.println("Digite dois numeros:");
      int n = teclado.nextInt();
      int n2 = teclado.nextInt();
      System.out.println("Digite sua senha:");
      String s = teclado.next();
      if(s.equals(sc)){
        System.out.println(n / n2);
      }
      else{
        System.out.println("Sua senha esta incorreta");
        System.exit(0);
      }
    }
}

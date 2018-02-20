public class Sorteio{


  public static void main(String[] args){
    int i = 0;
    while (i < 6){
      int x = (int) (Math.random()*61);
      if (x != 0){
        System.out.println(x);
        i++;
      }
    }
  }
}

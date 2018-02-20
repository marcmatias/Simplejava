import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para IMC digite o peso: ");
		Double p = teclado.nextDouble();
		System.out.println("Digite altura: ");
		Double a = teclado.nextDouble();
		p = p / (a*a);
		System.out.println(p);
		if(p < 18.5) System.out.println("Magro");
		else if (p >= 18.5 && p <= 24.9) System.out.println("Normal");
		else if (p > 24.9 && p <= 29.9) System.out.println("Sobrepeso");
		else if (p > 29.9 && p <= 34.9) System.out.println("Obesidade");
		else if (p > 34.9 && p <= 39.9) System.out.println("Obesidade Morbida");
	}
}

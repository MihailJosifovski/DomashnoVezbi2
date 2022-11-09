package zadacha7;

import java.util.Scanner;

public class ClassMain {
	public static void main(String[] args) {
		Triagolnik triagolnik1 = new Triagolnik();
		Scanner vlez = new Scanner(System.in);
		System.out.println("Vnesete ja stranata a: ");
		triagolnik1.a = vlez.nextInt();
		System.out.println("Vnesete ja stranata b: ");
		triagolnik1.b = vlez.nextInt();
		System.out.println("Vnesete ja stranata c: ");
		triagolnik1.c = vlez.nextInt();
		vlez.close();
		triagolnik1.Plos(triagolnik1.a, triagolnik1.b, triagolnik1.c);
		triagolnik1.Per(triagolnik1.a, triagolnik1.b, triagolnik1.c);
		System.out.println("Triagolnikot so strani a = " + triagolnik1.a + " b = " + triagolnik1.b + " c = " + triagolnik1.c + " ima plostina: " + triagolnik1.plostina + " i perimetar: " + triagolnik1.perimetar);
	}
}

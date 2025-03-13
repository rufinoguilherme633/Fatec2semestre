package src;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x,y,media;
		
		System.out.println("Digite primeiro número");
		
		x = sc.nextDouble();
		System.out.println("Digite segundo número");
		y = sc.nextDouble();
		
		media = (x+y) /2;
		
		System.out.println("Media = " + media);

		if(media >= 6 ) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("reptovado");
		}
		sc.close();
	}

}

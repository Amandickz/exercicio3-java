
import java.util.Scanner;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

public class Exercicio2 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int x, y;
		
		System.out.println("Digite as posições x e y: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			
			x = scan.nextInt();
			y = scan.nextInt();
		}
		
	}

}

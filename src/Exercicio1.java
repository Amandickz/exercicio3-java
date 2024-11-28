
import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

public class Exercicio1 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int senha;
		
		System.out.println("Digite a senha: ");
		senha = scan.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida!");
			System.out.println("Digite a senha: ");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
	}

}

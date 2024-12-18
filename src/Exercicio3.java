
import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

public class Exercicio3 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int alcool, gasolina, diesel, combustivel;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		System.out.println("Digite os códigos dos combustíveis: ");
		combustivel = scan.nextInt();
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool++;
			} else if (combustivel == 2) {
				gasolina++;
			} else if (combustivel == 3) {
				diesel++;
			}
			
			combustivel = scan.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Álcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		
	}

}

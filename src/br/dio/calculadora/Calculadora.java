package br.dio.calculadora;

import java.util.Scanner;

/**
 * Especialista da DIO: Camila Cavalcante Cria��o de uma calculadora para o
 * curso "Dominando IDE's Java" da DIO para o Bootcamp Java Cognizant
 * #teamJavaCog
 * 
 * @author Reginaldo Santos de Medeiros data: 12/12/2021 *
 */
public class Calculadora {

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		int a, b, operacao;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		a = scanner.nextInt();

		System.out.print("\nDigite o segundo n�mero: ");
		b = scanner.nextInt();

		do {
			System.out.print("\n1-Soma | 2-Subtra��o | 3-Divis�o | 4-Multiplica�ao | 0-Sair");
			System.out.print(" | Escolha a opera��o: ");
			operacao = scanner.nextInt();
			switch (operacao) {
			case 0:
				System.out.println("Saindo da calculadora...");
				break;
			case 1:
				System.out.println("Soma de " + a + " + " + b + " = " + soma(a, b));
				break;
			case 2:
				System.out.println("Subtra��o de " + a + " - " + b + " = " + subtracao(a, b));
				break;
			case 3:
				System.out.println("Divis�o de " + a + " / " + b + " = " + divisao(a, b));
				break;
			case 4:
				System.out.println("Multiplica��o de " + a + " * " + b + " = " + multiplicacao(a, b));
				break;

			default:
				System.out.println("Opera��o inv�lida!");
				break;
			}

		} while (operacao != 0);
		System.out.println("Calculadora finalizada!");
	}

}

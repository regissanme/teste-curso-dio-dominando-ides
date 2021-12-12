package br.dio.calculadora;

import java.util.Scanner;

/**
 * Especialista da DIO: Camila Cavalcante Criação de uma calculadora para o
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
		System.out.print("Digite o primeiro número: ");
		a = scanner.nextInt();

		System.out.print("\nDigite o segundo número: ");
		b = scanner.nextInt();

		do {
			System.out.print("\n1-Soma | 2-Subtração | 3-Divisão | 4-Multiplicaçao | 0-Sair");
			System.out.print(" | Escolha a operação: ");
			operacao = scanner.nextInt();
			switch (operacao) {
			case 0:
				System.out.println("Saindo da calculadora...");
				break;
			case 1:
				System.out.println("Soma de " + a + " + " + b + " = " + soma(a, b));
				break;
			case 2:
				System.out.println("Subtração de " + a + " - " + b + " = " + subtracao(a, b));
				break;
			case 3:
				System.out.println("Divisão de " + a + " / " + b + " = " + divisao(a, b));
				break;
			case 4:
				System.out.println("Multiplicação de " + a + " * " + b + " = " + multiplicacao(a, b));
				break;

			default:
				System.out.println("Operação inválida!");
				break;
			}

		} while (operacao != 0);
		System.out.println("Calculadora finalizada!");
	}

}

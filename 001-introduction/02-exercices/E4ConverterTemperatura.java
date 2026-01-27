package aprendendo_java_2026;

import java.util.Scanner;

public class E4ConverterTemperatura {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite uma temperatura em Celsius.
		 * Armazene a temperatura em uma variável.
		 * Converta a temperatura para Fahrenheit utilizando a fórmula: F = (C x 1.8) + 32.
		 * Exiba a temperatura em Fahrenheit.
		 * */
		
		// variaveis
		double tempCelsius;
		double tempFahrenheit;
		
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// guardando os dados na variável
		System.out.println("Digite a temperatura em Celsius: ");
		tempCelsius = sc.nextDouble();
		
		// lógica
		tempFahrenheit = (tempCelsius * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);

	}

}

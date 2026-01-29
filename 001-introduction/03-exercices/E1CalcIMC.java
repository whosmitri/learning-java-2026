package aprendendo_java_2026;

import java.util.Scanner;

public class E1CalcIMC {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite seu peso em quilos.
		 * Armazene o peso em uma variável.
		 * Solicite ao usuário que digite sua altura em metros.
		 * Armazene a altura em uma variável.
		 * Calcule o IMC utilizando a fórmula: IMC = peso / (altura x altura).
		 * Verifique o resultado do IMC e exiba a mensagem "Abaixo do peso ideal", "Peso normal", "Sobrepeso" ou "Obesidade", de acordo com a tabela de classificação do IMC.
		 */
		
		/*
		 * Tabela de classificação do ICM
		 * Abaixo do peso (<18,5)
		 * Normal/Eutrófico (18,5-24,9)
		 * Sobrepeso (25,0-29,9)
		 * Obesidade Grau I (30,0-34,9)
		 * Obesidade Grau II (35,0-39,9)
		 * Obesidade Grau III (≥40,0)
		 */
		
		// variáveis
		double peso, altura, imc;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// recebendo os dados de peso (em quilos)
		System.out.print("Digite seu peso em quilos: ");
		peso = sc.nextDouble();
		
		// recebendo os dados de altura (em metros)
		System.out.print("Digite sua altura em metros: ");
		altura = sc.nextDouble();
		
		// lógica
		imc = peso/(altura*altura);
		
		if (imc < 18.5) {
			System.out.printf("Seu IMC é de %f e você está ABAIXO DO PESO", imc);
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.printf("Seu IMC é de %f e você está com PESO IDEAL", imc);
		} else if (imc >=25 && imc <= 29.9) {
			System.out.printf("Seu IMC é de %f e você está com SOBREPESO", imc);
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.printf("Seu IMC é de %f e você com OBESIDADE GRAU I", imc);
		} else if (imc >= 25 && imc <= 39.9) {
			System.out.printf("Seu IMC é de %f e você com OBESIDADE GRAU II", imc);
		} else if (imc >= 40) {
			System.out.printf("Seu IMC é de %f e você com OBESIDADE GRAU III", imc);
		}
		
	}
}

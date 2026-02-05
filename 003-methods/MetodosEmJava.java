package aprendendo_java_2026;

public class MetodosEmJava {

	// funções com retorno e que pode ser usado em outras classes
	public static double somar(double x, double y) {
		return x+y;
	}
	
	public double multiplicar(double x, double y) {
		return x*y;
	} 
	
	// usando as funções criadas
	public static void main(String[] args) {
		double resposta = somar(10.5, 5.5);
		System.out.println(resposta);
	}
}

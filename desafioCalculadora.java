package FundamentosIniciais;

import java.util.Scanner;

public class desafioCalculadora {
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("digite um numero; ");
		double num1 = entrada.nextDouble();
		
		System.out.print("digite outro numero ");
		double num2 = entrada.nextDouble();
		
		
		System.out.print("Digite a operacao "); // Trabalhar com numeros inteiros.
		String op = entrada.next();
		
		
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf( "%.2f %s %.2f  = %.2f", num1, op, num2, resultado);
		
		
		entrada.close();
	}
}

/*
 * Fibonacci.java
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
 * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/
import java.util.Scanner;

public class Fibonacci {	
	    public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // Verifica se o número está na sequência de Fibonacci
        int a = 0, b = 1;
        while (b < num) {
            int c = a + b;
            a = b;
            b = c;
        }

        if (b == num) {
            System.out.println(num + " é um número da sequência de Fibonacci");
            System.out.println("O próximo número da sequência é " + (a+b));
        } else {
            System.out.println(num + " não é um número da sequência de Fibonacci");
        }
    }
}

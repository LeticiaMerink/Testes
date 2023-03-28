/*
 * Ex5.java
 * 
 * 5) Escreva um programa que inverta os caracteres de um string.
 * 
 */


public class Ex5 {	
	public static void main (String[] args) {
				
		String str = "ParaLelePipedo";
		System.out.println(str);
		System.out.print("\n");
		
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
		
	}
}


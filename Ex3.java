/*
 * Ex3.java
 * Descubra a lógica e complete  o próximo elemento: 
 * a) 1,3,5,7,__
 * b) 2,4,8,16,32,64, __ 
 * c) 0,1,4,9,16,25,36, __
 * d) 4,16,36,64, __
 * e) 1,1,2,3,5,8, __
 * f) 2,10,12,16,17,18,19, __
 */


public class Ex3 {
	
	public static void main (String[] args) {
		
		//a) 1,3,5,7,__ (sequência de números ímpares)
	
		for (int num = 0; num <= 10 ; num++ ){
			num ++;
			System.out.print(num + ", " );	
		}
	
		//b)2,4,8,16,32,64, __(sequência dos resultados multiplicados por 2 -> 1*2=2, 2*2=4, 4*2=8, 8*2=16, 16*2=32...) 
		System.out.print("\n");
	 	 
		int result = 1;
		for(int i = 0; i <= 10; i++){
			result *= 2;
			System.out.print(result + ", ");		 
		}
		
		//c)0,1,4,9,16,25,36, __ (sequência dos resultado anterior com o próximo número impar -> 0+1=1, 1+3=4, 4+5=9, 9+7=16...)
		System.out.print("\n");	 
	 
		for ( int i =  0; i < 10; i++){
			int j = i * i;
			System.out.print(j + ", ");
		}
		
		// d) 4,16,36,64, __ (número par ao quadrado -> 2^2 = 4, 4^2 = 16, 6^2=36, 8^2=64...)
		System.out.print("\n");
	 
		for (int i = 2; i < 20; i += 2){
			int j = i * i;
			System.out.print(j + ", ");
		}
		
		// e) 1,1,2,3,5,8, __ (sequência de fibonacci (soma o resultado com o nº anterior a ele) 
		// -> 0+1=1, 1+1=2, 2+1=3, 3+2=5, 5+3=8, 8+5=13, 13+8=12, ...)
		System.out.print("\n");
		
		int a = 0, b = 1, c, elementos = 10;
		for (int elemento = 1; elemento <= elementos; elemento++){
			System.out.print(a + ", ");
			c = a + b;
			a = b;
			b = c;
		}
    	
    	// f) 2,10,12,16,17,18,19, __ (números que o nome iniciam com a letra D)
    	System.out.print("\n");
    	System.out.print("2, 10, 12, 16, 17, 18, 19, 200, 201, 202, ...");
    	
    		
	}
}



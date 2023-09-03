package algoritmos;

import java.util.Random;

public class Ordenado {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int cont =0;
		for (int i = 0; i < 100; i++) {
			
			if(cont < 9) {
				System.out.print(i + gerador.nextInt(2) + ",");
				cont++;
			}else {
				System.out.println(i + gerador.nextInt(2) + " ");
				cont=0;
			}
				
			
		}

	}

}

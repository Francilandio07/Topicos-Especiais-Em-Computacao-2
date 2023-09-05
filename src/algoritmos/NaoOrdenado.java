package algoritmos;

import java.util.Random;

public class NaoOrdenado {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int cont =0;
		for (int i = 0; i < 500; i++) {
			
			if(cont < 9) {
				System.out.print(gerador.nextInt(1000) + ",");
				cont++;
			}else {
				System.out.println(gerador.nextInt(1000) + " ");
				cont=0;
			}
		}

	}

}

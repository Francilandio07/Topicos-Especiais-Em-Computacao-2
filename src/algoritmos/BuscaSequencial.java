package algoritmos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuscaSequencial {

	public static int buscaSequencial_v1(int x, int v[]) {

		int indice=-1;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x)
			   indice = i;
		}
		return indice;
	}
	
	public static int buscaSequencial_v2(int x, int v[]) {

		for (int i = 0; i < v.length; i++) {
			if (v[i] == x)
				return i;
		}
		return -1;
	}


	public static void main(String[] args) {
		String fileName = "C:/Users/franc/Disciplinas/Topicos Especiais em computacao 2/Trabalho 1/ordenados/100000000.txt";
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                for (String token : tokens) {
                    numbers.add(Integer.parseInt(token));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Converte a lista em um array de inteiros
        int[] array = numbers.stream().mapToInt(i -> i).toArray();
		Runtime runtime = Runtime.getRuntime();
		
		long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
		long startTime = System.nanoTime();
		System.out.println(buscaSequencial_v1(100000000, array));
		long endTime = System.nanoTime();
		long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();


		long duration = (endTime - startTime);
		long memoryUsed = usedMemoryAfter - usedMemoryBefore;

		System.out.println(String.format("Tempo de execução: %d", duration));
		System.out.println(String.format("Memória usada: %d", memoryUsed));

		//System.out.println(buscaSequencial_v2(100, array));

	}
}

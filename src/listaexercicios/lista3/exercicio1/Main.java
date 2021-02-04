package listaexercicios.lista3.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 8, 22, 15, 15, 8, 4, 5, 6);
		Integer num = 0;
		
		
		/*
		 * Scanner l = new Scanner(System.in);
		 * System.out.println("Informe o �ltimo n�mero a lista: "); num = l.nextInt();
		 * //list.stream().boxed.(collect)(Collectors.toList());
		 * System.out.println(num); list.stream(num); System.out.println(list);
		 * 
		 * l.close();
		 */

		// Gere uma lista com n�meros e 1 a n duplicados

		// Mostrar todos os n�meros
		System.out.println("Todos os n�meros:" + list + "\n");

		// mostrar todos os n�meros sem repeti��o
		System.out.println("N�meros sem repeti��o:");
		list.stream().distinct().forEach(e -> System.out.println(e));

		// �mpares sem repeti��o
		System.out.println("N�meros �mpares sem repeti��o:");
		list.stream().distinct().filter(e -> e % 2 != 0).forEach(e -> System.out.println(e));
		
		// pares sem repeti��o
		System.out.println("N�meros pares sem repeti��o:");
		list.stream().distinct().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		
		// a partir do  5 algorismo sem repeti��o
		System.out.println("N�meros a partir do  5 algorismo:");
		list.stream().distinct().skip(5).forEach(e -> System.out.println(e));		
		
		//todos os n�meros multiplicados por 4 
		
		System.out.println("N�meros multiplicados por 4: ");
		list.stream().distinct().filter(e -> e % 4 ==0).forEach(e -> System.out.println(e));		
	}

}

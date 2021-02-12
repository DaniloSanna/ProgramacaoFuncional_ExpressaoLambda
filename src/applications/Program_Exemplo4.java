package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto_Exemplo4;

public class Program_Exemplo4 {
	
	public static void main (String[] args) {
		
		List<Produto_Exemplo4> list = new ArrayList<>();
		
		list.add(new Produto_Exemplo4("Tv", 900.00));
		list.add(new Produto_Exemplo4("Mouse", 50.00));
		list.add(new Produto_Exemplo4("Tablet", 350.00));
		list.add(new Produto_Exemplo4("HD Case", 80.90));
		
		System.out.println("Lista Original");
		for(Produto_Exemplo4 p : list) {
			System.out.println(p);
		}
		
		/*
		 * fun��o map (N�o confundir com Map) aplica uma fun��o a todos elementos de uma Lista.
		 * List n�o funciona com Function, portanto convertemos para Stream.
		 * usando list.stream().
		 * Depois de realizar a a��o de Function retornamos a list para seu
		 * formato natural de List.
		 * Usando list.collect(Collectors.toList())
		 * 
		 */
		//List<String> names = list.stream().map(new Produto_Function()).collect(Collectors.toList());
		
		//Function - M�todos est�tico
		//List<String> names = list.stream().map(Produto_Exemplo4::staticUpperCaseName).collect(Collectors.toList());
		
		//Function - M�todos non est�tico
		//List<String> names = list.stream().map(Produto_Exemplo4::nonStaticUpperCaseName).collect(Collectors.toList());
				
		//Function - Lambda Declarado
		//Function<Produto_Exemplo4, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
				
		//Function - Lambda InLine
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		
		
		System.out.println();
		System.out.println("Nova Lista de Nomes");
		names.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Atualizando produtos");
		for(int x = 0; x<list.size(); x++) {
			list.get(x).setName(names.get(x));
		}
		list.forEach(System.out::println);
	}
}

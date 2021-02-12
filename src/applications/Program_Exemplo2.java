package applications;

import java.util.ArrayList;
import java.util.List;

import entities.Produto_Exemplo2;
import util.ProductoPredicate_exemplo2;

public class Program_Exemplo2 {
	
	public static void main (String[] args) {
		
		List<Produto_Exemplo2> list = new ArrayList<>();
		
		list.add(new Produto_Exemplo2("Tv", 900.00));
		list.add(new Produto_Exemplo2("Mouse", 50.00));
		list.add(new Produto_Exemplo2("Tablet", 350.00));
		list.add(new Produto_Exemplo2("HD Case", 80.90));
		
		System.out.println("Lista Original");
		for(Produto_Exemplo2 p : list) {
			System.out.println(p);
		}
		
		//list.removeIf(p -> p.getPreco() >=100);
		
		//Implementação do predicado atravez da interface;
		//predicado (p -> p.getPreco() >=100);
		list.removeIf( new ProductoPredicate_exemplo2() );
		
		
		System.out.println();
		System.out.println("Lista após remoção");
		for(Produto_Exemplo2 p : list) {
			System.out.println(p);
		}
		
		
	}
}

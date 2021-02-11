package applications;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Produto_Exemplo1;

public class Program_Exemplo1 {
	public static void main (String[] args) {
		
		List<Produto_Exemplo1> list = new ArrayList<>();
		
		list.add( new Produto_Exemplo1("TV", 900.00) );
		list.add( new Produto_Exemplo1("Notebook", 1200.00) );
		list.add( new Produto_Exemplo1("Tablet", 450.00) );
		list.add( new Produto_Exemplo1("Android", 700.00) );
		list.add( new Produto_Exemplo1("Zebra", 3000.00) );
		
		//Sintaxe classe anonima
		/*
		 Comparator<Produto_Exemplo1> comp = new Comparator<Produto_Exemplo1>() {
		 
			@Override
			public int compare(Produto_Exemplo1 p1, Produto_Exemplo1 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		*/
		
		//função anonima - Lambda
		/*
		Comparator<Produto_Exemplo1> comp = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		*/
		
		//função anonima - Lambda (Como só tem 1 linha, dá para Reduzir!
	// Comparator<Produto_Exemplo1> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		
		//list.sort( new MyComparator_Exemplo1() );
		//list.sort(comp);

		//Resumindo ainda mais, em uma única expresão Lambda
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Produto_Exemplo1 p:list) {
			System.out.println(p);
		}
		
	}
}

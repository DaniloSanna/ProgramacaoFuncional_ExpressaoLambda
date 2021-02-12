package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Produto_Exemplo2;

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
		
		//Implementa��o do predicado atravez da interface;
		//predicado (p -> p.getPreco() >=100);
		//list.removeIf( new ProductoPredicate_exemplo2() );
		
		//Refer�ncia a m�todo est�tico
		//list.removeIf( Produto_Exemplo2::staticProductPredicate);
		
		
		//Refer�ncia a m�todo n�o est�tico
		//list.removeIf( Produto_Exemplo2::nonStaticProductPredicate);
		
		
		//Express�o Lambda Declarada
		//Predicate<Produto_Exemplo2> pred = p-> p.getPreco()>=100;
		//list.removeIf(pred);

		
		//Express�o Lambda inLine
		list.removeIf(p-> p.getPreco()>=100);

		System.out.println();
		System.out.println("Lista ap�s remo��o");
		for(Produto_Exemplo2 p : list) {
			System.out.println(p);
		}
		
		
	}
}

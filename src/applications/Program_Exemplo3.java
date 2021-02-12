package applications;

import java.util.ArrayList;
import java.util.List;

import entities.Produto_Exemplo3;
import util.ProdutoConsumer_Exemplo3;

public class Program_Exemplo3 {
	
	public static void main (String[] args) {
		
		List<Produto_Exemplo3> list = new ArrayList<>();
		
		list.add(new Produto_Exemplo3("Tv", 900.00));
		list.add(new Produto_Exemplo3("Mouse", 50.00));
		list.add(new Produto_Exemplo3("Tablet", 350.00));
		list.add(new Produto_Exemplo3("HD Case", 80.90));
		
		System.out.println("Lista Original");
		for(Produto_Exemplo3 p : list) {
			System.out.println(p);
		}
		
		//Implementa��o da Interface
		//list.forEach( new ProdutoConsumer_Exemplo3() );		
		
		//Implementa��o M�todo est�tico
		//list.forEach( Produto_Exemplo3::staticaumentaPreco);
		
		//Implementa��o M�todo non est�tico
		list.forEach( Produto_Exemplo3::nonStaticaumentaPreco);
		
		System.out.println();
		System.out.println("Lista Ap�s aumento");
		list.forEach(System.out::println);		
		
	}
}

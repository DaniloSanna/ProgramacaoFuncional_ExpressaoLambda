package applications;

import java.util.ArrayList;
import java.util.List;

import entities.Produto_Exemplo5;
import entities.services.ProductService_Exemplo5;

public class Program_Exemplo5 {
	
	public static void main (String[] args) {
		
		List<Produto_Exemplo5> list = new ArrayList<>();
		
		list.add(new Produto_Exemplo5("Tv", 900.00));
		list.add(new Produto_Exemplo5("Mouse", 50.00));
		list.add(new Produto_Exemplo5("Tablet", 350.00));
		list.add(new Produto_Exemplo5("HD Case", 80.90));
		
		System.out.println("Lista Original");
		for(Produto_Exemplo5 p : list) {
			System.out.println(p);
		}

		
		ProductService_Exemplo5 ps = new ProductService_Exemplo5();
		double sum1 = ps.filteredSum(list, p-> p.getName().charAt(0)=='T');
		double sum2 = ps.filteredSum(list, p-> p.getPreco()<=100.00);
		
		System.out.println();
		System.out.println("Soma: " + String.format("%.2f", sum1));
		System.out.println("Soma: " + String.format("%.2f", sum2));
		
	
	
	
	
	}
}

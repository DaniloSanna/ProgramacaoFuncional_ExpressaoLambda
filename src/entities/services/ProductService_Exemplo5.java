package entities.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto_Exemplo5;

public class ProductService_Exemplo5 {
	
	public double filteredSum(List<Produto_Exemplo5> list, Predicate<Produto_Exemplo5> criteria) {
		double sum = 0;
		for(Produto_Exemplo5 p:list) {
			if(criteria.test(p)) {
				sum+=p.getPreco();
			}
		}
		return sum;
	}
	
	
	
	
	
	
}

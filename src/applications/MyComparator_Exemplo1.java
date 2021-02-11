package applications;

import java.util.Comparator;

import entities.Produto_Exemplo1;

public class MyComparator_Exemplo1 implements Comparator<Produto_Exemplo1>{


	
	@Override
	public int compare(Produto_Exemplo1 p1, Produto_Exemplo1 p2) {
	
		/*
		 * Positivo se p1>p2
		 * Zero se p1=p2
		 * Negativo se p1<p2
		 */
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	

}

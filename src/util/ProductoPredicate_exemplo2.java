package util;

import java.util.function.Predicate;

import entities.Produto_Exemplo2;

public class ProductoPredicate_exemplo2 implements Predicate<Produto_Exemplo2>{

	@Override
	public boolean test(Produto_Exemplo2 t) {
		return t.getPreco() >= 100.0;
	}

}

package util;

import java.util.function.Function;

import entities.Produto_Exemplo4;

public class Produto_Function implements Function<Produto_Exemplo4, String>{

	@Override
	public String apply(Produto_Exemplo4 t) {
		return 	t.getName().toUpperCase();
	}

}

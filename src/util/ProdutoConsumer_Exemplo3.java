package util;

import java.util.function.Consumer;

import entities.Produto_Exemplo3;

public class ProdutoConsumer_Exemplo3 implements Consumer<Produto_Exemplo3>{

	@Override
	public void accept(Produto_Exemplo3 t) {
		t.setPreco(t.getPreco()*1.10);
	}

}

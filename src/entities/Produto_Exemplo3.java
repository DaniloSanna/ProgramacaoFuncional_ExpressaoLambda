package entities;

public class Produto_Exemplo3 {
	private String name;
	private Double preco;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto_Exemplo3(String name, Double preco) {
		this.name = name;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [name: " + name + ", preco: " + String.format("%.2f", preco) + "]";
	}
	
	public static void staticaumentaPreco(Produto_Exemplo3 t) {
		t.setPreco(t.getPreco() * 1.1);
	}

}

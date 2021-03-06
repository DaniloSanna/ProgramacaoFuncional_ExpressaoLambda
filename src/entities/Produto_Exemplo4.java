package entities;

public class Produto_Exemplo4 {
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
	public Produto_Exemplo4(String name, Double preco) {
		this.name = name;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [name: " + name + ", preco: " + String.format("%.2f", preco) + "]";
	}

	public static String staticUpperCaseName(Produto_Exemplo4 t) {
		return t.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
}

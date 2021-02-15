package entities;

public class Funcionario_Exemplo9 {
	private String name, email;
	private Double salario;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Double getSalario() {
		return salario;
	}
	public Funcionario_Exemplo9(String name, String email, Double salario) {
		this.name = name;
		this.email = email;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [name: " + name + ", email: " + email + ", salario: " + salario + "]";
	}
	

}

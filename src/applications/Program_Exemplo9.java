package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Funcionario_Exemplo9;
import entities.Produto_Exemplo8;

public class Program_Exemplo9 {
	public static void main (String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(".\\.\\PastaBase\\Funcionarios.txt"))){
		
			List<Funcionario_Exemplo9> list = new ArrayList<>();
			String line = br.readLine();
			int imp = 0;
			while(line != null) {
				String[] quebra = line.split(",");
				list.add(new Funcionario_Exemplo9(quebra[0], quebra[1],Double.parseDouble(quebra[2])));
				System.out.println(list.get(imp).toString());
				imp+=1;
				line = br.readLine();
			}
			

			System.out.println();
			System.out.println("Ordem Crescente");
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p->p.getSalario() > 2000)
					.map(p-> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());

			names.forEach(System.out::println);
			
			System.out.println();
			System.out.println("Soma dos salários iniciados com letra M");
			
			double soma = list.stream()
					.filter(p->p.getName().charAt(0)=='M')
					.map(p-> p.getSalario())
					.reduce(0.0, (x,y)-> x+y);

			List<String> names2 = list.stream()
					.filter(p->p.getName().charAt(0)=='M')
					.map(p-> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			names2.forEach(System.out::println);
			System.out.println("Total: " + soma);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

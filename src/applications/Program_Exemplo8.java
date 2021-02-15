package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produto_Exemplo8;

public class Program_Exemplo8 {
	public static void main (String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(".\\.\\PastaBase\\ProdutosExemplo8.txt"))){
		
			List<Produto_Exemplo8> list = new ArrayList<>();
			String line = br.readLine();
			int imp = 0;
			while(line != null) {
				String[] quebra = line.split(",");
				list.add(new Produto_Exemplo8(quebra[0], Double.parseDouble(quebra[1])));
				System.out.println(list.get(imp).toString());
				imp+=1;
				line = br.readLine();
			}
			
			double media = list.stream()
					.map(p-> p.getPreco())
					.reduce(0.0, (x,y)-> x+y)/list.size();

			System.out.println();
			System.out.println("Média Preço: " + String.format("%.2f", media));
			
			System.out.println();
			System.out.println("Ordem Decrecente e Preço menor que média");
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p->p.getPreco() < media)
					.map(p-> p.toString())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Figura;
import entidades.enums.Color;
import entidades.Retangulo;
import entidades.Circulo;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		List <Figura> lista= new ArrayList<>();
		
		System.out.print("Entre com o número de figuras");
		int n= sc.nextInt();
		for( int i=1; i<=n; i++) {
			System.out.println("Figura #"+ i + "dados:");
			System.out.print("Retangulo ou Circulo (r/c)?");
			
			char ch= sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO):");
			Color color= Color.valueOf(sc.next());
			
			if(ch == 'r') {
			System.out.print("largura:");
			double largura= sc.nextDouble();
			System.out.print("altura:");
			double altura= sc.nextDouble();
			//falta instanciar o retangulo e armazenar lista
			lista.add(new Retangulo(color,largura,altura));
			}
			else {
				System.out.print("raio:");
				double raio = sc.nextDouble();
				lista.add(new Circulo(color,raio));
				
			}
		}
		System.out.println();
		System.out.println("AREA DAS FIGURAS:");
		for(Figura figura : lista) {
			System.out.println(String.format("%.2f",figura.area()));
		}
		sc.close();
	

	}

}

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArvoreBinaria<Integer> arvore_a = new ArvoreBinaria<>();
		ArvoreBinaria<Integer> arvore_b = new ArvoreBinaria<>();
		ArvoreBinaria<Integer> arvore_c = new ArvoreBinaria<>();
		
		No<Integer> no_a = new No<>(10);
		No<Integer> no_b = new No<>(8);
		No<Integer> no_c = new No<>(12);
		No<Integer> no_d = new No<>(3);
		No<Integer> no_e = new No<>(9);
		
		arvore_a.inserirNo(no_a);
		arvore_a.inserirNo(no_b);
		arvore_a.inserirNo(no_c);
		arvore_a.inserirNo(no_d);
		arvore_a.inserirNo(no_e);
		
		arvore_a.imprimir();
		System.out.println("Altura: " + arvore_a.altura());
		System.out.println("Resultado (buscar - 3): " + arvore_a.buscar("D").dado);
		System.out.println("Resultado (buscar - 15): " + arvore_a.buscar("F"));
		System.out.println("Resultado (buscar pai - 3): " + arvore_a.retornarPai("D").dado);
		System.out.println("Resultado (buscar pai - 15): " + arvore_a.retornarPai("F") + "\n");

		arvore_a.imprimirMD("arvore_generica_a1.md");		
		arvore_a.removerNo(3);		
		arvore_a.imprimirMD("arvore_generica_a2.md");
		arvore_a.removerNo(14);
		arvore_a.imprimirMD("arvore_generica_a3.md");

		// árvore somente com a raiz
		No<Integer> no_f = new No<>(54);
		arvore_b.criarRaiz(no_f);

		arvore_b.imprimir();
		arvore_b.imprimirMD("arvore_generica_b.md");
		System.out.println("Altura: " + arvore_b.altura());

		// árvore vazia
		arvore_c.imprimir();
		arvore_c.imprimirMD("arvore_generica_c.md");
		System.out.println("Altura: " + arvore_c.altura());

	}
}
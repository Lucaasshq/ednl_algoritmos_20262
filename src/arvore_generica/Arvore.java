import java.util.ArrayList;
import java.util.List;

class No<T> {
	T dado;
	List<No<T>> filhos;
	
	// construtor
	public No(T dado){
		this.dado = dado;
		this.filhos = new ArrayList<>();
	}
	
	// insere um filho à direita na lista
	public void inserirFilho(No<T> filho){
		this.filhos.add(filho);
	}
	
	// identifica se o nó é uma folha
	public boolean noFolha() {
		return this.filhos.isEmpty();
	}
	
}


public class Arvore<T> {
	No<T> raiz;
	
	public Arvore(T dadoRaiz){
		this.raiz = new No<>(dadoRaiz);
	}
	
	public void inserirNo(No<T> pai, T dadoFilho){
		if(pai != null){
			No<T> noFilho = new No<>(dadoFilho);
			pai.inserirFilho(noFilho);
		}
	}
	
	public void imprimir() {
		imprimirRecursivo(this.raiz);
		System.out.println("");
	}
	
	private void imprimirRecursivo(No<T> noAtual){
		if(noAtual == null) return;
		
		System.out.print(noAtual.dado + " ");
		
		for(No<T> filho: noAtual.filhos){
				imprimirRecursivo(filho);
		}
	
	}
}
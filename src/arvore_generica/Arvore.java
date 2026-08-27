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

	// construtor de árvore vazia
	public Arvore(){
		this.raiz = null;
	}

	// verifica se a árvore é vazia
	public boolean arvoreVazia(){
		if(this.raiz == null)
			return true;
		return false;
	}

	// criar uma raiz para a árvore vazia
	public void criarRaiz(No<T> raiz){
		if(this.arvoreVazia()) {
			this.raiz = raiz;
		}
	}

	// retorna a raiz da árvore
	public No<T> obterRaiz() {
		return this.raiz;
	}
	
	// insere um filho com a chave "dadoFilho" em "pai"
	public void inserirNo(No<T> pai, T dadoFilho){
		if(pai != null){
			No<T> noFilho = new No<>(dadoFilho);
			pai.inserirFilho(noFilho);
		}
	}

	public void inserirNo(No<T> pai, No<T> filho){
		if(pai != null){
			pai.inserirFilho(filho);
		}
	}

	public int altura(){
		if(this.arvoreVazia())
			return -1;
		else {
			return this.alturaNo(this.raiz);
		}
	}
	
	private int alturaNo(No<T> no){
		int maiorAltura = -1;
		
		for(No<T> filho: no.filhos){
			int alturaFilho = alturaNo(filho);
			if(alturaFilho > maiorAltura)
				maiorAltura = alturaFilho;
		}
		
		return maiorAltura + 1;
	}

	public No<T> buscar(T dado){
		if(this.arvoreVazia()){
			return null;
		}else {
			return buscarNo(this.raiz, dado);
		}
	}

	private No<T> buscarNo(No<T> noAtual, T dado){
		if(noAtual.dado == dado){ // nó contém o dado
			return noAtual;
		}else { // procurar o dado nos filhos do nó atual
			for(No<T> filho : noAtual.filhos) {
				No<T> no = buscarNo(filho, dado);
				if(no != null)
					return no;
			}
		}
		return null; // dado não encontrado!
	}

	// TODO
	public No<T> retornarPai(T dado){
		//...
		//return retornarPai(this.raiz, dado);
		return null;
	}
	
	// TODO
	private No<T> retornarPai(No<T> noAtual, T dado){
		// verificar se existe algum filho do "NoAtual" que é "dado".
		//return noAtual;
		// senão, para cada filho do noAtual ...
		return null;
	}

	public void imprimir() {
		imprimirRecursivo(this.raiz,"");
		System.out.println("");
	}
	
	private void imprimirRecursivo(No<T> noAtual, String recuo){
		if(noAtual == null) return;
		
		System.out.println(recuo + "+- " + noAtual.dado);
		
		for(No<T> filho: noAtual.filhos){
				imprimirRecursivo(filho, recuo + " ");
		}
	}
}
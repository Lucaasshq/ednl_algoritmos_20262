public class Main {
	public static void main(String[] args) {
		Arvore<String> arvore = new Arvore<>("A");
		
		arvore.inserirNo(arvore.raiz,"B");
		arvore.inserirNo(arvore.raiz,"C");
		
		No<String> no_b = arvore.raiz.filhos.get(0);
		arvore.inserirNo(no_b,"D");
		
		arvore.imprimir();
	}
}
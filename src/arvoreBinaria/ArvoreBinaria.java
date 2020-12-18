package arvoreBinaria;

public class ArvoreBinaria {
	private No raiz;
	
	
	public ArvoreBinaria(int valor) {
		this.adicionar(valor);
	}
	
	
	public void adicionar(int valor) {
		No novoNo = new No(valor);
		
		if(this.raiz == null) {
			this.raiz = novoNo;
		}else {
			No no = this.raiz;
			No pai = null;
			
			while(no != null) {
				if(novoNo.getValor() > no.getValor()) {
					pai = no;
					no = no.getDireito();
				}else {
					pai = no;
					no = no.getEsquerdo();
				}
			}
			
			if(novoNo.getValor() > pai.getValor()) 
				pai.setDireito(novoNo);
			else
				pai.setEsquerdo(novoNo);
			
		}
	}
	
	public No raiz() {
		return this.raiz;
	}
	
	
	
	
	
	

}

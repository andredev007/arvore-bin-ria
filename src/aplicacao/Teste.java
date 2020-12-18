package aplicacao;
import arvoreBinaria.ArvoreBinaria;
public class Teste {

	public static void main(String[] args) {
		ArvoreBinaria a = new ArvoreBinaria(10);
		
		a.adicionar(5);				//													10
		a.adicionar(13);			//									5									13
		a.adicionar(12);			//							4				6					12			15
		a.adicionar(11);			//					2									11
		a.adicionar(15);			//
		a.adicionar(4);				//
		a.adicionar(6);				//
		a.adicionar(2);				//

		
		System.out.println(a.raiz().getDireito().getEsquerdo().getEsquerdo().getValor());
	}

}

package br.mendonca.trabalho06;

import br.mendonca.trabalho06.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho06.tads.ThiagoBarrosTAD;

public class Launch {

	public static void main(String[] args) {
		ThiagoBarrosTAD elemento1 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento2 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento3 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento4 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento5 = new ThiagoBarrosTAD();

		ThiagoBarrosEstrutura pilhaDinamica = new ThiagoBarrosEstrutura();

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + elemento1.print());
		System.out.println("Elemento 2: " + elemento2.print());
		System.out.println("Elemento 3: " + elemento3.print());
		System.out.println("Elemento 4: " + elemento4.print());
		System.out.println("Elemento 5: " + elemento5.print());

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		System.out.println(pilhaDinamica.getLista());
		pilhaDinamica.push(elemento1);
		System.out.println("Printando o elemento 1: " + pilhaDinamica.get(0));
		pilhaDinamica.push(elemento2);
		pilhaDinamica.push(elemento3);
		System.out.println("Adicionando os elementos 1, 2 e 3 na pilha dinamica: \n" + pilhaDinamica.print());

		System.out.println("---------------------- Removendo elementos na lista ------------------------");
		System.out.println("Removendo um elemento da pilha dinamica e mostrando o elemento removido: \n" + pilhaDinamica.pop());
		System.out.println("\nEstado atual da lista: \n" + pilhaDinamica.print());
		System.out.println(pilhaDinamica.getLista());

		System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
		pilhaDinamica.push(elemento4);
		pilhaDinamica.pop();
		System.out.println("Adicionando e removendo da pilha dinamica: \n" + pilhaDinamica.print());
		pilhaDinamica.push(elemento5);
		pilhaDinamica.push(elemento1);
		pilhaDinamica.push(elemento2);
		System.out.println("\nTentando adicionar em uma lista cheia: " + pilhaDinamica.print());
		pilhaDinamica.push(elemento1);
		System.out.println("\nTentando remover itens em uma pilha dinamica vazia: \n");
		while (pilhaDinamica.getQuantidade() != 0){
			pilhaDinamica.pop();
		}
		pilhaDinamica.pop();
	}
}

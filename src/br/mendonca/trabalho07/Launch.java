package br.mendonca.trabalho07;

import br.mendonca.trabalho07.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho07.tads.ThiagoBarrosTAD;

public class Launch {
	public static void main(String[] args) {
		ThiagoBarrosTAD elemento1 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento2 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento3 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento4 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento5 = new ThiagoBarrosTAD();

		ThiagoBarrosEstrutura listaDinamicaDuplamenteEncadeada = new ThiagoBarrosEstrutura();

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + elemento1.print());
		System.out.println("Elemento 2: " + elemento2.print());
		System.out.println("Elemento 3: " + elemento3.print());
		System.out.println("Elemento 4: " + elemento4.print());
		System.out.println("Elemento 5: " + elemento5.print());
		System.out.println();

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		System.out.println(listaDinamicaDuplamenteEncadeada.getLista());
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento2);
		System.out.println("Testando o getLista() com um elemento" + listaDinamicaDuplamenteEncadeada.getLista());
		System.out.println("\nPrintando o elemento 1 da lista: " + listaDinamicaDuplamenteEncadeada.get(0));
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento1);
		listaDinamicaDuplamenteEncadeada.inserirNoFim(elemento3);
		System.out.println("Adicionando os elementos 1 e 3 na lista dinamica: \n" + listaDinamicaDuplamenteEncadeada.print());
		listaDinamicaDuplamenteEncadeada.inserirNoMeio(elemento4, 1);
		System.out.println("Testando o inserir no meio, inserindo o elemento 4 na posição 1: \n" + listaDinamicaDuplamenteEncadeada.print());

		System.out.println("Printando o elemento na posição 3 da lista: " + listaDinamicaDuplamenteEncadeada.get(3));
		System.out.println("---------------------- Removendo elementos na lista ------------------------");
		System.out.println("Removendo um elemento da lista dinamica e mostrando o elemento removido: \n" + listaDinamicaDuplamenteEncadeada.removerNoInicio());
		System.out.println("\nEstado atual da lista: \n" + listaDinamicaDuplamenteEncadeada.print());
		System.out.println(listaDinamicaDuplamenteEncadeada.getLista());

		System.out.println("\nRemovendo um elemento no início da lista e mostrando o elemento removido: \n" + listaDinamicaDuplamenteEncadeada.removerNoInicio());
		System.out.println("\nEstado atual da lista: \n" + listaDinamicaDuplamenteEncadeada.print());
		System.out.println("\nPrintando a quantidade de itens na lista: \n" + listaDinamicaDuplamenteEncadeada.getQuantidade());

		System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento1);
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento2);
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento3);
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento4);
		listaDinamicaDuplamenteEncadeada.inserirNoIncio(elemento5);
		System.out.println("\nColocando mais alguns elementos para teste: \n" + listaDinamicaDuplamenteEncadeada.print());
		System.out.println("\nRemovendo no fim e printando o elemento: \n" + listaDinamicaDuplamenteEncadeada.removerNoFim());
		System.out.println("Estado atual da lista: \n" + listaDinamicaDuplamenteEncadeada.print());

		System.out.println("\nRemovendo um item no meio da lista, na posição 2: \n" + listaDinamicaDuplamenteEncadeada.removerNoMeio(2));
		System.out.println("\nEstado atual da lista: \n" + listaDinamicaDuplamenteEncadeada.print());

		System.out.println("\nTentando excluir o último elemento pelo .removerNoMeio(): \n" + listaDinamicaDuplamenteEncadeada.removerNoMeio(listaDinamicaDuplamenteEncadeada.getQuantidade() - 1));
		System.out.println("\nEstado atual da lista: \n" + listaDinamicaDuplamenteEncadeada.print());

		listaDinamicaDuplamenteEncadeada.removerNoFim();
		listaDinamicaDuplamenteEncadeada.removerNoInicio();
		System.out.println("\nAdicionando e removendo da pilha dinamica: \n" + listaDinamicaDuplamenteEncadeada.print());
		listaDinamicaDuplamenteEncadeada.removerNoFim();
		listaDinamicaDuplamenteEncadeada.inserirNoFim(elemento5);
		listaDinamicaDuplamenteEncadeada.inserirNoMeio(elemento1, 1);
		System.out.println("\nTentando adicionar em uma lista cheia: " + listaDinamicaDuplamenteEncadeada.print());
		System.out.println("\nTentando remover itens em uma pilha dinamica vazia: \n");
		while (listaDinamicaDuplamenteEncadeada.getQuantidade() != 0){
			listaDinamicaDuplamenteEncadeada.removerNoInicio();
			listaDinamicaDuplamenteEncadeada.removerNoFim();
		}

		// Testando novamente só para ter certeza:
		listaDinamicaDuplamenteEncadeada.removerNoFim();
		listaDinamicaDuplamenteEncadeada.removerNoInicio();
		System.out.println("Estado atual da lista: " + listaDinamicaDuplamenteEncadeada.print());
	}
}
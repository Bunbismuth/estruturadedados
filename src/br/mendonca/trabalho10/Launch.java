package br.mendonca.trabalho10;

import br.mendonca.trabalho10.buscas.ThiagoBarrosBusca;
import br.mendonca.trabalho10.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho10.tads.ThiagoBarrosTAD;

public class Launch {

	public static void main(String[] args) {
		ThiagoBarrosBusca busca = new ThiagoBarrosBusca();
		ThiagoBarrosEstrutura listaEstatica = new ThiagoBarrosEstrutura(10);
		ThiagoBarrosTAD produto1 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD produto2 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD produto3 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD produto4 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD produto5 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD produto6 = new ThiagoBarrosTAD();

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + produto1.print());
		System.out.println("Elemento 2: " + produto2.print());
		System.out.println("Elemento 3: " + produto3.print());
		System.out.println("Elemento 4: " + produto4.print());
		System.out.println("Elemento 5: " + produto5.print());
		System.out.println("Elemento 5: " + produto6.print());

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		System.out.println("\nTestando as buscas com a lista vazia, para ver possíveis erros: ");
		busca.linear(listaEstatica, produto4);
		busca.ordenada(listaEstatica, produto4);
		busca.binaria(listaEstatica, produto4);
		System.out.println();

		listaEstatica.inserirNoInicio(produto3);
		listaEstatica.inserirNoInicio(produto1);
		listaEstatica.inserirNoMeio(produto2, 1);
		System.out.println("Elemento 3 adicionado no início, elemento 1 adicionado no início e elemento 2 adicionado na posição 1\n" + listaEstatica.print());

		listaEstatica.inserirNoFim(produto4);
		listaEstatica.inserirNoFim(produto5);
		System.out.println("\nElementos 4 e 5 adicionados ao fim, um após o outro: \n" + listaEstatica.print());

		System.out.println("\nMostrando o elemento da posição 3 da lista");
		System.out.println(listaEstatica.getItem(3));

		System.out.println("\n---------------------- Buscando o Elemento 5 ------------------------");
		System.out.println("\nMostrando o elemento 5 para fazer a busca: \n" + produto5.print());
		System.out.println();
		System.out.println("\nTestando a Busca Ordenada na lista: \n" + busca.ordenada(listaEstatica, produto5));
		System.out.println();
		System.out.println("\nTestando a Busca Linear na lista: \n" + busca.linear(listaEstatica, produto5));
		System.out.println();
		System.out.println("\nTestando a Busca Binaria na lista: \n" + busca.binaria(listaEstatica, produto5));

		System.out.println("\n---------------------- Buscando o Elemento 2 ------------------------");
		System.out.println("\nMostrando o elemento 2 para fazer a busca: \n" + produto2.print());
		System.out.println();
		System.out.println("\nTestando a Busca Ordenada na lista: \n" + busca.ordenada(listaEstatica, produto2));
		System.out.println();
		System.out.println("\nTestando a Busca Linear na lista: \n" + busca.linear(listaEstatica, produto2));
		System.out.println();
		System.out.println("\nTestando a Busca Binaria na lista: \n" + busca.binaria(listaEstatica, produto2));

		System.out.println("\n---------------------- Buscando o Elemento 6 (não está na lista) ------------------------");
		System.out.println("\nMostrando o elemento 6 para fazer a busca: \n" + produto6.print());
		System.out.println("\nTestando a Busca Ordenada na lista: \n" + busca.ordenada(listaEstatica, produto6));
		System.out.println("\nTestando a Busca Linear na lista: \n" + busca.linear(listaEstatica, produto6));
		System.out.println("\nTestando a Busca Binaria na lista: \n" + busca.binaria(listaEstatica, produto6));

		System.out.println("---------------------- Removendo elementos na lista ------------------------");
		listaEstatica.excluirNoFim();
		System.out.println("\nExcluindo o elemento final da lista: " + listaEstatica.print());

		listaEstatica.excluirNoMeio(1);
		listaEstatica.excluirNoInicio();
		System.out.println("\nExcluindo o elemento da posição 1 e depois excluindo o elemento inicial da lista: " + listaEstatica.print());

		System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
		System.out.println("\nTentando excluir um item numa posição inexistente (no caso a posição 2): " + listaEstatica.print());
		listaEstatica.excluirNoMeio(2);

		listaEstatica.excluirNoInicio();
		listaEstatica.excluirNoInicio();
		System.out.println("\nUtilizando todos os métodos para excluir numa lista vazia:");
		listaEstatica.excluirNoInicio();
		listaEstatica.excluirNoMeio(0);
		listaEstatica.excluirNoFim();
	}
}

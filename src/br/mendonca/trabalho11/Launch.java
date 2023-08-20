package br.mendonca.trabalho11;

import br.mendonca.trabalho11.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho11.sorts.ThiagoBarrosSort;
import br.mendonca.trabalho11.tads.ThiagoBarrosTAD;

public class Launch {

	public static void main(String[] args) {
		ISort sort = new ThiagoBarrosSort();
		ITrabalho11 listaEstatica = new ThiagoBarrosEstrutura(10);
		ITAD produto1 = new ThiagoBarrosTAD();
		ITAD produto2 = new ThiagoBarrosTAD();
		ITAD produto3 = new ThiagoBarrosTAD();
		ITAD produto4 = new ThiagoBarrosTAD();
		ITAD produto5 = new ThiagoBarrosTAD();
		ITAD produto6 = new ThiagoBarrosTAD();

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + produto1.print());
		System.out.println("Elemento 2: " + produto2.print());
		System.out.println("Elemento 3: " + produto3.print());
		System.out.println("Elemento 4: " + produto4.print());
		System.out.println("Elemento 5: " + produto5.print());
		System.out.println("Elemento 6: " + produto6.print());

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		System.out.println("\nTestando com a lista vazia: ");
		sort.bubble(listaEstatica);

		listaEstatica.inserirNoInicio(produto3);
		listaEstatica.inserirNoInicio(produto1);
		listaEstatica.inserirNoMeio(produto2, 1);
		System.out.println("Elemento 3 adicionado no início, elemento 1 adicionado no início e elemento 2 adicionado na posição 1\n" + listaEstatica.print());

		listaEstatica.inserirNoFim(produto4);
		listaEstatica.inserirNoFim(produto5);
		System.out.println("\nElementos 4 e 5 adicionados ao fim, um após o outro: \n" + listaEstatica.print());

		System.out.println("\nMostrando o elemento da posição 3 da lista");
		System.out.println(listaEstatica.getItem(3));

		System.out.println("\nMostrando os elementos desordenados:");
		System.out.println("\nMostrando a lista antes da ordenação: " + listaEstatica.print());
		System.out.println("\nDouble referente ao elemento 1: " + listaEstatica.getItem(0).getDouble());
		System.out.println("\nDouble referente ao elemento 2: " + listaEstatica.getItem(1).getDouble());
		System.out.println("\nDouble referente ao elemento 3: " + listaEstatica.getItem(2).getDouble());
		System.out.println("\nDouble referente ao elemento 4: " + listaEstatica.getItem(3).getDouble());
		System.out.println("\nDouble referente ao elemento 5: " + listaEstatica.getItem(4).getDouble());

		sort.bubble(listaEstatica);
		System.out.println("\nMostrando os elemento após ordenar:");
		System.out.println("\nMostrando a lista depois da ordenação: " + listaEstatica.print());
		System.out.println("\nDouble referente ao elemento 1: " + listaEstatica.getItem(0).getDouble());
		System.out.println("\nDouble referente ao elemento 2: " + listaEstatica.getItem(1).getDouble());
		System.out.println("\nDouble referente ao elemento 3: " + listaEstatica.getItem(2).getDouble());
		System.out.println("\nDouble referente ao elemento 4: " + listaEstatica.getItem(3).getDouble());
		System.out.println("\nDouble referente ao elemento 5: " + listaEstatica.getItem(4).getDouble());

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

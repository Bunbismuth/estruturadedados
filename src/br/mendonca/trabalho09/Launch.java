package br.mendonca.trabalho09;

import br.mendonca.trabalho09.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho09.tads.ThiagoBarrosTAD;

public class Launch {
	public static void main(String[] args) {
		ThiagoBarrosTAD elemento1 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento2 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento3 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento4 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento5 = new ThiagoBarrosTAD();

		ThiagoBarrosEstrutura listaSequencialDinamicaCircular = new ThiagoBarrosEstrutura();

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + elemento1.print());
		System.out.println("Elemento 2: " + elemento2.print());
		System.out.println("Elemento 3: " + elemento3.print());
		System.out.println("Elemento 4: " + elemento4.print());
		System.out.println("Elemento 5: " + elemento5.print());
		System.out.println();

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		System.out.println(listaSequencialDinamicaCircular.getLista());
		listaSequencialDinamicaCircular.inserirAntes(elemento2);
		System.out.println("Testando o getLista() com um elemento \n" + listaSequencialDinamicaCircular.getLista());
		System.out.println("\nPrintando o elemento 1 da lista: " + listaSequencialDinamicaCircular.get(0));

		System.out.println("\nMostrando onde tá o cursor: " + listaSequencialDinamicaCircular.getAtual());
		listaSequencialDinamicaCircular.inserirAntes(elemento1);

		listaSequencialDinamicaCircular.deslocarCursor(3);
		System.out.println("\nDeslocando o cursor e mostrando onde tá" + listaSequencialDinamicaCircular.getAtual());
		listaSequencialDinamicaCircular.inserirDepois(elemento3);
		System.out.println("Adicionando os elementos 1 e 3 na lista dinamica: \n" + listaSequencialDinamicaCircular.print());
		listaSequencialDinamicaCircular.inserirAntes(elemento4);
		System.out.println("\nPrintando o elemento 4: \n" + elemento4.print());
		System.out.println("Testando o inserir no meio, inserindo o elemento 4 na posição 1: \n" + listaSequencialDinamicaCircular.print());

		System.out.println("\n---------------------- Removendo elementos na lista ------------------------");
		System.out.println("Mostrando onde tá o cursor: " + listaSequencialDinamicaCircular.getAtual());
		System.out.println("Removendo um elemento do início da lista dinamica e mostrando o elemento removido: \n" + listaSequencialDinamicaCircular.removerAntes());
		System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());
		System.out.println(listaSequencialDinamicaCircular.getLista());

		System.out.println("\nMostrando onde tá o cursor: " + listaSequencialDinamicaCircular.getAtual());
		System.out.println("\nRemovendo um elemento depois do cursor e mostrando o elemento removido: \n" + listaSequencialDinamicaCircular.removerDepois());
		System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());
		System.out.println("\nPrintando a quantidade de itens na lista: \n" + listaSequencialDinamicaCircular.getQuantidade());

		System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
		listaSequencialDinamicaCircular.inserirAntes(elemento1);
		listaSequencialDinamicaCircular.inserirAntes(elemento2);
		listaSequencialDinamicaCircular.inserirAntes(elemento3);
		listaSequencialDinamicaCircular.inserirAntes(elemento4);
		listaSequencialDinamicaCircular.inserirAntes(elemento5);

		System.out.println("\nColocando mais alguns elementos para teste: \n" + listaSequencialDinamicaCircular.print());
		System.out.println("\nMostrando a quantidade de elementos da lista: \n" + listaSequencialDinamicaCircular.getQuantidade());
		System.out.println("\nMostrando onde tá o cursor" + listaSequencialDinamicaCircular.getAtual());
		System.out.println("\nTestando o método get com os 6 elementos da lista");
		System.out.println("\nNa posição -2" + listaSequencialDinamicaCircular.get(-2));
		System.out.println("\nNa posição 10" + listaSequencialDinamicaCircular.get(10));
		System.out.println("\nNa posição -6" + listaSequencialDinamicaCircular.get(-6));

		System.out.println("\nMostrando onde o cursor está: " + listaSequencialDinamicaCircular.getAtual());
		System.out.println("\nRemovendo antes do cursor e printando o elemento: \n" + listaSequencialDinamicaCircular.removerAntes());
		System.out.println("Estado atual da lista: \n" + listaSequencialDinamicaCircular.print());
		System.out.println("\nPosição do cursor: \n" + listaSequencialDinamicaCircular.getAtual());
		System.out.println("\nRemovendo um item depois do cursor: \n" + listaSequencialDinamicaCircular.removerDepois());
		System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());

		System.out.println("\nTentando excluir o elemento anterior ao atual: \n" + listaSequencialDinamicaCircular.removerAntes());
		System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());

		listaSequencialDinamicaCircular.removerAntes();
		listaSequencialDinamicaCircular.removerAntes();
		System.out.println("\nAdicionando e removendo da pilha dinamica: \n" + listaSequencialDinamicaCircular.print());
		listaSequencialDinamicaCircular.removerAntes();
		listaSequencialDinamicaCircular.inserirDepois(elemento5);
		listaSequencialDinamicaCircular.inserirDepois(elemento1);
		System.out.println("\nTentando adicionar em uma lista cheia: " + listaSequencialDinamicaCircular.print());
		System.out.println("\nTentando remover itens em uma pilha dinamica vazia: \n");
		while (listaSequencialDinamicaCircular.getQuantidade() != 0){
		listaSequencialDinamicaCircular.removerDepois();
		listaSequencialDinamicaCircular.removerAntes();
		}
		// Testando novamente só para ter certeza:
		listaSequencialDinamicaCircular.removerAntes();
		listaSequencialDinamicaCircular.removerDepois();
		System.out.println("Testando a quantidade final da lista: \n" + listaSequencialDinamicaCircular.getQuantidade());
		System.out.println("Estado atual da lista: " + listaSequencialDinamicaCircular.print());
	}
}

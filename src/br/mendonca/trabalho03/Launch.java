package br.mendonca.trabalho03;

import br.mendonca.trabalho03.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho03.tads.ThiagoBarrosTAD;

import java.util.Arrays;

public class Launch {

	public static void main(String[] args) {
		ThiagoBarrosTAD elemento1 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento2 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento3 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento4 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento5 = new ThiagoBarrosTAD();

		ThiagoBarrosEstrutura filaEstatica = new ThiagoBarrosEstrutura(5);

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + elemento1.print());
		System.out.println("Elemento 2: " + elemento2.print());
		System.out.println("Elemento 3: " + elemento3.print());
		System.out.println("Elemento 4: " + elemento4.print());
		System.out.println("Elemento 5: " + elemento5.print());

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		System.out.println("Estado inicial da fila estática:" + filaEstatica.print());
		filaEstatica.enqueue(elemento1);
		filaEstatica.enqueue(elemento2);
		filaEstatica.enqueue(elemento3);
		System.out.println("\nAdicionando os elementos 1, 2 e 3 na fila: \n" + filaEstatica.print());

		System.out.println("---------------------- Removendo elementos na lista ------------------------");
		System.out.println("Removendo um elemento da fila e mostrando o elemento removido: \n" + filaEstatica.dequeue());
		System.out.println("\nEstado atual da lista: \n" + filaEstatica.print());
		System.out.println(Arrays.toString(filaEstatica.getLista()));

		System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
		filaEstatica.enqueue(elemento4);
		filaEstatica.dequeue();
		System.out.println("Adicionando e removendo da fila: \n" + filaEstatica.print());
		filaEstatica.enqueue(elemento5);
		filaEstatica.enqueue(elemento1);
		filaEstatica.enqueue(elemento2);
		System.out.println("\nTentando adicionar em uma lista cheia: " + filaEstatica.print());
		filaEstatica.enqueue(elemento1);
		System.out.println("\nTentando remover itens em uma lista vazia: \n");
		while (filaEstatica.getQuantidade() != 0){
			filaEstatica.dequeue();
		}
		filaEstatica.dequeue();
		filaEstatica.enqueue(elemento1);
		filaEstatica.enqueue(elemento2);
		System.out.println(filaEstatica.print());

		System.out.println("Removendo e printando o elemento removido:\n" + filaEstatica.dequeue());
		System.out.println(filaEstatica.print());
		System.out.println("Removendo e printando o elemento removido\n" + filaEstatica.dequeue());
	}

}
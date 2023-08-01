package br.mendonca.trabalho05;

import br.mendonca.trabalho05.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho05.tads.ThiagoBarrosTAD;

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
		filaEstatica.push(elemento1);
		filaEstatica.push(elemento2);
		filaEstatica.push(elemento3);
		System.out.println("Adicionando os elementos 1, 2 e 3 na fila: \n" + filaEstatica.print());

		System.out.println("---------------------- Removendo elementos na lista ------------------------");
		System.out.println("Removendo um elemento da fila e mostrando o elemento removido: \n" + filaEstatica.pop());
		System.out.println("\nEstado atual da lista: \n" + filaEstatica.print());
		System.out.println(Arrays.toString(filaEstatica.getLista()));

		System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
		filaEstatica.push(elemento4);
		filaEstatica.pop();
		System.out.println("Adicionando e removendo da fila: \n" + filaEstatica.print());
		filaEstatica.push(elemento5);
		filaEstatica.push(elemento1);
		filaEstatica.push(elemento2);
		System.out.println("\nTentando adicionar em uma lista cheia: " + filaEstatica.print());
		filaEstatica.push(elemento1);
		System.out.println("\nTentando remover itens em uma lista vazia: \n");
		while (filaEstatica.getQuantidade() != 0){
			filaEstatica.pop();
		}
		filaEstatica.pop();
	}
}

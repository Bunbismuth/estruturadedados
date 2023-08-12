package br.mendonca.trabalho08;

import br.mendonca.trabalho08.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho08.tads.ThiagoBarrosTAD;

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
        System.out.println(listaSequencialDinamicaCircular.get(1));
        System.out.println(listaSequencialDinamicaCircular.getLista());
        listaSequencialDinamicaCircular.inserirNoIncio(elemento2);
        System.out.println("Testando o getLista() com um elemento \n" + listaSequencialDinamicaCircular.getLista());
        System.out.println("\nPrintando o elemento 1 da lista: " + listaSequencialDinamicaCircular.get(0));
        listaSequencialDinamicaCircular.inserirNoIncio(elemento1);
        listaSequencialDinamicaCircular.inserirNoFim(elemento3);
        System.out.println("Adicionando os elementos 1 e 3 na lista dinamica: \n" + listaSequencialDinamicaCircular.print());
        listaSequencialDinamicaCircular.inserirNoMeio(elemento4, 1);
        System.out.println("\nPrintando o elemento 4: \n" + elemento4.print());
        System.out.println("Testando o inserir no meio, inserindo o elemento 4 na posição 1: \n" + listaSequencialDinamicaCircular.print());

        System.out.println("\n---------------------- Removendo elementos na lista ------------------------");
        System.out.println("Removendo um elemento do início da lista dinamica e mostrando o elemento removido: \n" + listaSequencialDinamicaCircular.removerNoInicio());
        System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());
        System.out.println(listaSequencialDinamicaCircular.getLista());

        System.out.println("\nRemovendo um elemento no fim da lista e mostrando o elemento removido: \n" + listaSequencialDinamicaCircular.removerNoFim());
        System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());
        System.out.println("\nPrintando a quantidade de itens na lista: \n" + listaSequencialDinamicaCircular.getQuantidade());

        System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
        listaSequencialDinamicaCircular.inserirNoIncio(elemento1);
        listaSequencialDinamicaCircular.inserirNoIncio(elemento2);
        listaSequencialDinamicaCircular.inserirNoIncio(elemento3);
        listaSequencialDinamicaCircular.inserirNoIncio(elemento4);
        listaSequencialDinamicaCircular.inserirNoIncio(elemento5);
        System.out.println("\nColocando mais alguns elementos para teste: \n" + listaSequencialDinamicaCircular.print());
        System.out.println("\nMostrando a quantidade de elementos da lista: \n" + listaSequencialDinamicaCircular.getQuantidade());

        System.out.println("\nTestando o método get com os 6 elementos da lista");
        System.out.println("\nNa posição -2" + listaSequencialDinamicaCircular.get(-2));
        System.out.println("\nNa posição 10" + listaSequencialDinamicaCircular.get(10));
        System.out.println("\nNa posição -6" + listaSequencialDinamicaCircular.get(-6));

        System.out.println("\nRemovendo no fim e printando o elemento: \n" + listaSequencialDinamicaCircular.removerNoFim());
        System.out.println("Estado atual da lista: \n" + listaSequencialDinamicaCircular.print());

        System.out.println("\nRemovendo um item no meio da lista, na posição 2: \n" + listaSequencialDinamicaCircular.removerNoMeio(2));
        System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());

        System.out.println("\nTentando excluir o último elemento pelo .removerNoMeio(): \n" + listaSequencialDinamicaCircular.removerNoMeio(listaSequencialDinamicaCircular.getQuantidade() - 1));
        System.out.println("\nEstado atual da lista: \n" + listaSequencialDinamicaCircular.print());

        listaSequencialDinamicaCircular.removerNoFim();
        listaSequencialDinamicaCircular.removerNoInicio();
        System.out.println("\nAdicionando e removendo da pilha dinamica: \n" + listaSequencialDinamicaCircular.print());
        listaSequencialDinamicaCircular.removerNoFim();
        listaSequencialDinamicaCircular.inserirNoFim(elemento5);
        listaSequencialDinamicaCircular.inserirNoMeio(elemento1, 1);
        System.out.println("\nTentando adicionar em uma lista cheia: " + listaSequencialDinamicaCircular.print());
        System.out.println("\nTentando remover itens em uma pilha dinamica vazia: \n");
        while (listaSequencialDinamicaCircular.getQuantidade() != 0){
            listaSequencialDinamicaCircular.removerNoInicio();
            listaSequencialDinamicaCircular.removerNoFim();
        }

        // Testando novamente só para ter certeza:
        listaSequencialDinamicaCircular.removerNoFim();
        listaSequencialDinamicaCircular.removerNoInicio();
        System.out.println("Testando a quantidade final da lista: \n" + listaSequencialDinamicaCircular.getQuantidade());
        System.out.println("Estado atual da lista: " + listaSequencialDinamicaCircular.print());

    }
}

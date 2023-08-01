package br.mendonca.trabalho04.estruturas;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.ITrabalho04;
import br.mendonca.trabalho04.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho04 {
    private ThiagoBarrosElemento cabeca;
    private ThiagoBarrosElemento inicio;
    private int quantidade = 0;
    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public Object getLista() {
        if (inicio == null){
            return null;
        } else {
            return inicio.getItad();
        }
    }

    @Override
    public void enqueue(ITAD tad) {
        ThiagoBarrosElemento novo = new ThiagoBarrosElemento(tad);

        novo.setNext(cabeca);
        cabeca = novo;
        if (quantidade == 0){
            inicio = novo;
        }
        quantidade++;
    }

    @Override
    public ITAD dequeue() {
        if (quantidade == 0) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
            return null;
        } else {
            ThiagoBarrosElemento cursor = cabeca;
            ThiagoBarrosElemento anterior = cabeca;
            while (cursor.getNext() != null){
                anterior = cursor;
                cursor = cursor.getNext();
            }
            ThiagoBarrosElemento topoPrint = cursor;
            inicio = anterior;
            inicio.setNext(null);
            quantidade--;
            return topoPrint.getItad();
        }
    }

    @Override
    public ITAD get(int posicao) {

        if (posicao < 0 || posicao > quantidade - 1) return null;

        ThiagoBarrosElemento cursor = inicio;
        for(int i = 0; i < posicao; i++){
            cursor = cursor.getNext();
        }
        return cursor.getItad();
    }

    @Override
    public String print() {
        if (quantidade == 0) {
            return "Lista vazia";
        } else {
            StringBuilder matriz = new StringBuilder();

            ThiagoBarrosElemento cursor = cabeca;
            for (int i = quantidade; i > 0; i--){
                matriz.append("\n" + i + "." + cursor.getItad().print());
                cursor = cursor.getNext();
            }
            return matriz.toString();
        }
    }
}


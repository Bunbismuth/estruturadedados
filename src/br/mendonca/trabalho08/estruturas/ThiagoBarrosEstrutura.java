package br.mendonca.trabalho08.estruturas;

import br.mendonca.trabalho08.IElemento;
import br.mendonca.trabalho08.ITAD;
import br.mendonca.trabalho08.ITrabalho08;
import br.mendonca.trabalho08.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho08 {
    private IElemento inicio;
    private int quantidade = 0;

    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public Object getLista() {
        if (inicio == null) return null;

        return inicio.getTad();
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void inserirNoIncio(ITAD tad) {
        IElemento novo = new ThiagoBarrosElemento(tad);

        if (quantidade == 0){
            inicio = novo;
            novo.setNext(novo);
        } else {
            IElemento cursor = inicio;
            while (cursor.getNext() != inicio){
                cursor = cursor.getNext();
            }
            cursor.setNext(novo);
            novo.setNext(inicio);
            inicio = novo;
        }
        quantidade++;
    }


    @Override
    public void inserirNoFim(ITAD tad) {
        IElemento novo = new ThiagoBarrosElemento(tad);

        if (quantidade == 0) {
            inicio = novo;
            novo.setNext(novo);
        } else {
            IElemento cursor = inicio;
            while (cursor.getNext() != inicio) {
                cursor = cursor.getNext();
            }
            cursor.setNext(novo);
            novo.setNext(inicio);
        }
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantidade - 1) return;
        if (posicao == 0) this.inserirNoIncio(tad);
        if (posicao == quantidade -1) this.inserirNoFim(tad);

        IElemento novo = new ThiagoBarrosElemento(tad);

        IElemento cursor = this.inicio;
        IElemento anterior = inicio;

        for (int i = 0; i < posicao; i++){
            anterior = cursor;
            cursor = cursor.getNext();
        }

        novo.setNext(cursor);
        anterior.setNext(novo);
        quantidade++;
    }

    @Override
    public ITAD removerNoInicio() {
        if (quantidade == 0) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
            return null;
        } else {
            IElemento printInicio = inicio;
            IElemento inicioNovo = inicio.getNext();

            IElemento cursor = inicio;
            while(cursor.getNext() != inicio){
                cursor = cursor.getNext();
            }
            cursor.setNext(inicioNovo);
            inicioNovo.setNext(inicio.getNext().getNext());
            inicio = inicioNovo;

            quantidade--;
            return printInicio.getTad();
        }
    }

    @Override
    public ITAD removerNoFim() {
        if (quantidade == 0) {
            System.out.println("A lista já está vazia.");
            return null;
        } else {
            IElemento cursor = inicio;
            IElemento anterior = inicio;
            while (cursor.getNext() != inicio) {
                anterior = cursor;
                cursor = cursor.getNext();
            }
            anterior.setNext(inicio);
            quantidade--;
            return cursor.getTad();
        }
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if (posicao < 0 || posicao > quantidade){
            throw new IndexOutOfBoundsException();
        }
        if (quantidade == 0) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
            return null;
        } else {
            IElemento cursor = inicio;
            IElemento anterior = inicio;

            for(int i = 0; i < posicao; i++){
                anterior = cursor;
                cursor = cursor.getNext();
            }
            IElemento printElemento = cursor;
            anterior.setNext(cursor.getNext());
            quantidade--;

            return printElemento.getTad();
        }
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 && (posicao*-1) <= (quantidade - 1)){
            posicao = (quantidade-1) + posicao;
        }
        if (posicao < 0 && (posicao*-1) > (quantidade - 1)){
            posicao = (quantidade-1) + (posicao%(quantidade-1));
        }
        if (posicao > quantidade - 1){
            posicao = posicao%(quantidade-1);
        }

        IElemento cursor = inicio;
        for (int i = 0; i < posicao; i++){
            cursor = cursor.getNext();
        }
        return cursor.getTad();
    }

    @Override
    public String print() {
        if (quantidade == 0) {
            return "Lista vazia";
        } else {
            StringBuilder matriz = new StringBuilder();

            IElemento cursor = inicio;
            for (int i = 0; i < quantidade; i++){
                matriz.append("\n" + i + "." + cursor.getTad().print());
                cursor = cursor.getNext();
            }
            return matriz.toString();
        }
    }
}
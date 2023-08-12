package br.mendonca.trabalho09.estruturas;

import br.mendonca.trabalho09.IElemento;
import br.mendonca.trabalho09.ITAD;
import br.mendonca.trabalho09.ITrabalho09;
import br.mendonca.trabalho09.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho09 {
    private IElemento cursor;
    private int quantidade = 0;

    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public Object getLista() {
        if (quantidade == 0) return null;

        return this.cursor.getTad();
    }

    @Override
    public void inserirAntes(ITAD tad) {
        IElemento novo = new ThiagoBarrosElemento();
        novo.setTad(tad);

        if (cursor == null){
            cursor = novo;
            cursor.setNext(novo);
            cursor.setPrevious(novo);
        } else {
            novo.setNext(cursor);
            novo.setPrevious(cursor.getPrevious());
            IElemento anterior = cursor.getPrevious();
            anterior.setNext(novo);
            cursor.setPrevious(novo);
        }

        quantidade++;
    }

    @Override
    public void inserirDepois(ITAD tad) {
        IElemento novo = new ThiagoBarrosElemento();
        novo.setTad(tad);

        if (cursor == null){
            cursor = novo;
            cursor.setNext(novo);
            cursor.setPrevious(novo);
        } else {
            novo.setNext(cursor.getNext());
            novo.setPrevious(cursor);
            IElemento proximo = cursor.getNext();
            proximo.setPrevious(novo);
            cursor.setNext(novo);
        }
        quantidade++;
    }

    @Override
    public void deslocarCursor(int posicao) {
        while (posicao != 0){
            if (posicao > 0){
                cursor = cursor.getNext();
                posicao--;
            } else {
                cursor = cursor.getPrevious();
                posicao++;
            }
        }
    }

    @Override
    public ITAD removerAntes() {
        if (quantidade == 0) return null;
        IElemento elemento = cursor.getPrevious();
        IElemento anteriorElem = elemento.getPrevious();

        anteriorElem.setNext(cursor);
        cursor.setPrevious(anteriorElem);

        quantidade--;
        return elemento.getTad();
    }

    @Override
    public ITAD removerDepois() {
        if (quantidade == 0) return null;

        IElemento elemento = cursor.getNext();
        IElemento posteriorElem = elemento.getNext();

        posteriorElem.setPrevious(cursor);
        cursor.setNext(posteriorElem);

        quantidade--;
        return elemento.getTad();
    }

    @Override
    public ITAD getAtual() {
        if (quantidade == 0) return null;

        return this.cursor.getTad();
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

        IElemento inicio = cursor;
        while (posicao != 0) {
            inicio = inicio.getNext();
            posicao--;
        }

        return inicio.getTad();
    }

    @Override
    public String print() {
        if (quantidade == 0) {
            return "Lista vazia";
        } else {
            StringBuilder matriz = new StringBuilder();

            IElemento inicio = this.cursor;
            for (int i = 0; i < quantidade; i++){
                matriz.append("\n" + i + "." + inicio.getTad().print());
                inicio = inicio.getNext();
            }
            return matriz.toString();
        }
    }
}
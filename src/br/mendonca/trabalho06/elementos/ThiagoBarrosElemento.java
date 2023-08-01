package br.mendonca.trabalho06.elementos;

import br.mendonca.trabalho06.ITAD;

public class ThiagoBarrosElemento {
    private ITAD itad;
    private ThiagoBarrosElemento next;

    public ThiagoBarrosElemento(ITAD itad){
        super();
        this.itad = itad;
    }

    public ITAD getItad() {
        return itad;
    }

    public void setItad(ITAD itad) {
        this.itad = itad;
    }

    public ThiagoBarrosElemento getNext() {
        return next;
    }

    public void setNext(ThiagoBarrosElemento next) {
        this.next = next;
    }
}


package br.mendonca.trabalho08.elementos;

import br.mendonca.trabalho08.IElemento;
import br.mendonca.trabalho08.ITAD;

public class ThiagoBarrosElemento implements IElemento {
    private ITAD itad;
    private IElemento next;
    public ThiagoBarrosElemento(ITAD itad){
        super();
        this.itad = itad;
    }

    @Override
    public ITAD getTad() {
        return itad;
    }

    @Override
    public void setTad(ITAD tad) {
        this.itad = tad;
    }

    @Override
    public IElemento getNext() {
        return next;
    }

    @Override
    public void setNext(IElemento next) {
        this.next = next;
    }
}
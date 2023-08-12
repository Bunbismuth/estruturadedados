package br.mendonca.trabalho09.elementos;

import br.mendonca.trabalho09.IElemento;
import br.mendonca.trabalho09.ITAD;

public class ThiagoBarrosElemento implements IElemento {
    private ITAD tad;
    private IElemento proximo;
    private IElemento anterior;

    @Override
    public ITAD getTad() {
        return tad;
    }

    @Override
    public void setTad(ITAD tad) {
        this.tad = tad;
    }

    @Override
    public IElemento getNext() {
        return proximo;
    }

    @Override
    public void setNext(IElemento next) {
        this.proximo = next;
    }

    @Override
    public IElemento getPrevious() {
        return anterior;
    }

    @Override
    public void setPrevious(IElemento previous) {
        this.anterior = previous;
    }
}
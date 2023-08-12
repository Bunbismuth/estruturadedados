package br.mendonca.trabalho07.estruturas;

import br.mendonca.trabalho07.IElemento;
import br.mendonca.trabalho07.ITAD;
import br.mendonca.trabalho07.ITrabalho07;
import br.mendonca.trabalho07.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho07 {
    private IElemento inicio;
    private IElemento fim;
    private int quantidade = 0;

    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public Object getLista() {
        if (quantidade < 1) return null;

        return inicio.getTad();
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void inserirNoIncio(ITAD tad) {
        IElemento novo = new ThiagoBarrosElemento();
        novo.setTad(tad);

        if (inicio == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setNext(inicio);
            inicio.setPrevious(novo);
            inicio = novo;
        }
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        IElemento novo = new ThiagoBarrosElemento();
        novo.setTad(tad);

        if (quantidade == 0){
            inicio = novo;
        } else {
            novo.setPrevious(fim);
            fim.setNext(novo);
        }
        fim = novo;
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 1 || posicao > quantidade - 1) return;

        IElemento novo = new ThiagoBarrosElemento();
        novo.setTad(tad);

        IElemento auxiliar = inicio;
        for (int i = 0; i < posicao; i++){
            auxiliar = auxiliar.getNext();
        }

        novo.setNext(auxiliar);
        novo.setPrevious(auxiliar.getPrevious());
        IElemento anterior = auxiliar.getPrevious();
        anterior.setNext(novo);
        auxiliar.setPrevious(novo);

        quantidade++;
    }

    @Override
    public ITAD removerNoInicio() {
        if (quantidade == 0) return null;
        IElemento printInicio = inicio;
        inicio = inicio.getNext();

        quantidade--;
        return printInicio.getTad();
    }

    @Override
    public ITAD removerNoFim() {
        if (quantidade == 0) return null;

        IElemento novoFim = fim.getPrevious();
        IElemento printFim = fim;
        fim = novoFim;

        quantidade--;
        return printFim.getTad();
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if (posicao < 1 || posicao > quantidade - 1) return null;

        IElemento anterior = inicio;
        int cursor = 1;
        while (cursor < posicao) {
            anterior = anterior.getNext();
            cursor++;
        }
        IElemento elementoRemovido = anterior.getNext();
        IElemento posterior = elementoRemovido.getNext();
        posterior.setPrevious(anterior);
        anterior.setNext(posterior);

        quantidade--;
        return elementoRemovido.getTad();
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 || posicao >= quantidade) return null;

        IElemento auxiliar;
        int doFim = quantidade - posicao;
        if (posicao < doFim){
            System.out.println("Pelo inicio");

            auxiliar = inicio;
            int cursor = 1;
            while (cursor < posicao){
                auxiliar = auxiliar.getNext();
                cursor++;
            }
        } else {
            System.out.println("Do fim");
            auxiliar = fim;
            int cursor = quantidade - 1;
            while (cursor > posicao){
                auxiliar = auxiliar.getPrevious();
                cursor--;
            }
        }
        return auxiliar.getTad();
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
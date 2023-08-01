package br.mendonca.trabalho06.estruturas;

import br.mendonca.trabalho06.ITAD;
import br.mendonca.trabalho06.ITrabalho06;
import br.mendonca.trabalho06.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho06 {
    private ThiagoBarrosElemento topo;
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
        if (topo == null){
            return null;
        } else {
            return topo.getItad();
        }
    }

    @Override
    public void push(ITAD tad) {
        ThiagoBarrosElemento novo = new ThiagoBarrosElemento(tad);

        novo.setNext(topo);
        topo = novo;
        quantidade++;
    }

    @Override
    public ITAD pop() {
        if (topo == null) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
            return null;
        } else {
            ThiagoBarrosElemento topoNovo = topo.getNext();
            ThiagoBarrosElemento topoPrint = topo;
            topo.setNext(null);
            topo = topoNovo;
            quantidade--;
            return topoPrint.getItad();
        }
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 || posicao > quantidade - 1) return null;

        ThiagoBarrosElemento cursor = topo;
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

            ThiagoBarrosElemento cursor = topo;
            for (int i = quantidade; i > 0; i--){
                matriz.append("\n" + i + "." + cursor.getItad().print());
                cursor = cursor.getNext();
            }
            return matriz.toString();
        }
    }
}

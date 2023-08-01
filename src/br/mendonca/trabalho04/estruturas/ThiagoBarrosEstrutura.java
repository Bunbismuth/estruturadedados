package br.mendonca.trabalho04.estruturas;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.ITrabalho04;
import br.mendonca.trabalho04.elementos.ThiagoBarrosElemento;
import br.mendonca.trabalho04.tads.ThiagoBarrosTAD;

public class ThiagoBarrosEstrutura implements ITrabalho04 {
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
        return topo.getItad();
    }

    @Override
    public void enqueue(ITAD tad) {
        ThiagoBarrosElemento novo = new ThiagoBarrosElemento(tad);

        novo.setNext(topo);
        topo = novo;
        quantidade++;
    }

    @Override
    public ITAD dequeue() {
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
        return null;
    }

    @Override
    public String print() {
        if (quantidade == 0) {
            return "Lista vazia";
        } else {
            StringBuilder matriz = new StringBuilder();

            ThiagoBarrosElemento cursor = topo;
            for (int i = 0; i < quantidade; i++){
                matriz.append("\n" + i + "." + cursor.getItad().print());
                cursor = cursor.getNext();
            }
            return matriz.toString();
        }
    }
}


package br.mendonca.trabalho05.estruturas;

import br.mendonca.trabalho05.ITAD;
import br.mendonca.trabalho05.ITrabalho05;
import br.mendonca.trabalho05.tads.ThiagoBarrosTAD;

public class ThiagoBarrosEstrutura implements ITrabalho05 {
    private final ThiagoBarrosTAD[] pilhaEstatica;
    private int quantidade = 0;

    public ThiagoBarrosEstrutura(int tamanho){
        pilhaEstatica = new ThiagoBarrosTAD[tamanho];
    }
    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public Object[] getLista() {
        return pilhaEstatica;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void push(ITAD tad) {
        if (quantidade == pilhaEstatica.length) {
            System.out.println("A lista já está cheia");
        } else {
            pilhaEstatica[quantidade] = (ThiagoBarrosTAD) tad;
            quantidade++;
        }
    }

    @Override
    public ITAD pop() {
        if (quantidade == 0){
            System.out.println("A lista já está vazia");
            return null;
        } else {
            ThiagoBarrosTAD elementoRemovido = pilhaEstatica[quantidade - 1];
            pilhaEstatica[quantidade - 1] = null;
            quantidade--;
            return elementoRemovido;
        }
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 || posicao > quantidade - 1){
            System.out.println("Posição informada é inexistente");
            return null;
        } else {
            return pilhaEstatica[posicao];
        }
    }

    @Override
    public String print() {
        StringBuilder matriz = new StringBuilder();
        for(int i = 0; i < pilhaEstatica.length; i++){
            if (pilhaEstatica[i] == null){
                matriz.append("\n[" + (i) + "]"+ "Null");
            } else {
                matriz.append("\n[" + (i) + "]" + pilhaEstatica[i].print());
            }
        }
        return matriz.toString();
    }
}

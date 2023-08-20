package br.mendonca.trabalho10.buscas;

import br.mendonca.trabalho10.IBuscas;
import br.mendonca.trabalho10.ITAD;
import br.mendonca.trabalho10.ITrabalho10;

public class ThiagoBarrosBusca implements IBuscas {

    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public ITAD linear(ITrabalho10 lista, ITAD tad) {
        for (int i = 0; i < lista.getQuantidade(); i++){
            if (lista.getItem(i).getDouble() == tad.getDouble()){
                return lista.getItem(i);
            }
        }
        System.out.println("item não encontrado na lista");
        return null;
    }

    @Override
    public ITAD ordenada(ITrabalho10 lista, ITAD tad) {
        for(int i = 0; i < lista.getQuantidade(); i++){
            if (lista.getItem(i).getDouble() == tad.getDouble()){
                return lista.getItem(i);
            } else if (lista.getItem(i).getDouble() < tad.getDouble()) {
                System.out.println("Item não encontrado na lista");
                return null;
            }
        }
        System.out.println("Item não encontrado na lista");
        return null;
    }

    @Override
    public ITAD binaria(ITrabalho10 lista, ITAD tad) {
        int inicio = 0;
        int meio;
        int fim = lista.getQuantidade() - 1;

        while (inicio <= fim){
            meio = (inicio+fim)/2;
            System.out.println("Meio = " + lista.getItem(meio));

            if (tad.getDouble() < lista.getItem(meio).getDouble()){
                fim = meio-1;
            } else {
                if (tad.getDouble() > lista.getItem(meio).getDouble()){
                    inicio = meio + 1;
                } else {
                    return lista.getItem(meio);
                }
            }
        }
        System.out.println("Item não encontrado na lista");
        return null;
    }
}

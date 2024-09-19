package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();
    }


    //Adicionando tarefas na Lista
    public void adicionarTarefa(Tarefa descricao){
        tarefasList.add(descricao);
    }


    //Removendo tarefa da lista
    public void removerTarefa(Tarefa descricao){
        tarefasList.remove(descricao);
    }


    public int quantidadeTarefa(){
        return tarefasList.size();
    }


    @Override
    public String toString() {
        return tarefasList.toString();
    }


}

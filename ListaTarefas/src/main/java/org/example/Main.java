package org.example;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefas = new Tarefa("teste");
        Tarefa tarefa2 = new Tarefa("testando okok");

        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa(tarefas);
        lista.adicionarTarefa(tarefa2);

        System.out.println(lista.toString());
        System.out.println(lista.quantidadeTarefa());

        lista.removerTarefa(tarefas);

        System.out.println(lista.toString());
        System.out.println(lista.quantidadeTarefa());

    }
}
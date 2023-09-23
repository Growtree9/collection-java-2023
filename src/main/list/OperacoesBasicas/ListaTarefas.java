package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if(!listaDeTarefas.isEmpty()) {
                for (Tarefa t : listaDeTarefas){
                if (t.getDescrição().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            listaDeTarefas.removeAll(tarefasParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        if(!listaDeTarefas.isEmpty()) {
            System.out.println(listaDeTarefas);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");
        listaTarefa.adicionarTarefa("Trabalhar");
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Trabalhar");
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Estudar para o exame");
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
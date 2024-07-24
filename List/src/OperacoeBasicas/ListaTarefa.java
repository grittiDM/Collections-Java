package OperacoeBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()){
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Fazer exercícios físicos");    
        listaTarefa.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefa.adicionarTarefa("Ler livro");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();
    
        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Organizar a mesa de trabalho");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Fazer exercícios físicos");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Estudar Java");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Ler livro");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Remover itens da lista");
    
        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}

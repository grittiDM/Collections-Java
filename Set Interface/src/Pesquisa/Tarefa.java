package Pesquisa;

public class Tarefa {
    // Atributos
    private String descricao;
    private boolean concluida;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
        
    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", status=" + concluida + "]";
    }


}

    

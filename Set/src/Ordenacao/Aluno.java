package Ordenacao;

import java.util.Comparator;

public class Aluno {
    // Atributos
    private String nome;
    private long matricula;
    private double media;

    // Construtor
    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + media + "]";
    }
    
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno n1, Aluno n2) {
        return Double.compare(n1.getMedia(), n2.getMedia());
    }
    
}

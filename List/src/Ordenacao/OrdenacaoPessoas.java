package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
        
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
        
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alice", 25, 1.65);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 35, 1.75);
        ordenacaoPessoas.adicionarPessoa("David", 40, 1.70);
        ordenacaoPessoas.adicionarPessoa("Eva", 45, 1.60);
        ordenacaoPessoas.adicionarPessoa("Frank", 50, 1.85);

        System.out.println("Pessoas ordenadas por idade: " + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Pessoas ordenadas por altura: " + ordenacaoPessoas.ordenarPorAltura());

    }
}


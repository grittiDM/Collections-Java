package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributo
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasSet.isEmpty()){
            if (palavrasSet.contains(palavra)) {
                palavrasSet.remove(palavra);
            } else {
                System.out.println("! Palavra não encontrada no conjunto !");
            }
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }
    
    public void exibirPalavras() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Teclado");
        conjuntoPalavrasUnicas.adicionarPalavra("Mouse");
        conjuntoPalavrasUnicas.adicionarPalavra("Livro");
        conjuntoPalavrasUnicas.adicionarPalavra("Caneca");
        conjuntoPalavrasUnicas.adicionarPalavra("Garrafa");

        // Exibindo as palavras únicas do conjunto
        conjuntoPalavrasUnicas.exibirPalavras();

        // Removendo uma palavra do conjunto
        conjuntoPalavrasUnicas.removerPalavra("Mouse");
        conjuntoPalavrasUnicas.exibirPalavras();

        // Verificando se uma palavra está no conjunto
        System.out.println("A palavra 'Teclado' está no conjunto?");
        System.out.println("A palavra 'Caneca' está no conjunto?");

        // Exibindo as palavras únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavras();
    }
}

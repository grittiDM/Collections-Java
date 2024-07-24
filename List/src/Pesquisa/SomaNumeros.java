package Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    // Atributo
    private List<Integer> listaNumeros;

    // Construtor
    public SomaNumeros () {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                soma += n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                if (n >= maiorNumero) {
                    maiorNumero = n; // Atualiza o maior número
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public int emcontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                if (n <= menorNumero) {
                    menorNumero = n; // atualiza o menor número
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(27);

        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());

        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor número é: " + somaNumeros.emcontrarMenorNumero());
    }
}


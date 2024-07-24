package Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    // Atributo
    private List<Integer> numerosList;
    
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscencente() {
        List<Integer> ascendente = new ArrayList<>(numerosList);
        if (!ascendente.isEmpty()) {
            Collections.sort(ascendente);
            return ascendente;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> descendente = new ArrayList<>(numerosList);
        if (!descendente.isEmpty()) {
            Collections.sort(descendente, Collections.reverseOrder());
            return descendente;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(7);

        // Exibindo a lista de números adicionados
        ordenacaoNumeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(ordenacaoNumeros.ordenarAscencente());

        // Exibindo a lista
        ordenacaoNumeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(ordenacaoNumeros.ordenarDescendente());

        // Exibindo a lista
        ordenacaoNumeros.exibirNumeros();
    }
}

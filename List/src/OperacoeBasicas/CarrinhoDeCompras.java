package OperacoeBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> listaItens;
    
    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!listaItens.isEmpty()){
            for (Item i : listaItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
            System.out.println(itensParaRemover + " REMOVIDO!");
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public void exibirItens() {
        if (!listaItens.isEmpty()) {
            System.out.println(listaItens);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + listaItens +
          '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // add itens ao carrinho
        carrinhoDeCompras.adicionarItem("Arroz", 10.05, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 8.11, 1);
        carrinhoDeCompras.adicionarItem("Macarrão", 5.79, 3);

        // Exibindo os itens do carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("Valor total da compra: R$ " + carrinhoDeCompras.calcularValorTotal());

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Arroz");

        // Calculando e exibindo o valor total da compra após a remoção
        System.out.println("Valor total da compra: R$ " + carrinhoDeCompras.calcularValorTotal());

        
    }
}



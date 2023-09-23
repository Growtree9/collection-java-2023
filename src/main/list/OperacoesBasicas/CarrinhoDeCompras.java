package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> nomesParaRemover = new ArrayList<>();
        if (!listaDeItens.isEmpty()) {
            for (Item i : listaDeItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    nomesParaRemover.add(i);
                }
            }
            listaDeItens.removeAll(nomesParaRemover);
        } else {
            System.out.println("Não há itens no carrinho.");
        }
    }

    public void calcularValorTotal() {

        double valorTotal = 0d;

        if (!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                double precoItem = item.getPreco() * item.getQuantidade();
                valorTotal += precoItem;
            }

            System.out.printf("O valor total da sua compra foi de: R$ " + valorTotal);

        } else {
            System.out.println("Não há itens no carrinho.");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompas{" +
                "listaDeItens=" + listaDeItens +
                '}';
    }

    public void exibirItens() {

        if (!listaDeItens.isEmpty()) {
            System.out.println(listaDeItens);
        } else {
            System.out.println("Não há itens no carrinho.");
        }

    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();

    }
}
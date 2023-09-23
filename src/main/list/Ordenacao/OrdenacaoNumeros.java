package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ascendente = new ArrayList<>(listaDeNumeros);

        if (!listaDeNumeros.isEmpty()) {
            Collections.sort(ascendente);
            return ascendente;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> descendente = new ArrayList<>(listaDeNumeros);

        if (!listaDeNumeros.isEmpty()) {
            descendente.sort(Collections.reverseOrder());
            return descendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaDeNumeros.isEmpty()) {
            System.out.println(this.listaDeNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

}

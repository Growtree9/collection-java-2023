package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicaSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicaSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicaSet.isEmpty()) {
            if (palavrasUnicaSet.contains(palavra)) {
                palavrasUnicaSet.remove(palavra);
            } else {
                System.out.println("Palavra " + palavra + " não encontrada no conjunto!");
            }

        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicaSet.isEmpty()) {
            System.out.println(palavrasUnicaSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

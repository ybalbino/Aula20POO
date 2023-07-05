package Exercicio1;

import Exercicio1.Produto;

class DVD extends Produto {
    private int duracao;

    public DVD(String codigoDeBarras, String nome, double preco, int duracao) {
        super(codigoDeBarras, nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Duração: " + getDuracao());
    }
}

package Exercicio1;

abstract class Produto {
    private String codigoDeBarras;
    private String nome;
    private double preco;

    public Produto(String codigoDeBarras, String nome, double preco) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void mostrarDetalhesDoItem();
}

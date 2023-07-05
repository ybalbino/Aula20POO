package Exercicio1;

import Exercicio1.Produto;

class CD extends Produto {
    private int numeroDeFaixas;

    public CD(String codigoDeBarras, String nome, double preco, int numeroDeFaixas) {
        super(codigoDeBarras, nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Número de Faixas: " + getNumeroDeFaixas());
    }
}

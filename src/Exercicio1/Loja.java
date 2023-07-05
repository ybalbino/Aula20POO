package Exercicio1;

import Exercicio1.Produto;

public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("123456", "Livro 1", 29.99, "Autor 1");
        produtos[1] = new CD("789012", "CD 1", 19.99, 12);
        produtos[2] = new DVD("345678", "DVD 1", 39.99, 120);
        produtos[3] = new Livro("234567", "Livro 2", 24.99, "Autor 2");
        produtos[4] = new CD("901234", "CD 2", 14.99, 10);

        for (Produto produto : produtos) {
            produto.mostrarDetalhesDoItem();
            System.out.println();
        }

        Produto produto1 = new Livro("123456", "Livro 1", 29.99, "Autor 1");
        Produto produto2 = new Livro("123456", "Livro 1", 29.99, "Autor 1");
        Produto produto3 = new Livro("789012", "Livro 1", 29.99, "Autor 1");

        buscaProduto(produto1, produtos);
        buscaProduto(produto2, produtos);
        buscaProduto(produto3, produtos);
    }

    public static void buscaProduto(Produto produto, Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produto.equals(produtos[i])) {
                System.out.println("O produto foi encontrado na posição " + i);
                return;
            }
        }
        System.out.println("O produto não foi encontrado.");
    }
}

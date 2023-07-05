package Exercicio1;

import Exercicio1.Produto;

class Livro extends Produto {
     private String autor;

     public Livro(String codigoDeBarras, String nome, double preco, String autor) {
         super(codigoDeBarras, nome, preco);
         this.autor = autor;
     }

     public String getAutor() {
         return autor;
     }

     @Override
     public void mostrarDetalhesDoItem() {
         System.out.println("Nome: " + getNome());
         System.out.println("Preço: " + getPreco());
         System.out.println("Autor: " + getAutor());
     }
 }

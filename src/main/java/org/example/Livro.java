package org.example;


public class Livro {

    private String titulo;
    private Categoria categoria;

    public Livro(String titulo, Categoria categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String obterLivro() {
        return "Livro{" +
                "titulo='" + this.titulo + '\'' +
                ", categoria='" + categoria.getNome() + '\'' +
                ", descricao='" + categoria.getDescricao() + '\'' +
                '}';
    }
}

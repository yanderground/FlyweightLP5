package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String nomeCategoria, String descricaoCategoria) {
        Categoria categoria = CategoriaFactory.getCategoria(nomeCategoria, descricaoCategoria);
        Livro livro = new Livro(titulo, categoria);
        livros.add(livro);
    }

    public List<String> obterLivros() {
        List<String> saida = new ArrayList<String>();
        for (Livro livro : this.livros) {
            saida.add(livro.obterLivro());
        }
        return saida;
    }
}


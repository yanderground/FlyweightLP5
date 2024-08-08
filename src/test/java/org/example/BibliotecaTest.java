package org.example;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarLivros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro("The Boys", "Super-Herói", "Quadrinhos de super-Heróis");
        biblioteca.adicionarLivro("Homem-Aranha", "Super-Herói", "Quadrinhos de super-Heróis");
        biblioteca.adicionarLivro("Thor", "Super-Herói", "Quadrinhos de super-Heróis");
        biblioteca.adicionarLivro("Haikyuu", "Esporte", "Mangá de esporte");

        List<String> saida = Arrays.asList(
                "Livro{titulo='The Boys', categoria='Super-Herói', descricao='Quadrinhos de super-Heróis'}",
                "Livro{titulo='Homem-Aranha', categoria='Super-Herói', descricao='Quadrinhos de super-Heróis'}",
                "Livro{titulo='Thor', categoria='Super-Herói', descricao='Quadrinhos de super-Heróis'}",
                "Livro{titulo='Haikyuu', categoria='Esporte', descricao='Mangá de esporte'}");

        assertEquals(saida, biblioteca.obterLivros());
    }

    @Test
    void deveRetornarTotalCategorias() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro("The Boys", "Super-Herói", "Quadrinhos de super-Heróis");
        biblioteca.adicionarLivro("Homem-Aranha", "Super-Herói", "Quadrinhos de super-Heróis");
        biblioteca.adicionarLivro("Thor", "Super-Herói", "Quadrinhos de super-Heróis");
        biblioteca.adicionarLivro("Haikyuu", "Esporte", "Mangá de esporte");

        assertEquals(2, CategoriaFactory.getTotalCategorias());
    }

}

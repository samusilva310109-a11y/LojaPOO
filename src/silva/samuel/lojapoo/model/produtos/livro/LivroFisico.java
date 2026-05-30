package silva.samuel.lojapoo.model.produtos.livro;

import silva.samuel.lojapoo.model.autor.Autor;

import java.util.List;

public class LivroFisico extends  Livro{

    //Construtor para adição de apenas um autor
    public LivroFisico(String titulo, int codigo, double valorUnitario, Autor autor) {
        super(titulo, codigo, valorUnitario, autor);
    }

    //Construtor para adição de mais de um autor
    public LivroFisico(String titulo, int codigo, double valorUnitario, List<Autor> autores) {
        super(titulo, codigo, valorUnitario, autores);
    }
}

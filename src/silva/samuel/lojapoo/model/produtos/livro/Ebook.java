package silva.samuel.lojapoo.model.produtos.livro;

import silva.samuel.lojapoo.model.autor.Autor;

import java.util.List;

public class Ebook extends Livro {

    //Construtor para adição de apenas um autor
    public Ebook(String titulo, int codigo, double valorUnitario, Autor autor) {
        super(titulo, codigo, valorUnitario, autor);
    }

    //Construtor para adição de mais de um autor
    public Ebook(String titulo, int codigo, double valorUnitario, List<Autor> autor) {
        super(titulo, codigo, valorUnitario, autor);
    }


    //Métodos
    @Override
    public boolean calcularDesconto(double porcentagem) {
        if (porcentagem > 0.15) return  false;

        return super.calcularDesconto(porcentagem);
    }

    @Override
    public String getTipo() {
        return "Ebook";
    }
}

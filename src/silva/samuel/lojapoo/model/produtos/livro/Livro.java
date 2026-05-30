package silva.samuel.lojapoo.model.produtos.livro;

import silva.samuel.lojapoo.model.autor.Autor;
import silva.samuel.lojapoo.model.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public abstract  class Livro extends Produto {
    private String titulo;
    private List<Autor> autores;

    //Construtor para adição de apenas um autor
    public Livro(String titulo, int codigo, double valorUnitario, Autor autor) {
        super(titulo, codigo, valorUnitario);
        this.autores = new ArrayList<>();
        adicionarAutor(autor);
    }

    //Construtor para adição de mais de um autor
    public Livro(String titulo, int codigo, double valorUnitario, List<Autor> autores) {
        super(titulo, codigo, valorUnitario);
        this.autores = new ArrayList<>();
        this.autores.addAll(autores);
    }



    //Métodos
    @Override
    public boolean calcularDesconto(double porcentagem) {
        if (porcentagem > 0.3) return false;

        double desconto = getValorUnitario() *  porcentagem;
        this.setValorUnitario(getValorUnitario() - desconto);

        return true;
    }




    //Métodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return  this.autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    };

    public String getTipo(){
        return "Livro";
    }
}

package silva.samuel.lojapoo.model.produtos.livro;

import silva.samuel.lojapoo.model.Autor;
import silva.samuel.lojapoo.model.produtos.Produto;

public abstract  class Livro extends Produto {
    private String titulo;
    private String descricao;
    private int quantidade;
    private Autor autor;

    public Livro(Autor autor) {
        this.autor = autor;
        this.quantidade = 0;
    }

    @Override
    public String toString() {
        return "\n" + " Título: " + getTitulo() + "\n" +
                " Descricao: " + getDescricao() + "\n" +
                " Tipo: " + getTipo() + "\n" +
                " Autor: " + getAutor().getNome() + "\n" +
                " Quantidade: " + getQuantidade() + "\n" +
                " Preço: " + getPreco() + "\n" ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public boolean calcularDesconto(double porcentagem) {
        if (porcentagem > 0.3) return false;

       double desconto = getPreco() *  porcentagem;
       this.setPreco(getPreco() - desconto);

       return true;
    }

    public String getTipo(){
        return "Livro";
    }


}

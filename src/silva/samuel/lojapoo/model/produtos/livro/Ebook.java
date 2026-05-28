package silva.samuel.lojapoo.model.produtos.livro;

import silva.samuel.lojapoo.model.Autor;

public class Ebook extends Livro {

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean calcularDesconto(double porcentagem) {
        if (porcentagem > 0.15) return  false;

        return super.calcularDesconto(porcentagem);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTipo() {
        return "Ebook";
    }
}

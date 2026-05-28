package silva.samuel.lojapoo;

import silva.samuel.lojapoo.model.Autor;
import silva.samuel.lojapoo.model.Carrinho;
import silva.samuel.lojapoo.model.produtos.livro.Ebook;
import silva.samuel.lojapoo.model.produtos.livro.LivroFisico;

public class Main {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Autor autor = new Autor("Maria Silva");


        LivroFisico livroFisico = new LivroFisico(new Autor("Rachel Queiroz"));
        livroFisico.setTitulo("Caminho das pedras");
        livroFisico.setPreco(60.90);
        livroFisico.setQuantidade(60);

        Ebook ebook = new Ebook(autor);
        ebook.setTitulo("Java 8 na prática");
        ebook.setPreco(10);
        ebook.setQuantidade(140);
        ebook.calcularDesconto(0.1);

        carrinho.add(ebook);
        carrinho.add(livroFisico);

        System.out.println(carrinho.toString());


    }
}

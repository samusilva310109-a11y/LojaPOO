package silva.samuel.lojapoo;

import silva.samuel.lojapoo.model.Carrinho;
import silva.samuel.lojapoo.model.ItemCarrinho;
import silva.samuel.lojapoo.model.autor.Autor;
import silva.samuel.lojapoo.model.cliente.Cliente;
import silva.samuel.lojapoo.model.produtos.livro.Ebook;
import silva.samuel.lojapoo.model.produtos.livro.LivroFisico;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Maria Silva");

        LivroFisico livroFisico = new LivroFisico("Caminho das pedras",2697,60.90, new Autor("Rachel Queiroz"));
        livroFisico.setQuantidadeEstoque(60);
        livroFisico.calcularDesconto(0.3);

        Ebook ebook = new Ebook("Java 8 na prática",1253,10,autor);
        ebook.setQuantidadeEstoque(140);
        ebook.calcularDesconto(0.1);

        LivroFisico livroFisico1 = new LivroFisico("Prozas",3685,54,new Autor("Machado de Assis"));
        livroFisico1.setQuantidadeEstoque(50);
        livroFisico1.calcularDesconto(0.3);


        Cliente cliente = new Cliente("Samuel Silva", "123.456.789-10", "samSilva@gmail.com", "123abc");
        cliente.adicionarItemAoCarrinho(ebook, 2);
        cliente.adicionarItemAoCarrinho(livroFisico, 3);
        cliente.adicionarItemAoCarrinho(livroFisico1, 5);
        cliente.adicionarItemAoCarrinho(livroFisico1, 4);

        mostrarCarrinho(cliente);

        Cliente cliente2 = new Cliente("Marcos Silva", "123.456.789-10", "marSilva@gmail.com", "123abc");
        cliente2.adicionarItemAoCarrinho(ebook, 2);

        mostrarCarrinho(cliente2);
    }

    public static void mostrarCarrinho(Cliente cliente){
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Nome do cliente: " + cliente.getNome() + "\n");

        System.out.println("-----CARRINHO-----");
        for (ItemCarrinho item : cliente.getCarrinho().getItensCarrinho()){
            System.out.println(
                    "Produto: " +  item.getProduto().getNome() + "\n" +
                            "Qtde: " + item.getQuantidade() + "\n" +
                            "Valor Unitário: " + df.format(item.getProduto().getValorUnitario()) + "\n" +
                            "Sub Total: " + df.format(item.getSubtotal()) + "\n"
            );
        }

        System.out.println("-----TOTAL CARRINHO-----");
        System.out.println("R$" + df.format(cliente.getCarrinho().getValorTotal()) + "\n");
        System.out.println("-------------------------");
    }
}

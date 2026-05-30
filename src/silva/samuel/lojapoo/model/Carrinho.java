package silva.samuel.lojapoo.model;
import silva.samuel.lojapoo.model.produtos.Produto;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private final List<ItemCarrinho> itensCarrinho;
    private double valorTotal;



    public Carrinho() {
        this.itensCarrinho = new ArrayList<>();
    }

    public List<ItemCarrinho> getItensCarrinho() {
        return this.itensCarrinho;
    }

    public void adicionarItem(Produto produto, int quantidade){
        for (ItemCarrinho itemCarrinho : itensCarrinho) {
            if (itemCarrinho.getProduto().getCodigo() == produto.getCodigo()) {
                itemCarrinho.setQuantidade(itemCarrinho.getQuantidade() + quantidade);
                return;
            }
        }

        ItemCarrinho novoItem = new ItemCarrinho(produto, quantidade);
        itensCarrinho.add(novoItem);
    }

    public void removerItemDoCarrinho(Produto produto){
        this.itensCarrinho.removeIf(item -> item.getProduto().getCodigo() == produto.getCodigo());
    }

    public double getValorTotal(){
        for (ItemCarrinho item : itensCarrinho) {
           setValorTotal(item.getSubtotal());
        }
        return this.valorTotal;
    }

    private void setValorTotal(double valor){
        this.valorTotal += valor;
    }

    public int getTamanhoCarrinho(){
        return itensCarrinho.size();
    }


}

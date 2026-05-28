package silva.samuel.lojapoo.model;
import silva.samuel.lojapoo.model.produtos.Produto;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private final List<Produto> carrinho = new ArrayList<>();;
    private double valorTotal;


    public String toString() {
        return  carrinho.toString() + "Preço total do carrinho: " + getValorTotal();
    }

    public void add(Produto produto){
        carrinho.add(produto); //Método add() utilizado da Java Collections
        setValorTotal(produto.getPreco());
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    private void setValorTotal(double valor){
        this.valorTotal += valor;
    }

    public int getTamanhoCarrinho(){
        return carrinho.size();
    }


}

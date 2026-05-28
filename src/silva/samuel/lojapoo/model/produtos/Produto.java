package silva.samuel.lojapoo.model.produtos;

public abstract class Produto {
    private double valor;

    public  boolean calcularDesconto(double porcentagem){
        return false;
    };

    public double getPreco(){
        return this.valor;
    }

    public void setPreco(double valor){
        this.valor = valor;
    }

}

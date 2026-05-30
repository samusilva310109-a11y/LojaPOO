package silva.samuel.lojapoo.model.produtos;

public abstract class Produto {
    private String nome;
    private int codigo;
    private int quantidadeEstoque;
    private  double valorUnitario;
    private String descricao;


    //Construtores
    public Produto(String nome, int codigo, double valorUnitario) {
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
        this.nome =  nome;
        this.quantidadeEstoque = 0;
    }

    public  boolean calcularDesconto(double porcentagem){
        return false;
    };

    //Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

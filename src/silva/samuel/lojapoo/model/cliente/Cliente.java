package silva.samuel.lojapoo.model.cliente;

import silva.samuel.lojapoo.model.Carrinho;
import silva.samuel.lojapoo.model.produtos.Produto;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String nomeDeUsuario;
    private String senha;

    private Carrinho carrinho;


    //Construtores
    public Cliente(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.carrinho = new Carrinho();
    }


    //Métodos de Cliente
    public void adicionarItemAoCarrinho(Produto produto, int quantidade) {
        if (quantidade > 0 && quantidade <= produto.getQuantidadeEstoque()) {
            carrinho.adicionarItem(produto, quantidade);
        }
    }

    public void removerItemDoCarrinho(Produto produto) {
        this.carrinho.removerItemDoCarrinho(produto);
    }

    //Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }


}

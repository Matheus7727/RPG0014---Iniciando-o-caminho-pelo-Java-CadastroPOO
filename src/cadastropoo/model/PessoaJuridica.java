package CadastroPOO.model;

import java.io.Serializable;
class PessoaJuridica implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private String cnpj;

    // Construtor completo
    public PessoaJuridica(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String cnpj) {
    }

    // Getters e setters para todos os campos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método para exibir os dados da pessoa jurídica
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}

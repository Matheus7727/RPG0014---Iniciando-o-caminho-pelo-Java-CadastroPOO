package CadastroPOO.model;

import java.io.*;
import java.util.ArrayList;

// Classe PessoaFisica
class PessoaFisica implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private String cpf;
    private int idade;

    // Construtor completo
    public PessoaFisica(int id, String nome, String cpf, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public PessoaFisica(String nome, String cpf, int idade) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir os dados da pessoa física
    @Override
    public String toString() {
        return "PessoaFisica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}

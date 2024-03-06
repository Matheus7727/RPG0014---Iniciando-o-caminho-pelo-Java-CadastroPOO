package CadastroPOO.model;

import java.io.Serializable;

// Classe Pessoa
public class Pessoa implements Serializable {
    private int id;
    private String nome;

    // Construtor padrão
    public Pessoa() {
        this.id = 0;
        this.nome = "";
    }

    // Construtor completo
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    // Método para exibir os dados da pessoa
    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
    }
}

package CadastroPOO.model;
import java.io.*;
import java.util.ArrayList;
class PessoaJuridicaRepo {
    private ArrayList<PessoaJuridica> pessoasJuridicas;

    // Construtor da classe
    public PessoaJuridicaRepo() {
        this.pessoasJuridicas = new ArrayList<>();
    }

    // Método para inserir uma pessoa jurídica
    public void inserir(PessoaJuridica pessoa) {
        pessoasJuridicas.add(pessoa);
    }

    // Método para alterar uma pessoa jurídica existente
    public void alterar(int id, PessoaJuridica novaPessoa) {
        for (int i = 0; i < pessoasJuridicas.size(); i++) {
            if (pessoasJuridicas.get(i).getId() == id) {
                pessoasJuridicas.set(i, novaPessoa);
                return;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
    }

    // Método para excluir uma pessoa jurídica pelo id
    public void excluir(int id) {
        for (int i = 0; i < pessoasJuridicas.size(); i++) {
            if (pessoasJuridicas.get(i).getId() == id) {
                pessoasJuridicas.remove(i);
                return;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
    }

    // Método para obter uma pessoa jurídica pelo id
    public PessoaJuridica obter(int id) {
        for (PessoaJuridica pessoa : pessoasJuridicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
        return null;
    }

    // Método para obter todas as pessoas jurídicas
    public ArrayList<PessoaJuridica> obterTodos() {
        return pessoasJuridicas;
    }}

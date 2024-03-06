package CadastroPOO.model;

import java.io.*;
import java.util.ArrayList;

class PessoaFisicaRepo {
    private ArrayList<PessoaFisica> pessoasFisicas;

    // Construtor da classe
    public PessoaFisicaRepo() {
        this.pessoasFisicas = new ArrayList<>();
    }

    // Método para inserir uma pessoa física
    public void inserir(PessoaFisica pessoa) {
        pessoasFisicas.add(pessoa);
    }

    // Método para alterar uma pessoa física existente
    public void alterar(int id, PessoaFisica novaPessoa) {
        for (int i = 0; i < pessoasFisicas.size(); i++) {
            if (pessoasFisicas.get(i).getId() == id) {
                pessoasFisicas.set(i, novaPessoa);
                return;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
    }

    // Método para excluir uma pessoa física pelo id
    public void excluir(int id) {
        for (int i = 0; i < pessoasFisicas.size(); i++) {
            if (pessoasFisicas.get(i).getId() == id) {
                pessoasFisicas.remove(i);
                return;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
    }

    // Método para obter uma pessoa física pelo id
    public PessoaFisica obter(int id) {
        for (PessoaFisica pessoa : pessoasFisicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
        return null;
    }

    // Método para obter todas as pessoas físicas
    public ArrayList<PessoaFisica> obterTodos() {
        return pessoasFisicas;
    }

    // Método para persistir os dados no disco
    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(pessoasFisicas);
        }
    }

    // Método para recuperar os dados do disco
    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoasFisicas = (ArrayList<PessoaFisica>) inputStream.readObject();
        }
    }
}


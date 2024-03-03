package CadastroPOO.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prefixoArquivo = "dados"; // Prefixo padrão para os arquivos

        PessoaFisicaRepo repoPessoaFisica = new PessoaFisicaRepo();
        PessoaJuridicaRepo repoPessoaJuridica = new PessoaJuridicaRepo();

        int opcao;
        do {
            System.out.println("Selecione a opção:");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Exibir pelo ID");
            System.out.println("5 - Exibir todos");
            System.out.println("6 - Salvar dados");
            System.out.println("7 - Recuperar dados");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Selecione o tipo (1 - Pessoa Física, 2 - Pessoa Jurídica):");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        // Adicionar Pessoa Física
                        System.out.println("Informe o nome:");
                        String nome = scanner.nextLine();
                        System.out.println("Informe o CPF:");
                        String cpf = scanner.nextLine();
                        System.out.println("Informe a idade:");
                        int idade = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha

                        PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf, idade);
                        repoPessoaFisica.inserir(pessoaFisica);
                    } else if (tipo == 2) {
                        // Adicionar Pessoa Jurídica
                        System.out.println("Informe o nome:");
                        String nome = scanner.nextLine();
                        System.out.println("Informe o CNPJ:");
                        String cnpj = scanner.nextLine();

                        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
                        repoPessoaJuridica.inserir(pessoaJuridica);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    // Implementar opção de alterar
                    break;
                case 3:
                    // Implementar opção de excluir
                    break;
                case 4:
                    // Implementar opção de exibir pelo ID
                    break;
                case 5:
                    // Implementar opção de exibir todos
                    break;
                case 6:
                    // Implementar opção de salvar dados
                    break;
                case 7:
                    // Implementar opção de recuperar dados
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

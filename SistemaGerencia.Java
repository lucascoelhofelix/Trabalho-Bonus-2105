import java.util.Scanner;

public class SistemaGerencia {
    public static void main(String[] args) {
        CadastroObraDeArte cadastro = new SistemaCadastro();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("1. Cadastrar obra de arte");
            System.out.println("2. Listar todas as obras de arte");
            System.out.println("3. Buscar obra de arte pelo título");
            System.out.println("4. Atualizar obra de arte pelo título");
            System.out.println("5. Excluir obra de arte pelo título");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastro.cadastrarObra();
                    break;
                case "2":
                    cadastro.listarObras();
                    break;
                case "3":
                    System.out.print("Digite o título da obra: ");
                    String buscarTitulo = scanner.nextLine();
                    cadastro.buscarObraPorTitulo(buscarTitulo);
                    break;
                case "4":
                    System.out.print("Digite o título da obra a ser atualizada: ");
                    String atualizarTitulo = scanner.nextLine();
                    cadastro.atualizarObraPorTitulo(atualizarTitulo);
                    break;
                case "5":
                    System.out.print("Digite o título da obra a ser excluída: ");
                    String excluirTitulo = scanner.nextLine();
                    cadastro.excluirObraPorTitulo(excluirTitulo);
                    break;
                case "6":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("6"));

        System.out.println("Cadastro finalizado.");
    }
}
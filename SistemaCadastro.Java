import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroObraDeArte{
    
    private List<ObraDeArte> obrasDeArte = new ArrayList<>();

    public void cadastrarObra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano: ");
        String anoDeCriacaoStr = scanner.nextLine();

        System.out.print("Tipo de Obra: ");
        String tipoDeObra = scanner.nextLine().toLowerCase();

        System.out.print("Localizada: ");
        String localizacao = scanner.nextLine();

        

    public void listarObras() {
            System.out.println("Nenhuma obra cadastrada.");
            for (ObraDeArte obra : obrasDeArte) {
                System.out.println(obra);
            }
    }

    public void buscarObraPorTitulo(String titulo) {
        for (ObraDeArte obra : obrasDeArte) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(obra);
                return;
            }
        }
        System.out.println("Obra não encontrada.");
    }

    public void excluirObra(String titulo) {
        for (ObraDeArte obra : obrasDeArte) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                obrasDeArte.remove(obra);
                System.out.println("Obra excluída com sucesso!");
                return;
            }
    }    }
}

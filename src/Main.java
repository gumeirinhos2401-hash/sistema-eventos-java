import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaEventos sistema = new SistemaEventos();

        System.out.println("=== Cadastro de Evento ===");

        System.out.print("Nome do evento: ");
    String nome = scanner.nextLine();

        System.out.print("Endereco: ");
    String endereco = scanner.nextLine();

        System.out.print("Categoria: ");
    String categoria = scanner.nextLine();

        System.out.print("Descricao: ");
    String descricao = scanner.nextLine();

    LocalDateTime horario = LocalDateTime.now().plusHours(1);

        Evento evento = new Evento(nome, endereco, categoria, horario, descricao);
        sistema.adicionarEvento(evento);

        System.out.println("\nEventos cadastrados: ");
        sistema.listarEventos();

        scanner.close();
    }
}


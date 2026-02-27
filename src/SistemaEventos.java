import java.util.ArrayList;
import java.util.List;

class SistemaEventos{
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(Evento evento)  {
        eventos.add(evento);
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
            return;
        }

        for (Evento e : eventos) {
            System.out.println(e);

        }
    }
}
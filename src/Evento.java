import java.time.LocalDateTime;

class Evento {

    private String nome;
    private String endereco;
    private String categoria;
    private LocalDateTime horario;
    private String descricao;

    public Evento(String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
    return "Evento: " + nome +
            " | Categoria: " + categoria +
            " | Horario :" + horario ;
    }
}
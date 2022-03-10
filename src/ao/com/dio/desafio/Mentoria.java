package ao.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate date;
    String Test;

    public Mentoria() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                ", titulo=" + getTitulo() +
                ", desc=" + getDesc() +
                ", date=" + date +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
    }
}

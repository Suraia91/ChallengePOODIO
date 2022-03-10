import ao.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java 1");
        curso1.setDesc("desc c java 1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java 2");
        curso2.setDesc("desc c java 2");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDesc("desc mentoria java");
        mentoria.setDate(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("BootCamp Java");
        bootcamp.setDesc("Desc Boootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev =new Dev();
        dev.setNome("Suraia");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Sura"+ dev.getConteudoInscritos());
        dev.progredir();
        dev.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos Sura"+ dev.getConteudoInscritos());
        System.out.println("Conteudos conculidos Sura"+ dev.getConteudoConcluido());
        System.out.println("XP Sura "+ dev.calcularTotalXp());


        System.out.println("---------------");

        Dev devj= new Dev();
        devj.setNome("John");
        devj.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos John"+ devj.getConteudoInscritos());

        devj.progredir();
        devj.progredir();
        devj.progredir();
        System.out.println("-");

        System.out.println("Conteudos inscritos John"+ devj.getConteudoInscritos());
        System.out.println("Conteudos conculidos John"+ dev.getConteudoConcluido());
        System.out.println("XP John "+ devj.calcularTotalXp());


    }
}

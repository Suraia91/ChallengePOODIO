import ao.com.dio.desafio.Curso;
import ao.com.dio.desafio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args){


        Curso curso1 =new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDesc("desc c java");
        curso1.setCargaHoraria(8);

        Curso curso2 =new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDesc("desc c java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDesc("desc mentoria java");
        mentoria.setDate(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);




    }
}

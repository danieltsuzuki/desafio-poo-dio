import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Java orientado a objetos");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de python");
        curso2.setDescricao("Introdução a python");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Falaremos sobre conceitos básico de java e orientação a objetos");
        mentoria1.setData(LocalDate.now());
        mentoria1.calcularXp();


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda a desenvolver APIs RestFul");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.pogredir();
        devJoao.pogredir();
        devJoao.pogredir();
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


        System.out.println("\n\n\n");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devAna.getConteudosInscritos());
        devAna.pogredir();
        System.out.println("Conteudos inscritos: " + devAna.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());
    }

}
package br.br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Python");
        curso2.setDescricao("descrição curso Python");
        curso2.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descricao mentoria java ");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(curso2);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Developer devAlice= new Developer();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devAlice.getConteudosInscritos());
        devAlice.progredir();
        devAlice.progredir();
        System.out.println("Conteúdos inscritos" + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devAlice.getConteudosConcluidos());
        System.out.println("XP: " + devAlice.calcularTotalXp());

        System.out.println("============");

        Developer devJoao= new Developer();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    
    }
}

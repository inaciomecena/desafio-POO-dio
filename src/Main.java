import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Revisão de Codigo.
public class Main {
    public static <string> void main(String[] args) {



        Curso curso1 = new Curso();
        curso1.setTitulo("curso java e appis");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(58);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devInacioMecena = new Dev();
        devInacioMecena.setNome("Inácio Mecena");
        devInacioMecena.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Inácio Mecena:" + devInacioMecena.getConteudosInscritos());
        devInacioMecena.progredir();
        devInacioMecena.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Inácio Mecena:" + devInacioMecena.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Inácio Mecena:" + devInacioMecena.getConteudosConcluidos());
        System.out.println("XP:" + devInacioMecena.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mecena:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}

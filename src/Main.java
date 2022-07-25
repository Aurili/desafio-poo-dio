import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String []args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java ");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome ("Bootcamp Java Developer");
        bootcamp.setDescricao ("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAurili= new Dev();
        devAurili.setNome("Aurili");
        devAurili.inscreverBootcamp(bootcamp);
        System.out.println("ConteudosInscritos Aurili" + devAurili.getConteudosInscritos ());
        devAurili.progredir();
        devAurili.progredir();
        System.out.println("_");
        System.out.println("Conteudos Concluidos Aurili" + devAurili.getConteudosConcluidos ());
        System.out.println("XP:"+ devAurili.calcularTotalxp());

        System.out.println("------");

        Dev devHanna= new Dev();
        devHanna.setNome("Hanna");
        devHanna.inscreverBootcamp(bootcamp);
        System.out.println("ConteudosInscritos Hanna " + devHanna.getConteudosInscritos ());
        devHanna.progredir();
        devHanna.progredir();
        devHanna.progredir();
        System.out.println("_");
        System.out.println("Conteudos Concluidos Hanna" + devAurili.getConteudosConcluidos ());
        System.out.println("XP:"+ devHanna.calcularTotalxp());











    }
}

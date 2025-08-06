import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMylenna = new Dev();
        devMylenna.setNome("Mylenna");
        devMylenna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mylenna" + devMylenna.getConteudosInscritos());
        devMylenna.progredir();
        devMylenna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mylenna" + devMylenna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mylenna" + devMylenna.getConteudosConcluidos());
        System.out.println("XP:" + devMylenna.calcularTotalXp());

        System.out.println("==========================================================");

        Dev devThomas = new Dev();
        devThomas.setNome("Thomas");
        devThomas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thomas" + devThomas.getConteudosInscritos());
        devThomas.progredir();
        devThomas.progredir();
        devThomas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thomas" + devThomas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thomas" + devThomas.getConteudosConcluidos());
        System.out.println("XP: " + devThomas.calcularTotalXp());


    }

}

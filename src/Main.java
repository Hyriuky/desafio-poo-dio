import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java POO");
        curso1.setDescricao("Descrição curso Java POO");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Orange Tech Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Orange Tech Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eduardo:" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eduardo:" + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eduardo:" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXp());

        System.out.println("-------");

        Dev devTaisa = new Dev();
        devTaisa.setNome("Taisa");
        devTaisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Taisa:" + devTaisa.getConteudosInscritos());
        devTaisa.progredir();
        devTaisa.progredir();
        devTaisa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Taisa:" + devTaisa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Taisa:" + devTaisa.getConteudosConcluidos());
        System.out.println("XP:" + devTaisa.calcularTotalXp());

        System.out.println("-------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("XP:" + devCarlos.calcularTotalXp());

        System.out.println("-------");

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        //devJulia.progredir();
        System.out.println("-");
        System.out.println("XP:" + devJulia.calcularTotalXp());


      System.out.println(bootcamp.pesquisarPorNome("Eduardo"));
      bootcamp.retornaMentoriasPorNome("Taisa");
      bootcamp.retornaMentoriasPorNome("Carlos");

      bootcamp.exibirListaAlunosPorNome();
      bootcamp.exibirAlunosPorXP();
      bootcamp.removerAluno("Julia");
      bootcamp.exibirListaAlunosPorNome();


    }

}

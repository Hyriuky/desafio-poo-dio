import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Instrutor
        Instrutor instrutor = new Instrutor();
        instrutor.setNome("Camila Cavalcante");
        instrutor.setEspecialidade("Java e POO");

        // Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java POO");
        curso1.setDescricao("Descrição curso Java POO");
        curso1.setCargaHoraria(12);
        curso1.setInstrutor(instrutor);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(6);

        // Criando Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        mentoria.setInstrutor(instrutor);

        // Criando Desafio de Código
        DesafioDeCodigo desafio = new DesafioDeCodigo();
        desafio.setTitulo("Desafio de algoritmo");
        desafio.setDescricao("Resolva um desafio de ordenação.");
        desafio.setNivelDificuldade(2);

        // Criando Artigo
        Artigo artigo = new Artigo();
        artigo.setTitulo("A importância da POO");
        artigo.setDescricao("Leia sobre os pilares da POO.");
        artigo.setPaginas(5);

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Orange Tech Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Orange Tech Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafio);
        bootcamp.getConteudos().add(artigo);

        // Criando e Inscrevendo Devs
        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Eduardo: " + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Eduardo: " + devEduardo.getConteudosConcluidos());
        System.out.println("Nível de Eduardo: " + devEduardo.getNivel());
        System.out.println("XP de Eduardo: " + devEduardo.calcularTotalXp());


        System.out.println("\n-------");

        Dev devTaisa = new Dev();
        devTaisa.setNome("Taisa");
        devTaisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Taisa: " + devTaisa.getConteudosInscritos());
        devTaisa.progredir();
        devTaisa.progredir();
        devTaisa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Taisa: " + devTaisa.getConteudosConcluidos());
        System.out.println("Nível de Taisa: " + devTaisa.getNivel());
        System.out.println("XP de Taisa: " + devTaisa.calcularTotalXp());
        
        System.out.println("\n-------");
        
        System.out.println("Pesquisando por dev 'Eduardo':");
        System.out.println(bootcamp.pesquisarPorNome("Eduardo"));

        System.out.println("\n-------");
        
        System.out.println("Exibindo lista de alunos por XP:");
        bootcamp.exibirAlunosPorXP();

        System.out.println("\n-------");

        System.out.println("Removendo aluno 'Taisa' e listando novamente:");
        bootcamp.removerAluno("Taisa");
        bootcamp.exibirListaAlunosPorNome();
    }
}
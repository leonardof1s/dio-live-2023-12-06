package dio.bootcamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        Curso javaBasico = new Curso();
        javaBasico.setTitulo("Curso de Java Basico");
        javaBasico.setDescricao("Aprenda os conceitos basicos sobre Java");
        javaBasico.setCargaHoraria(8);

        Curso Python = new Curso();
        Python.setTitulo("Curso de Python");
        Python.setDescricao("curso voltado ao basico de Python");
        Python.setCargaHoraria(7);

        Curso javaAvancado = new Curso();
        javaAvancado.setTitulo("Curso de java Avancado");
        javaAvancado.setDescricao("Aprenda os conceitos avancados sobre Java");
        javaAvancado.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo orientacao a objetos");
        mentoria.setDescricao("Imersao sobre os pilares da orientacao a objetos");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Start #2 Java GFT");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        List<Conteudo> conteudosbootcamp = Arrays.asList(javaBasico, javaAvancado, mentoria);
        bootcamp.setConteudos(conteudosbootcamp);

        Dev leonardo = new Dev();
        leonardo.setNome("Leonardo");

        Dev nicole = new Dev();
        nicole.setNome("Nicole");

        leonardo.inscrever(Python);
        leonardo.inscrever(bootcamp);
        leonardo.progredir();
        leonardo.progredir();

        nicole.inscrever(bootcamp);
        nicole.progredir();
        nicole.progredir();
        nicole.progredir();
        nicole.progredir();

        System.out.println(String.format("XP do Leonardo :  %.2f", leonardo.calcularTotalXp()));
        System.out.println(String.format("XP da Nicole :  %.2f", nicole.calcularTotalXp()));

        List<Dev> ranking = Arrays.asList(leonardo, nicole).stream()
                .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
                .collect(Collectors.toList());

        for (Dev dev : ranking) {
            System.out.println(dev.getNome());

        }

    }
}

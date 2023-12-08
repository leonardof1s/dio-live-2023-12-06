package dio.bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<Conteudo>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<Conteudo>();

    public void inscrever(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            System.err.println("Voce ja esta inscrito nesse curso");
        } else {
            conteudosInscritos.add(conteudo);
            System.out.println("Inscrito com sucesso");
        }
    }

    public void inscrever(Bootcamp bootcamp) {
        // alternativa 1 foreach convencional
        for (Conteudo conteudo : bootcamp.getConteudos()) {
            inscrever(conteudo);

        }
        bootcamp.getDevs().add(this);
        // alternativa 2 Api do stream
        /* bootcamp.getConteudos().stream().forEach(this::inscrever); */
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Voce nao esta mais inscrito em nenhum conteudo");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return List<ConteudoEducacional> return the conteudosInscritos
     */
    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * @param conteudosInscritos the conteudosInscritos to set
     */
    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * @return List<ConteudoEducacional> return the conteudosConcluidos
     */
    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * @param conteudosConcluidos the conteudosConcluidos to set
     */
    public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

}

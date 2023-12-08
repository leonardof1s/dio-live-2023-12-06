package dio.bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private List<Conteudo> conteudos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

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
     * @return List<Dev> return the devs
     */
    public List<Dev> getDevs() {
        return devs;
    }

    /**
     * @param devs the devs to set
     */
    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    /**
     * @return LocalDate return the inicio
     */
    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    /**
     * @return LocalDate return the fim
     */
    public LocalDate getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    /**
     * @return List<ConteudoEducacional> return the conteudos
     */
    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * @param conteudos the conteudos to set
     */
    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

}
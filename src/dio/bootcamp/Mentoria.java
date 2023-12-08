package dio.bootcamp;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }

    /**
     * @return LocalDateTime return the data
     */
    public LocalDateTime getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
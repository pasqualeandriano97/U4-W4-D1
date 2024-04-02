package andrianopasquale97.U4W4D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Bevande extends MenùItem {
    private String nome;
    private int calorie;
    private double prezzo;

    public Bevande(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return  "\n" +
                nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '\n';
    }
}

package andrianopasquale97.U4W4D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter


public class MenùItem {
    private String nome;
    private int calorie;
    private double prezzo;

    public MenùItem() {
    }

    public MenùItem(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }
}

package andrianopasquale97.U4W4D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter

public class Pizza extends MenùItem {
    private String nome;
    private int calorie;
    private double prezzo;

    List<Toppings> toppings;

    private boolean maxi;



    public Pizza(String nome, int calorie, double prezzo, List<Toppings> toppings,boolean maxi){
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
        this.toppings = toppings;
        this.maxi =maxi;
    }

    public void setMaxi(boolean maxi) {
        this.maxi = maxi;
    }

    @Override
    public String toString() {
        return  "\n" +
                 nome +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                "\nPizzas Toppings=" + toppings +
                "\nXL=" + maxi +
                '\n';
    }
}


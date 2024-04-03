package andrianopasquale97.U4W4D1.entities;

import andrianopasquale97.U4W4D1.enums.statoOrdine;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
@Setter

public class Ordine {
    private int numero;
    private statoOrdine stato;
    private int numeroPosti;
    private LocalDate dataAcquisizione;
    private List<MenùItem> menù;
    private double totale;




    public Ordine(int numero, statoOrdine stato, int numeroPosti, LocalDate dataAcquisizione, List<MenùItem> menù,double totale) {
        this.numero = numero;
        this.stato = stato;
        this.numeroPosti = numeroPosti;
        this.dataAcquisizione = dataAcquisizione;
        this.menù = menù;
        this.totale = totale;
    }
}

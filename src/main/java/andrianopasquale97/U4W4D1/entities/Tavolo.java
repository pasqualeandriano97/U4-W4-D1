package andrianopasquale97.U4W4D1.entities;
import andrianopasquale97.U4W4D1.enums.stato;


public class Tavolo {
    private int numero;
    private int numeroPostiMax=8;
    private stato stato;
    private Ordine ordine;

    public Tavolo(int numero, stato stato, Ordine ordine) {
        this.numero = numero;
        this.stato = stato;
    }
}

package andrianopasquale97.U4W4D1.entities;

import andrianopasquale97.U4W4D1.enums.stato;
import andrianopasquale97.U4W4D1.enums.statoOrdine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;
import java.util.List;


@Configuration
@PropertySource("application.properties")
public class BeansConfig {
    @Bean
    public Toppings cheese() {
        return new Toppings("Cheese",92,0.69);
    }
    @Bean
    public Toppings ham() {
        return new Toppings("Ham",35,0.99);
    }
    @Bean
    public Toppings onions() {
        return new Toppings("Onions",22,0.69);
    }
    @Bean
    public Toppings salami() {
        return new Toppings("Salami",86,0.99);
    }
    @Bean
    public Toppings tomato (){
        return new Toppings("Tomato", 11, 0.69);
    }
    @Bean
    public Bevande limonata() {
        return new Bevande("Lemonade(0.33l)",128,1.29);
    }
    @Bean
    public Bevande water() {
        return new Bevande("Water(0.5l)",0,1.29);
    }
    @Bean
    public Bevande wine() {
        return new Bevande("Wine(0.75l,13%)",607,7.49);
    }

    @Bean
    @Primary
    public Pizza pizzaMargherita() {
        return new Pizza("Pizza Margherita",1104,4.99, List.of(tomato(),cheese()),false);
    }

    @Bean
    public Pizza pizzaSalami() {
        return new Pizza("Pizza Salami", 1104, 4.99,List.of( tomato(),cheese(),salami()),false);
    }

    @Bean
    public Menù menu() {
        return new Menù(List.of(pizzaMargherita(),pizzaSalami()),List.of(cheese(),ham(),onions(),salami()),List.of(limonata(),water(),wine()));
    }

    @Bean

   public List<MenùItem> ordine() {
       List<MenùItem> menùItems = List.of(pizzaMargherita(), pizzaSalami(),cheese(),water(),wine());
        return menùItems;}
    @Value("${costoCoperto}")int costoCoperto1;
    @Bean
    public double getTotale(int numero) {

        return (numero*costoCoperto1)+ ordine().stream().mapToDouble(MenùItem::getPrezzo).sum();
    }
    @Bean
    public Ordine ordine1() {

       return new Ordine(5, statoOrdine.IN_CORSO,2, LocalDate.now(),ordine(),getTotale(2));


    }

    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1, stato.IN_CORSO, ordine1());
    }
}

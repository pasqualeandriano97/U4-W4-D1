package andrianopasquale97.U4W4D1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
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
}

package andrianopasquale97.U4W4D1;

import andrianopasquale97.U4W4D1.entities.Menù;
import andrianopasquale97.U4W4D1.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U4W4D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U4W4D1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U4W4D1Application.class);


        System.out.println(ctx.getBean(Menù.class));

		Pizza p = ctx.getBean(Pizza.class);
		p.setMaxi(true);
		System.out.println(p);
	}

}

package andrianopasquale97.U4W4D1;

import andrianopasquale97.U4W4D1.entities.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class U4W4D1ApplicationTests {

    @Test
	public void startAppTest () {
		Logger logger = Logger.getLogger(U4W4D1ApplicationTests.class.getName());
		        logger.info("Starting application...");
    }

	@Test
	public void testTableCreation() {
		// Dati di test
		int numPosti = 2;
		int numTavolo = 1;
		boolean occupato = false;
		double conto = 0.0;

		// Creazione oggetto Table
		Table tavolo = new Table( numTavolo,numPosti, occupato, conto);

		// Verifiche

		assertEquals(numTavolo, tavolo.getNumTavolo());
		assertNotEquals(occupato, tavolo.isOccupato());
		assertEquals(conto, tavolo.getConto());
	}

	@Test
	public void testOrderCreation() {


		int numCovers = 2;

		Table table = new Table(4, 3, false, 0.0);

		Order order = new Order(numCovers, table);


		assertEquals(numCovers, order.getNumCoperti());

		assertEquals(table, order.getTable());

	}
	AppConfig appConfig = new AppConfig();
@Test
	public void testLemonadeCalories(){

	double calories =appConfig.lemonadeBean().getCalories();
	assertEquals(128,calories);
}

	@ParameterizedTest
	@ValueSource(strings = {"S", "H"})
	public void testPizzaNames(String menuName) {

		List<Pizza> menuItems = List.of(appConfig.pizzaSalamiBean(), appConfig.pizzaHawaiianBean());

		long count = menuItems.stream()
				.filter(pizza -> pizza.getName().startsWith(menuName))
				.count();
		Assertions.assertTrue(count > 0);

	}

}



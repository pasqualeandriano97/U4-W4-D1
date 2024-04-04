package andrianopasquale97.U4W4D1.entities;

import lombok.Getter;

import java.util.Collection;

@Getter
public abstract class Item {

	protected int calories;
	protected double price;

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

	public double getPrice() {
		        return this.price;
	}

	public int getCalories() {
		return calories;
	}


}

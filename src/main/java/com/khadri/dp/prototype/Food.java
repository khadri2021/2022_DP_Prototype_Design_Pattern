package com.khadri.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Food implements Cloneable {

	private List<String> foodItems;

	public Food() {

	}

	// clone method invoke duplicate object
	public Food(List<String> list) {
		this.foodItems = list;
	}

	public void loadFromDB() {
		foodItems = new ArrayList<>();
		foodItems.add("IDLY");
		foodItems.add("VADA");
		foodItems.add("DOSA");
	}

	public List<String> getFoodItems() {
		return this.foodItems;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();

		for (String tiffen : this.foodItems) {
			temp.add(tiffen);
		}

		return new Food(temp);
	}

}

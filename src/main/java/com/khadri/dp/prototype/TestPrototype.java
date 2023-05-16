package com.khadri.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		Food food = new Food();
		food.loadFromDB();
		System.out.println("Old Food Object " + food.getFoodItems());

		Food food1 = (Food) food.clone();
		System.out.println("New Food Object " + food1.getFoodItems());
		food1.getFoodItems().add("POORI");
		System.out.println("After Modify New Food Object " + food1.getFoodItems());

	}
}

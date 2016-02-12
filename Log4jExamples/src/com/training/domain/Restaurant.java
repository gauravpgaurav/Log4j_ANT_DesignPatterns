package com.training.domain;

import java.util.*;

import org.apache.log4j.Logger;

public class Restaurant {

	private List<FoodItem> items;

	Logger log = Logger.getRootLogger();

	public Restaurant() {

		items = new ArrayList<FoodItem>();
		init();
	}

	public void init() {

		FoodItem item1 = new FoodItem(101, "Butter Chicken", 350, false);
		FoodItem item2 = new FoodItem(102, "Mutter Paneer", 250, true);
		FoodItem item3 = new FoodItem(103, "Channa Masala", 200, true);
		FoodItem item4 = new FoodItem(104, "Chilli Chicken", 200, false);

		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		log.info("Food Items Added to Menu Card");
	}

	public List<FoodItem> getItems(String type) {

		List<FoodItem> typeList = new ArrayList<FoodItem>();

		for (FoodItem obj : items) {

			if ((type.equals("Veg") && (obj.isVegetarian())) || (type.equals("Non-Veg") && (!obj.isVegetarian()))) {
				typeList.add(obj);
			}
		}
		return typeList;
	}

	public List<FoodItem> getMenuCard() {
		return items;
	}

	@Override
	public String toString() {
		return "Restaurant [items=" + items + "]";
	}

}

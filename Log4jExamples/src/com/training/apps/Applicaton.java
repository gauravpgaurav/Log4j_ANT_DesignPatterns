package com.training.apps;

import java.util.*;

import org.apache.log4j.Logger;

import com.training.domain.FoodItem;
import com.training.domain.Restaurant;

public class Applicaton {
	public static void main(String[] args) {

		Logger log = Logger.getRootLogger();
		log.info("Starting Application");

		List<FoodItem> resultList = new ArrayList<FoodItem>();
		Restaurant restObj = new Restaurant();

		System.out.println();
		resultList = restObj.getItems("Veg");
		System.out.println("_VEG_");
		for (FoodItem i : resultList) {
			System.out.println(i);
		}
		System.out.println();
		resultList = restObj.getItems("Non-Veg");
		System.out.println("_NON-VEG_");
		for (FoodItem i : resultList) {
			System.out.println(i);
		}
		System.out.println();
		resultList = restObj.getMenuCard();
		System.out.println("_COMPLETE_MENU_");
		for (FoodItem i : resultList) {
			System.out.println(i);
		}
		log.info("Bye Bye");
	}

}

package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.*;

import org.json.simple.JSONObject;

import ca.ece.ubc.cpen221.mp5.Restaurant;
import ca.ece.ubc.cpen221.mp5.RestaurantDB;

public class Category implements MP5Function {

	@Override
	public double f(Restaurant yelpRestaurant, RestaurantDB db) {
		ArrayList<Double> categories = db.getCategories(yelpRestaurant);
		
		return categories.get(0);
	}

}

package ca.ece.ubc.cpen221.mp5;

import java.util.Set;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
// TODO: This class represents the Restaurant Database.
// Define the internal representation and 
// state the rep invariant and the abstraction function.
import org.json.simple.parser.ParseException;

import jdk.nashorn.internal.runtime.JSONFunctions;

public class RestaurantDB {

	private ArrayList<User> usersDB;
	private ArrayList<Restaurant> restaurantsDB;
	private ArrayList<Review> reviewsDB;

	/**
	 * Create a database from the Yelp dataset given the names of three files:
	 * <ul>
	 * <li>One that contains data about the restaurants;</li>
	 * <li>One that contains reviews of the restaurants;</li>
	 * <li>One that contains information about the users that submitted reviews.
	 * </li>
	 * </ul>
	 * The files contain data in JSON format.
	 * 
	 * @param restaurantJSONfilename
	 *            the filename for the restaurant data
	 * @param reviewsJSONfilename
	 *            the filename for the reviews
	 * @param usersJSONfilename
	 *            the filename for the users
	 */
	public RestaurantDB(String restaurantJSONfilename, String reviewsJSONfilename, String usersJSONfilename) {
		this.restaurantsDB = readRestaurantsJson(restaurantJSONfilename);
		this.usersDB = readUsersJSON(usersJSONfilename);
		this.reviewsDB = readReviewsJSON(reviewsJSONfilename);
	}

	public Set<Restaurant> query(String queryString) {
		// TODO: Implement this method
		// Write specs, etc.
		return null;
	}
	
	public JSONObject getRandomReview(String restaurant) {

		String bizID = null;
		ArrayList<Review> reviews = new ArrayList<Review>();

		for (Restaurant rest : restaurantsDB) {
			if (rest.getName().equals(restaurant)) {
				bizID = rest.getBusiness_id();
				break;
			}
		}

		for (Review review : reviewsDB) {
			if (review.getBusiness_id().equals(bizID)) {
				reviews.add(review);
			}
		}

		int random = (int) (Math.random() * reviews.size());

		return reviews.get(random).toJSON();
	}

	public JSONObject getRestaurant(String business_id) {
		JSONObject restaurant = null;

		for (Restaurant r : restaurantsDB) {
			if (r.getBusiness_id().equals(business_id)) {
				restaurant = r.toJSON();
			}
		}

		return restaurant;
	}

	public boolean addRestaurant(String restaurantInfo) {
		JSONObject restaurant = null;
		JSONParser parser = new JSONParser();
		Restaurant addition;
		Object obj;
		
		try {
			obj = parser.parse(restaurantInfo);
			restaurant = (JSONObject) obj;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		addition = new Restaurant(restaurant);
		
		if(restaurantsDB.contains(addition)) {
			return false;
		}
		
		return restaurantsDB.add(addition);

	}

	public boolean addUser(String userInfo) {
		JSONObject user = null;
		JSONParser parser = new JSONParser();
		User addition;
		Object obj;
		
		try {
			obj = parser.parse(userInfo);
			user = (JSONObject) obj;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		addition = new User(user);
		
		if(usersDB.contains(addition)) {
			return false;
		}
		
		return usersDB.add(addition);

	}

	public boolean addReview(String reviewInfo) {
		JSONObject review = null;
		JSONParser parser = new JSONParser();
		Review addition;
		Object obj;
		
		try {
			obj = parser.parse(reviewInfo);
			review = (JSONObject) obj;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		addition = new Review(review);
		
		if(reviewsDB.contains(addition)) {
			return false;
		}
		
		return reviewsDB.add(addition);
	}

	

	@SuppressWarnings({ "unchecked" })
	private static ArrayList<Restaurant> readRestaurantsJson(String restFileName) {

		ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

		BufferedReader br = null;
		JSONParser parser = new JSONParser();

		try {
			String currentLine;
			String file = "data/" + restFileName;
			br = new BufferedReader(new FileReader(file));

			while ((currentLine = br.readLine()) != null) {

				Object obj;
				try {

					obj = parser.parse(currentLine);
					JSONObject jsonObject = (JSONObject) obj;

					Restaurant restaurant = new Restaurant(jsonObject);

					restaurants.add(restaurant);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return restaurants;
	}

	@SuppressWarnings("unused")
	private static ArrayList<Review> readReviewsJSON(String reviewFileName) {

		ArrayList<Review> reviews = new ArrayList<Review>();
		BufferedReader br = null;
		JSONParser parser = new JSONParser();

		try {
			/////////// READ THE REVIEW FILE//////////////
			String currentLine;
			String file = "data/" + reviewFileName;
			br = new BufferedReader(new FileReader(file));

			while ((currentLine = br.readLine()) != null) {

				Object obj;
				try {

					obj = parser.parse(currentLine);
					JSONObject jsonObject = (JSONObject) obj;

					Review review = new Review(jsonObject);

					reviews.add(review);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return reviews;
	}

	private static ArrayList<User> readUsersJSON(String userFileName) {

		ArrayList<User> users = new ArrayList<User>();
		BufferedReader br = null;
		JSONParser parser = new JSONParser();

		try {
			/////////// READ THE REVIEW FILE//////////////
			String currentLine;
			String file = "data/" + userFileName;
			br = new BufferedReader(new FileReader(file));

			while ((currentLine = br.readLine()) != null) {

				Object obj;
				try {

					obj = parser.parse(currentLine);
					JSONObject jsonObject = (JSONObject) obj;

					User user = new User(jsonObject);

					users.add(user);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}

	public ArrayList<User> getUsersDB() {
		return usersDB;
	}

	public ArrayList<Restaurant> getRestaurantsDB() {
		return restaurantsDB;
	}

	public ArrayList<Review> getReviewsDB() {
		return reviewsDB;
	}

}

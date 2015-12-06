package TEST;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import ca.ece.ubc.cpen221.mp5.*;
import ca.ece.ubc.cpen221.mp5.statlearning.Algorithms;


public class Test {

	public static void main(String[] args) {
		
		String users = "users.json";
		String reviews = "reviews.json";
		String restaurants = "restaurants.json";
		RestaurantDB db = new RestaurantDB(restaurants, reviews, users);
		System.out.println("here");
		 
		
		java.util.List<Set<Restaurant>> bitch = Algorithms.kMeansClustering(5, db); 
		
		System.out.println("here");
		int count = 0;
		for(Set<Restaurant> s : bitch) {
			count++;
			System.out.println("k no. " + count + " size: " + s.size());
			for(Restaurant r : s) {
				System.out.println("\t"+r.getName());
			}
		}
	}
	
}

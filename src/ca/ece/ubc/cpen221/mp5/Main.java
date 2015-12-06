package ca.ece.ubc.cpen221.mp5;

import java.io.IOException;

import com.sun.corba.se.spi.activation.Server;

import ca.ece.ubc.cpen221.mp5.server.RestaurantDBServer;

public class Main {

	public static void main(String[] args) {
		
		RestaurantDBServer server = null;
		String restaurantFile = "restaurants.json";
		String userFile = "users.json";
		String reviewFile = "reviews.json";
		
		try {
			server = new RestaurantDBServer(6666, restaurantFile, userFile, reviewFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		server.runServer();
		
	}

}

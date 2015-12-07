package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.*;

import ca.ece.ubc.cpen221.mp5.*;

public class MeanRating implements MP5Function {

	@Override
	public double f(Restaurant yelpRestaurant, RestaurantDB db) {
		ArrayList<Review> reviews = db.getReviewsDB();
		double totalStars = 0.0;
		for(Review review : reviews){
			if(review.getBusiness_id().equals(yelpRestaurant.getBusiness_id())){
				totalStars += Double.parseDouble(review.getStarsString());
			}
		}
		
		return totalStars / Double.parseDouble(yelpRestaurant.getReview_count());
	}

}

package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.*;

import ca.ece.ubc.cpen221.mp5.Restaurant;
import ca.ece.ubc.cpen221.mp5.RestaurantDB;

public class PredictionFunction implements MP5Function {
	@SuppressWarnings("unused")
	private double r_squared;
	private double aVal;
	private double bVal;
	private MP5Function featureFunction;
	
	public PredictionFunction(ArrayList<Double> regressionCoefficients, MP5Function featureFunction){
		this.r_squared = regressionCoefficients.get(0);
		this.aVal = regressionCoefficients.get(1);
		this.bVal = regressionCoefficients.get(2);
		this.featureFunction = featureFunction;
	}

	@Override
	public double f(Restaurant yelpRestaurant, RestaurantDB db) {
		double prediction = (bVal * featureFunction.f(yelpRestaurant, db)) + aVal;
		
		if(prediction < 0.0){
			prediction = 0.0;
		}else if(prediction > 5.0){
			prediction = 5.0;
		}
		
		return prediction;
	}

}

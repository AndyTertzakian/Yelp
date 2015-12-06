package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.*;
import ca.ece.ubc.cpen221.mp5.*;

public class Algorithms {

	/**
	 * Use k-means clustering to compute k clusters for the restaurants in the
	 * database.
	 * 
	 * @param db
	 * @return
	 */
	public static List<Set<Restaurant>> kMeansClustering(int k, RestaurantDB db) {
		List<Set<Restaurant>> restaurants = new ArrayList<Set<Restaurant>>();
		Map<Restaurant, Double[]> coordinates = new HashMap<Restaurant, Double[]>();
		Map<Double[], Set<Restaurant>> clusters = new HashMap<Double[], Set<Restaurant>>();
		ArrayList<Double[]> points = new ArrayList<Double[]>();
		ArrayList<Double[]> prevPoints = new ArrayList<Double[]>();

		for (Restaurant restaurant : db.getRestaurantsDB()) {
			Double[] coords = new Double[2];
			coords[0] = Double.parseDouble(restaurant.getLatitude());
			coords[1] = Double.parseDouble(restaurant.getLongitude());
			coordinates.put(restaurant, coords);
		}

		for (int i = 0; i < k; i++) {
			Double[] start = new Double[2];
			int index = (int) (Math.random() * coordinates.keySet().size());
			start = coordinates.get(db.getRestaurantsDB().get(index));

			points.add(start);
		}
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
			prevPoints = points;
			clusters = getClusters(points, coordinates);
			points = computePoints(clusters, points);

			System.out.println("prevPoints:");
			for (int i = 0; i < prevPoints.size(); i++) {
				System.out.format("\n%.5f, %.5f", prevPoints.get(i)[0], prevPoints.get(i)[1]);
			}

			System.out.println("\n\tpoints:");
			for (int i = 0; i < points.size(); i++) {
				System.out.format("\n\t%.5f, %.5f", points.get(i)[0], points.get(i)[1]);
			}

			System.out.println("press enter to continue");
			sc.nextLine();

			for (int i = 0; i < points.size(); i++) {
				double xmargin = Math.abs(prevPoints.get(i)[0] - points.get(i)[0]);
				double ymargin = Math.abs(prevPoints.get(i)[1] - points.get(i)[1]);
				if(xmargin < 0.0000000000001 && ymargin < 0.0000000000001) {
					flag = false;
				}else {
					flag = true;
					break;
				}
			}

		} while (flag);

		clusters = getClusters(points, coordinates);

		for (Double[] d : clusters.keySet()) {
			restaurants.add(clusters.get(d));
		}

		return restaurants;
	}

	private static ArrayList<Double[]> computePoints(Map<Double[], Set<Restaurant>> clusters,
			ArrayList<Double[]> points) {
		ArrayList<Double[]> newPoints = new ArrayList<Double[]>();

		for (int i = 0; i < points.size(); i++) {
			Double totalLat = new Double(0);
			Double totalLon = new Double(0);
			int count = 0;

			for (Restaurant r : clusters.get(points.get(i))) {
				totalLat += Double.parseDouble(r.getLatitude());
				totalLon += Double.parseDouble(r.getLongitude());
				count++;
			}

			Double[] k = new Double[2];
			k[0] = totalLat / count;
			k[1] = totalLon / count;

			newPoints.add(k);
		}

		return newPoints;
	}

	private static Map<Double[], Set<Restaurant>> getClusters(ArrayList<Double[]> points,
			Map<Restaurant, Double[]> coordinates) {
		Map<Double[], Set<Restaurant>> result = new HashMap<Double[], Set<Restaurant>>();

		for (Restaurant r : coordinates.keySet()) {
			double x = coordinates.get(r)[0];
			double y = coordinates.get(r)[1];
			double x_min = x - points.get(0)[0];
			double y_min = y - points.get(0)[1];
			double distance = (double) Math.sqrt(Math.pow(x_min, 2) + Math.pow(y_min, 2));
			double shortestDistance = distance;
			int index = 0;

			for (int i = 1; i < points.size(); i++) {
				x_min = x - points.get(i)[0];
				y_min = y - points.get(i)[1];
				distance = (double) Math.sqrt(Math.pow(x_min, 2) + Math.pow(y_min, 2));
				if (distance < shortestDistance) {
					shortestDistance = distance;
					index = i;
				}
			}

			if (result.containsKey(points.get(index))) {
				result.get(points.get(index)).add(r);
			} else {
				Set<Restaurant> rSet = new HashSet<Restaurant>();
				rSet.add(r);
				result.put(points.get(index), rSet);
			}

		}

		return result;
	}

	public static String convertClustersToJSON(List<Set<Restaurant>> clusters) {
		// TODO: Implement this method
		return null;
	}

	public static MP5Function getPredictor(User u, RestaurantDB db, MP5Function featureFunction) {
		// TODO: Implement this method
		return null;
	}

	public static MP5Function getBestPredictor(User u, RestaurantDB db, List<MP5Function> featureFunctionList) {
		// TODO: Implement this method
		return null;
	}
}
package ca.ece.ubc.cpen221.mp5;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.sun.prism.ResourceFactoryListener;

import jdk.nashorn.internal.scripts.JO;

public class Restaurant {

	private String open;
	private final String url;
	private final String longitude;
	private final JSONArray neighborhoods;
	private final String business_id;
	private final String name;
	private final JSONArray categories;
	private final String state;
	private final String type;
	private final String stars;
	private final String city;
	private final String full_address;
	private final String review_count;
	private final String photo_url;
	private final JSONArray schools;
	private final String latitude;
	private final String price;

	public Restaurant(JSONObject jObj) {

		// get relevant parameters
		this.open = jObj.get("open").toString();
		this.url = (String) jObj.get("url");
		this.longitude = jObj.get("longitude").toString();
		this.neighborhoods = (JSONArray) jObj.get("neighborhoods");
		this.business_id = (String) jObj.get("business_id");
		this.name = (String) jObj.get("name");
		this.categories = (JSONArray) jObj.get("categories");
		this.state = (String) jObj.get("state");
		this.type = (String) jObj.get("type");
		this.stars = jObj.get("stars").toString();
		this.city = (String) jObj.get("city");
		this.full_address = (String) jObj.get("full_address");
		this.review_count = jObj.get("review_count").toString();
		this.photo_url = (String) jObj.get("photo_url");
		this.schools = (JSONArray) jObj.get("schools");
		this.latitude = jObj.get("latitude").toString();
		this.price = jObj.get("price").toString();

	}

	public String getOpen() {
		return open;
	}

	public String getUrl() {
		return url;
	}

	public String getLongitude() {
		return longitude;
	}

	public JSONArray getNeighborhoods() {
		return neighborhoods;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public String getName() {
		return name;
	}

	public JSONArray getCategories() {
		return categories;
	}

	public String getState() {
		return state;
	}

	public String getType() {
		return type;
	}

	public String getStars() {
		return stars;
	}

	public String getCity() {
		return city;
	}

	public String getFull_address() {
		return full_address;
	}

	public String getReview_count() {
		return review_count;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public JSONArray getSchools() {
		return schools;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getPrice() {
		return price;
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject result = new JSONObject();

		result.put("open", open);
		result.put("url", url);
		result.put("longitude", longitude);
		result.put("neighborhoods", neighborhoods);
		result.put("business_id", business_id);
		result.put("name", name);
		result.put("categories", categories);
		result.put("state", state);
		result.put("type", type);
		result.put("stars", stars);
		result.put("city", city);
		result.put("full_address", full_address);
		result.put("review_count", review_count);
		result.put("photo_url", photo_url);
		result.put("schools", schools);
		result.put("latitude", latitude);
		result.put("price", price);

		return result;
	}
}

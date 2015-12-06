package ca.ece.ubc.cpen221.mp5;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class User {

	private final String url;
	private final JSONObject votes;
	private final String funny;
	private final String useful;
	private final String cool;
	private final String review_count;
	private final String type;
	private final String user_id;
	private final String name;
	private final String average_stars;

	public User(JSONObject jObj) {

		this.url = (String) jObj.get("url");
		this.votes = (JSONObject) jObj.get("votes");
		this.funny = this.votes.get("funny").toString();
		this.useful = this.votes.get("useful").toString();
		this.cool = this.votes.get("cool").toString();
		this.review_count = jObj.get("review_count").toString();
		this.type = (String) jObj.get("type");
		this.user_id = (String) jObj.get("user_id");
		this.name = (String) jObj.get("name");
		double stars = (double) jObj.get("average_stars");
		this.average_stars = Double.toString(stars);

	}
	
	public String getUrl() {
		return url;
	}

	public String getFunny() {
		return funny;
	}

	public String getUseful() {
		return useful;
	}

	public String getCool() {
		return cool;
	}

	public String getReview_count() {
		return review_count;
	}

	public String getType() {
		return type;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getName() {
		return name;
	}

	public String getAverage_stars() {
		return average_stars;
	}

	

}

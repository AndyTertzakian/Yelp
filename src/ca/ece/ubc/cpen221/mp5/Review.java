package ca.ece.ubc.cpen221.mp5;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Review {

	private final String type;
	private final String business_id;
	private final JSONObject votes;
	private final String cool;
	private final String useful;
	private final String funny;
	private final String review_id;
	private final String text;
	private final String starsString;
	private final String user_id;
	private final String date;

	public Review(JSONObject jObj) {

		// get relevant parameters
		this.type = (String) jObj.get("type");
		this.business_id = (String) jObj.get("business_id");
		this.votes =  (JSONObject) jObj.get("votes");
		this.cool = this.votes.get("cool").toString();
		this.useful = this.votes.get("useful").toString();
		this.funny = this.votes.get("funny").toString();
		this.review_id = (String) jObj.get("review_id");
		this.text = (String) jObj.get("text");
		long stars = (long) jObj.get("stars");
		this.starsString = Long.toString(stars);
		this.user_id = (String) jObj.get("user_id");
		this.date = (String) jObj.get("date");

	}

	public String getType() {
		return type;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public String getCool() {
		return cool;
	}

	public String getUseful() {
		return useful;
	}

	public String getFunny() {
		return funny;
	}

	public String getReview_id() {
		return review_id;
	}

	public String getText() {
		return text;
	}

	public String getStarsString() {
		return starsString;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getDate() {
		return date;
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject result = new JSONObject();

		result.put("type", type);
		result.put("business_id", business_id);
		result.put("votes", votes);
		result.put("review_id", review_id);
		result.put("text", text);
		result.put("stars", Double.parseDouble(starsString));
		result.put("user_id", user_id);
		result.put("date", date);

		return result;
	}
}

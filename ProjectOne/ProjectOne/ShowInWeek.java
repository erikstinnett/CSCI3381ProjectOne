package ProjectOne;
import java.util.ArrayList;
// Simple roster
// Student class  = show in week class - single entity class. One show in a spec week
// Roster == collection class
// USE ARRAY LIST NOT ARRAY: ArrayList and hints for Proj1: around 30min video BB
// Complex roster, copy paste readfile

// Purge show: new private entity in class. Bool "isPurged", showable or not
// Linear search over all array (for each loop) to find "is my show purged?"
// Unpurge similar to purge. Copypaste code change bool
// RAndom: range for all shows, random get

public class ShowInWeek {
	private String week;
	private String category;
	private String weekly_rank;
	private String show_title;
	private String season_title;
	private String weekly_hours_viewed;
	private String cumulative_weeks_in_top_ten;

	public ShowInWeek() {
		week = "not set";
		category = "not set";;
		weekly_rank = "not set";;
		show_title = "not set";;
		season_title = "not set";;
		weekly_hours_viewed = "not set";;
		cumulative_weeks_in_top_ten = "not set";;
	}
	public ShowInWeek(String week, String category, String weekly_rank,  String show_title,String season_title, String weekly_hours_viewed, String cumulative_weeks_in_top_ten) {
		this.week = week;
		this.category = category;
		this.weekly_rank = weekly_rank;
		this.show_title = show_title;
		this.season_title = season_title;
		this.weekly_hours_viewed = weekly_hours_viewed;
		this.cumulative_weeks_in_top_ten = cumulative_weeks_in_top_ten;
		
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getWeekly_rank() {
		return weekly_rank;
	}

	public void setWeekly_rank(String weekly_rank) {
		this.weekly_rank = weekly_rank;
	}

	public String getShow_title() {
		return show_title;
	}

	public void setShow_title(String show_title) {
		this.show_title = show_title;
	}

	public String getSeason_title() {
		return season_title;
	}

	public void setSeason_title(String season_title) {
		this.season_title = season_title;
	}

	public String getWeekly_hours_viewed() {	// Use a string! Get length of string
		return weekly_hours_viewed;
	}

	public void setWeekly_hours_viewed(String weekly_hours_viewed) {
		this.weekly_hours_viewed = weekly_hours_viewed;
	}

	public String getCumulative_weeks_in_top_ten() {
		return cumulative_weeks_in_top_ten;
	}

	public void setCumulative_weeks_in_top_ten(String cumulative_weeks_in_top_ten) {
		this.cumulative_weeks_in_top_ten = cumulative_weeks_in_top_ten;
	}
	
	public String toString() {
		String toReturn = "\n\nWeek: " + week + " \nCategory: " + category +  " \nWeekly Rank: " + weekly_rank + " \nShow title: " + show_title + " \nSeason title: " + season_title + " \nWeekly Hours Viewed: " + weekly_hours_viewed 
				+ " \nWeeks in top ten: " + cumulative_weeks_in_top_ten + "\n";
				
		return toReturn;
	}

}






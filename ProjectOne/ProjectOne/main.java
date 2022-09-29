// Erik Stinnett
package ProjectOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args)  throws IOException {
		
		File movieFile = new File("movieFile.txt");
		if (movieFile.createNewFile()) {
			System.out.println("File created: " + movieFile.getName());
		}
		else {
			System.out.println("File already exists");
		}
		
		// Manually create two show instances to test
		ShowInWeek newSIW = new ShowInWeek("2025-09-11","Horror","1","Stranger Things","Season One","5012","5");
		ShowInWeek newSIW1 = new ShowInWeek("2015-11-16","Fantasy","1","Fellowship of the Ring","N/A","10000","50");
		
		// Instantiaze collections object
		Collections show = new Collections();

		
		// Adds the two new shows to the ArrayList
		show.add(newSIW);
		show.add(newSIW1);
		
		
		System.out.println("\n\nPrinting of manually-created show objects\n");
		System.out.println(show);
		
		// Tests the PURGE method. 
		// If PURGED, the show will have an '*' next to the title
        System.out.println("\n\nPurge test: "); 		
		show.purge("Stranger Things");
		System.out.println(show);
		
		
		//Removes the asterisk from the show title
        System.out.println("\n\nUNPurge test: "); 		
		show.unpurge("Stranger Things");
		System.out.println(show);
		
		System.out.println("\n\nEdit test: ");
		
		// This was the best way I could figure out how to create a method to allow for modification of ArrayList data
		/*Edit Show Parameters:
		 * show.editShow(INDEX, "VALUE TO CHANGE", "VALUE TO CHANGE TO")
		 * To change week: "week"
		 * To change title: "title"
		 * To change season title: "season"
		 * To change category: "category"
		 * To change weekly rank: "weekly rank"
		 * To change weekly hours viewed: "weekly hours"
		 * To change cumulative hours in top 10: "top ten"
		 */
		show.editShow(1, "top ten", "35");		// First parameter in function the INDEX of the show to edit.
		System.out.println(show);
					
		
		
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader("ProjectOne/netflix.txt");
			lineReader = new BufferedReader(fr);
			String line = null;
			int count = 0;
			
			while ((line = lineReader.readLine())!= null) {
				String week = line;
				String category = lineReader.readLine();
				String weekly_rank = lineReader.readLine();
				String show_title = lineReader.readLine();
				String season_title = lineReader.readLine();
				String weekly_hours_viewed = lineReader.readLine();
				String cumulative_weeks_in_top_ten = lineReader.readLine();
				
				show.add(new ShowInWeek(week, category, weekly_rank, show_title, season_title, weekly_hours_viewed, cumulative_weeks_in_top_ten));
		}
		} catch (Exception e) {
			System.err.println("there was a problem with the file reader, try different read type.");
			try {
				FileReader fr = new FileReader("ProjectOne/netflix.txt");
				lineReader = new BufferedReader(fr);				
				String line = null;
				while ((line = lineReader.readLine())!=null) {
					
					String week = lineReader.readLine();
					String category = lineReader.readLine();
					String weekly_rank = lineReader.readLine();
					String show_title = lineReader.readLine();
					String season_title = lineReader.readLine();
					String weekly_hours_viewed = lineReader.readLine();
					String cumulative_weeks_in_top_ten = lineReader.readLine();
					
					show.add(new ShowInWeek(week, category, weekly_rank, show_title, season_title, weekly_hours_viewed, cumulative_weeks_in_top_ten));

			}
			} catch (Exception e2) {
				System.err.println("there was a problem with the file reader, try again.  either no such file or format error");
			} finally {
				if (lineReader != null)
					try {
						lineReader.close();
					} catch (IOException e2) {
						System.err.println("could not close BufferedReader");
					}
			}			
		} finally {
			if (lineReader != null)
				try {
					lineReader.close();
				} catch (IOException e) {
					System.err.println("could not close BufferedReader");
				}
		}
					
		//Randomly selects a show for the user
		show.randomSelection();
		
		// I had full intention of trying to actually make this predictable but I ran out of time :(
		// A "predictive" selection
		show.predictiveSelection("You");
		
		
		
		//Prints all shows with 'week' value equal to input parameter
		show.getShows("2022-09-04");

		//Writes file
		show.writeFile("movieFile.txt");
	}

}

package ProjectOne;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Collections {

	//private int size;
	//private static final int DEFAULT_SIZE = 10;
	private ArrayList<ShowInWeek> show;
	private boolean purged;
	private String fileName;
	
	public Collections() {
		show = new ArrayList<ShowInWeek>();
		purged = false;
		fileName = null;
	}

	
	// Adds the show to the ArrayList
	public void add(ShowInWeek show) {
		this.show.add(show);
		
	}

	//Purges the show
	public void purge(String title) {
		for (ShowInWeek show : show) {
			if (show.getShow_title().equals(title)) {
				show.setShow_title("*" + title);
				purged = true;
			}

		}
		
	}
	
	//Removes the purge-status of the show
	public void unpurge(String title) {
		for (ShowInWeek show : show) {
			if (show.getShow_title().equals("*" + title)) {
				
				show.setShow_title(title);
			}
		}		
	}
	

	//Edits a show based on index value 
	public void editShow(int index, String value, String input) {
		
		if (value.equals("week")) {
			this.show.get(index).setWeek(input);
		}
		else if (value.equals("title")) {
			this.show.get(index).setShow_title(input);
		}
		else if (value.equals("season")) {
			this.show.get(index).setSeason_title(input);
		}
		else if (value.equals("category")) {
			this.show.get(index).setCategory(input);
		}
		else if (value.equals("weekly rank")) {
			this.show.get(index).setWeekly_rank(input);
		}
		else if (value.equals("weekly hours")) {
			this.show.get(index).setWeekly_hours_viewed(input);
		}
		else if (value.equals("top ten")) {
			this.show.get(index).setCumulative_weeks_in_top_ten(input);
		}
		else {
			System.out.println("Error, invalid input value");
		}
	}

	//Randomly chooses a film
	public void randomSelection() {
		int index = (int)(Math.random() * this.show.size());
		
		System.out.println("\nRandom Show Recommendation: " + this.show.get(index).getShow_title());

	}
	
	//"predicts" a show to watch
	public void predictiveSelection(String title) {
		int index = (int)(Math.random() * this.show.size());
		if (!this.show.get(index).getShow_title().equals(title)) {
			System.out.println("'Predictive' Show Recommendation: " + this.show.get(index).getShow_title());
		}
	}
	
	// Retrieves all shows of a given week
	public void getShows(String week) {
		System.out.println("\nPrinting shows for week: " + week);
		for (ShowInWeek show : show) {
			if(show.getWeek().equals(week)) {
				System.out.println(show.getShow_title());
			}
		}
	}
	

	//Write file methods:
	public void writeFile () {
		// overloaded method: this calls doWrite with file used to read data
		// use this for saving data between runs
		doWrite(fileName);
	} // end of writeFile method
	
	public void writeFile(String altFileName) {
		// overloaded method: this calls doWrite with different file name 
		// use this for testing write
		doWrite(altFileName);		
	}// end of writeFile method
	
	private void doWrite(String fileName) {
		// this method writes all of the data in the persons array to a file
		try
		{

			FileWriter fw = new FileWriter(fileName);
			BufferedWriter myOutfile = new BufferedWriter(fw);			

			for (ShowInWeek show : show) {
				myOutfile.write("Movie:\n");
				myOutfile.write(show.getWeek() + "\n");
				myOutfile.write(show.getCategory() + "\n");
				myOutfile.write(show.getWeekly_rank() + "\n");
				myOutfile.write(show.getShow_title() + "\n");
				myOutfile.write(show.getSeason_title() + "\n");
				myOutfile.write(show.getWeekly_hours_viewed() + "\n");
				myOutfile.write(show.getCumulative_weeks_in_top_ten() + "\n");

				
				}	
			myOutfile.flush();
			myOutfile.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Didn't save to " + fileName);
		}
	}
	
	public String toString() {
		
		String toReturn = show.toString();
		return toReturn;
	}
	
}

package ProjectOne;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	private String movieList;
	Collections show = new Collections();

	public ReadFile() {
		// default constructor

		movieList = "empty movie list";

	}
	
	public ReadFile(String ml) {
		this();
		movieList = ml;
		readFile();
		
	}
	
	public void readFile () {
		BufferedReader lineReader = null;
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
	}
}*/

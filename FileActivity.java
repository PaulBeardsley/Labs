package qa.practice;
import java.io.*;

public class FileActivity {
	public static void main(String[] args) throws IOException {
		readData();
		/*appendFile("When it's spring again");
		appendFile("I'll bring again");
		appendFile("Tulips from Amsterdam");
		
		writeToFile("When it's spring again");
		writeToFile("I'll bring again");
		writeToFile("Tulips from Amsterdam");*/		
	}
	private static void readData() throws IOException {
		File file = new File("records.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine()) != null)
			System.out.println(line);
		br.close();
	}
	
	private static void appendFile(String line) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("musings.txt", true));
		out.write(line + "\n");
		out.close();
	}
	
	private static void writeToFile(String line) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("oneliner.txt", false));
		out.write(line + "\n");
		out.close();
	}

}

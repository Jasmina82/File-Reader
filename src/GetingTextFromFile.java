
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class GetingTextFromFile {

	/* method that returns whole text */
	public static String textFromFile(String fileName) {
		String wholeText = "";
		File file = new File(fileName);

		try {
			Scanner input = new Scanner(file);

			StringBuilder build = new StringBuilder();
			StringBuffer buff = new StringBuffer(build);

			while (input.hasNext()) {
				buff.append(input.nextLine());
			}
			wholeText = buff.toString();

			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist!");
			return null;
		}

		return wholeText;
	}

	/* Method for returning text of a file from web */
	public static String fileFromUrl(String fileName) throws MalformedURLException, FileNotFoundException, Exception {

		String wholeText = "";

		try {
			java.net.URL url = new java.net.URL(fileName);

			Scanner unos = new Scanner(url.openStream());

			StringBuilder build = new StringBuilder();
			StringBuffer buff = new StringBuffer(build);

			while (unos.hasNext()) {
				buff.append(unos.nextLine());
			}

			wholeText = buff.toString();
			unos.close();
		} catch (MalformedURLException ex) {
			System.out.println("URL doesn't exist ! ");
			Main.run();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something is wrong with your input: " + e.getMessage() + "\nTry again.");
			Main.run();

		}
		return wholeText;
	}

}

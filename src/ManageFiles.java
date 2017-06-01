import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class ManageFiles {

	/*Method for reading files from web*/
	public static ArrayList<String> fileFromUrl(String fileName)
			throws MalformedURLException, FileNotFoundException, Exception {

		ArrayList<String> contentOfTheFile = new ArrayList<>();

		try {
			java.net.URL url = new java.net.URL(fileName);

			Scanner unos = new Scanner(url.openStream());

			String line;

			while (unos.hasNext()) {
				line = unos.nextLine();
				contentOfTheFile.add(line);

			}
			unos.close();
		} catch (MalformedURLException ex) {
			System.out.println("URL doesn't exist ! ");
			Main.run();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage() + " file doesn't exist !");
			Main.run();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something is wrong with your input: " + e.getMessage());
			Main.run();

		}
		return contentOfTheFile;
	}

	/*Method for reading file from local*/
	public static ArrayList<String> fileFromLocal(String fileName) throws NoSuchFileException, Exception {

		ArrayList<String> contentOfTheFile = new ArrayList<>();

		try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {

			String line;

			while ((line = reader.readLine()) != null) {

				contentOfTheFile.add(line);

			}

		} catch (NoSuchFileException e) {
			System.out.println(e.getMessage() + " file dosn't exist !");
			Main.run();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something is wrong with your input: " + e.getMessage());
			Main.run();
		}

		return contentOfTheFile;

	}
}
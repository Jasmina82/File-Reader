import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		run();
	}

	/* Method for start */
	public static void run() throws Exception {
		
		System.out.println("Enter the name of the file: ");

		String user = input.nextLine();
		checkSourceOfFile(user);
	}

	/*Depends of file source choose which method to call*/
	public static void checkSourceOfFile(String user) throws MalformedURLException, FileNotFoundException, Exception {
		
		ArrayList<String> contentOfTheFile = new ArrayList<>();
		
		if (user.startsWith("http://"))
			contentOfTheFile = ManageFiles.fileFromUrl(user);

		else
			contentOfTheFile = ManageFiles.fileFromLocal(user);

		getDataFromFile(contentOfTheFile);
	}

	/* Method with results from file */
	public static void getDataFromFile(ArrayList<String> contentFromFile) {

		MethodsForFileDatas readFile = new MethodsForFileDatas(contentFromFile);

		System.out.println("File's data: ");
		readFile.howManyWords();
		readFile.howManyUniqueWords();
		readFile.howManySentences();
		readFile.howManyLetters();
		readFile.howManyCharacters();
		readFile.howManyTimesLetterRepeats();

	}

}

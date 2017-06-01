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

		ArrayList<String> contentOfTheFile = new ArrayList<>();
		System.out.println("Enter the name of the file: ");

		String user = input.nextLine();

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

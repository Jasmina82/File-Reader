
import java.io.FileNotFoundException;
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

	/* Depends of file source choose which method to call */
	public static void checkSourceOfFile(String user) throws FileNotFoundException, Exception {

		String tekstFromFile = " ";

		if (user.startsWith("http://"))
			tekstFromFile = GetingTextFromFile.fileFromUrl(user);

		else
			tekstFromFile = GetingTextFromFile.textFromFile(user);

		if (tekstFromFile == null) {
			System.out.println("Try again");
			run();
		}

		else if (tekstFromFile.length() > 0 && tekstFromFile != null) {
			getDataFromFile(tekstFromFile);
		} else {
			System.out.println(user + " is empty file!Try again!");
			run();
		}
	}

	/* Method with results from file */
	public static void getDataFromFile(String contentFromFile) throws Exception {

		CharacterAndSentencesInFile readChars = new CharacterAndSentencesInFile(contentFromFile);
		WordsAndSentences readWord = new WordsAndSentences(contentFromFile);

		System.out.println("File's data: ");
		readWord.howManyWords();
		readWord.howManyUniqueWords();
		readWord.howManySentences();
		readChars.howManyLetters();
		readChars.howManyCharacters();
		try {
			readChars.howManyTimesLetterRepeats();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nSomething went wrong with counting occurrency of each Letter");
		}
	}

}

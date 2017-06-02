
import java.util.ArrayList;

public class WordsAndSentences {

	String tekst;

	public WordsAndSentences(String contentFromFile) {
		this.tekst = contentFromFile;
	}

	/* method counts words in file */
	public void howManyWords() {

		int number = 0;
		String[] splitedWords = tekst.split("[ ,.!?-_()+~\n]");

		for (String word : splitedWords) {
			if (word.matches("\\w+")) {
				number++;
			}
		}
		System.out.println("\nWords in file: " + number);
	}

	/* method counts unique words in file */
	public void howManyUniqueWords() {

		ArrayList<String> uniqueWords = new ArrayList<>();
		String[] splitedWords = tekst.split("[ ,.!?-_()+~]");

		for (String word : splitedWords) {
			if (word.matches("\\w+") && !uniqueWords.contains(word)) {
				uniqueWords.add(word);
			}
		}
		System.out.println("\nUnique words: " + uniqueWords.size());
	}

	/* method counts sentences in file */
	public void howManySentences() {

		String[] sentences = this.tekst.split("[.!?]");

		System.out.println("\nSentences: " + (sentences.length));
	}

}

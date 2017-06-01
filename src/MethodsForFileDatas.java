import java.util.ArrayList;

public class MethodsForFileDatas {
	ArrayList<String> contentFromFile = new ArrayList<>();

	/*constructor*/
	public MethodsForFileDatas(ArrayList<String> contentFromFile2) {
		this.contentFromFile = contentFromFile2;
	}

	public void howManyWords() {

		int number = 0;

		for (int i = 0; i < contentFromFile.size(); i++) {
			String[] words = contentFromFile.get(i).split(" ");

			for (String word : words) {
				if (word.matches("\\w+")) {
					number++;
				}
			}
		}

		System.out.println("\nWords in file: " + number);
	}

	public void howManyUniqueWords() {

		ArrayList<String> uniqueWords = new ArrayList<>();

		for (int i = 0; i < contentFromFile.size(); i++) {
			String[] words = contentFromFile.get(i).split(" ");

			for (String word : words) {
				if (word.matches("\\w+") && !uniqueWords.contains(word)) {
					uniqueWords.add(word);
				}
			}
		}
		System.out.println("\nUnique words: " + uniqueWords.size());
	}

	public void howManySentences() {

		
	}

	public void howManyLetters() {

	}

	public void howManyCharacters() {

	}

	public void howManyTimesLetterRepeats() {

	}

}

import java.util.ArrayList;

public class MethodsForFileDatas {
	ArrayList<String> contentFromFile = new ArrayList<>();

	/* constructor */
	public MethodsForFileDatas(ArrayList<String> contentFromFile2) {
		this.contentFromFile = contentFromFile2;
	}

	/* method counts words in file */
	public void howManyWords() {

		int number = 0;

		for (int i = 0; i < contentFromFile.size(); i++) {
			String[] words = contentFromFile.get(i).split("[ ,.!?-_()+~]");

			for (String word : words) {
				if (word.matches("\\w+")) {
					number++;
				}
			}
		}

		System.out.println("\nWords in file: " + number);
	}

	/* method counts unique words */
	public void howManyUniqueWords() {

		ArrayList<String> uniqueWords = new ArrayList<>();

		for (int i = 0; i < contentFromFile.size(); i++) {
			String[] words = contentFromFile.get(i).split("[ ,.!?-_()+~]");

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
		int characterCounter = 0;
		
		for(int i = 0;i<contentFromFile.size();i++){
			for(int j = 0;j<contentFromFile.get(i).length();j++){
				characterCounter++;
			}
		}
		
		System.out.printf("\nNumber of characters: %d \n",characterCounter);
		
	}

	public void howManyTimesLetterRepeats() {
		int[] characters = new int[26];
		
		for(int i = 0;i<contentFromFile.size();i++){
			for(int j = 0;j<contentFromFile.get(i).length();j++){
				if(Character.isLetter(contentFromFile.get(i).charAt(j))){
					characters[Character.toLowerCase(contentFromFile.get(i).charAt(j))-97]+=1;
							
				}
			}
		}
		System.out.println("\nOccurence of letters: ");
		System.out.println("-----------------------");
		for(int i = 0;i<characters.length;i++){
			System.out.printf("%s occured %d times.\n",(char)(i + 97),characters[i]);
		}
	}

}

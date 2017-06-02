
public class CharacterAndSentencesInFile {

	String text;

	/* constructor */
	public CharacterAndSentencesInFile(String tekst) {
		this.text = tekst;
	}

	/* method counts characters in file */
	public void howManyCharacters() {

		System.out.printf("\nNumber of characters: %d \n", text.length());
	}

	/* method counts letters in file */
	public void howManyLetters() {
		int numLetters = 0;
		for (int i = 0; i < text.length(); i++) {

			if (Character.isLetter(text.charAt(i))) {
				numLetters++;
			}
		}
		System.out.println("\nNumber of letters: " + numLetters);
	}

	/* method counts how many times letter repeats in file */
	public void howManyTimesLetterRepeats() {

		int[] characters = new int[26];

		for (int i = 0; i < text.length(); i++) {

			if (Character.isLetter(text.charAt(i))) {
				characters[Character.toLowerCase(text.charAt(i)) - 97]++;
			}
		}
		System.out.println("\nOccurence of letters: ");
		System.out.println("-----------------------");
		for (int i = 0; i < characters.length; i++) {
			System.out.printf("%s occured %d times.\n", (char) (i + 97), characters[i]);
		}
	}

}

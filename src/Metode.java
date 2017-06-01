package testneKlase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JasminaKarakteristikeFajla {

	public static void main(String[] args) {
		String wholeText;
		//Kreiramo File i Scanner objekat za citanje
		File file = new File("nightfall.txt");
		try {
			Scanner input = new Scanner(file);
			
			//Ucitavanje podataka u string
			StringBuilder build=new StringBuilder();
			StringBuffer buff=new StringBuffer(build);
			
			while(input.hasNext()){
				buff.append(input.nextLine());
			}
			
			//Dodijelimo zbog preglednosti cijeli tekst u string
			wholeText=buff.toString();
			
			System.out.println(wholeText);
			
		} catch (FileNotFoundException e) {
			System.out.println("File ne postoji!");
		}
		
		
		
		

	}

	// Metoda za broj rijeci u file-u
	public static int brojRijeci() {
		return 1;
	}
  public static int brojSlova() {
		return 1;
	}
  }

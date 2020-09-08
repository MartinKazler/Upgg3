  
package main;

import java.util.*;

public class hangman {
	private static Scanner Select = new Scanner(System.in);
	public static Integer Tries = 0;
	static boolean win = true;
	public void Game() {
		ProgHang.W = new char[ProgHang.ValOrd.length()];
		for (int i = 0; i < ProgHang.W.length; i++) {
			ProgHang.W[i] = '_';
		}
	}
	public void Gissa(String letter) {
		if (!ProgHang.ValOrd.contains(letter)) {
			Tries++;
		}
		if (ProgHang.ValOrd.contains(letter)) {
			int index = ProgHang.ValOrd.indexOf(letter);
			while (index >= 0) {
				ProgHang.W[index] = letter.charAt(0);
				index = ProgHang.ValOrd.indexOf(letter, index + 1);
			}
		}
	}
	private Object Finns() {
		StringBuilder Index2 = new StringBuilder();
		for (int i = 0; i < ProgHang.W.length; i++) {
			Index2.append(ProgHang.W[i]);
			if (i < ProgHang.W.length - 1) {
				Index2.append(" ");
			}
		}
		return Index2.toString();
	}
	public void Spel() {

		String X = Select.next().toLowerCase();
		if (X.length() > 1) {
			X = X.substring(0, 1);
		}
		Gissa(X);
	}
	public void HelaOrd() {
		String XY = Select.next().toLowerCase();
		if (!ProgHang.ValOrd.contains(XY)) {			
			System.out.println(ProgHang.hanger());
			System.out.println("Sorry you guessed the wrong word, you lose!\n the word was " + ProgHang.ValOrd);
			win = false;
		} else if (ProgHang.ValOrd.contains(XY)) {
			System.out.println("Congratulations You win!");
			win = false;
		}
	}
	public static void main(String[] args) {
		ProgHang ClassX = new ProgHang();
		hangman hangman = new hangman();
		hangman.Game();
		ClassX.Draw();		
		System.out.println("Welcome to Hangman Phone Brands, Its between top ten brands, but we all know Samsung is #1");
		while (win) {
			String YesWin = new String(ProgHang.W).toString();
			int GissningarKvar = ProgHang.MAXTries - Tries;			
			System.out.println(
					"\nSelect a game option:\n 1.To guess a letter:\n 2.Guess the whole word:\n 3.Game status:");
				if(Select.hasNextInt())				
				{
				int Val = Integer.parseInt(Select.next());			
				switch (Val) {
				case 1:
					hangman.Spel();
					System.out.println("\n Current progress:" + hangman.Finns());
					System.out.println(ProgHang.WX.get(Tries));
					break;
				case 2:
					System.out.println("\n If you guess wrong its GAME OVER!" + "\n:");
					hangman.HelaOrd();
					break;
				case 3:
					System.out.println("You have guessed wrong " + Tries + " Times! " + "\n You have " + GissningarKvar + " Attempts left!");
					break;
				}
				}
				else{
					System.out.println("choose between 1,2,3!");
					Select.next();					
				}
			
			if (Tries >= 10) {
				System.out.println("You lose!\n The word was " + ProgHang.ValOrd);
				win = false;				
			}
			if(YesWin.equals(ProgHang.ValOrd)) {				
				win = false;
			}
		}
	}
}
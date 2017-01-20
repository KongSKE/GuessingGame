package oop2;
import java.util.Scanner;
public class GameConsole {
	public int play(GuessingGame game){
		System.out.println("Guessing Game");
		System.out.println("Your guess");
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.println(game.getHint());
			num=sc.nextInt();
		}while(!game.guess(num));
			return num;
	}
	/*
	 * it is the main method to run the game.
	 */
	public static void main(String []args){
		
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
		
	}
}

package oop2;
import java.util.Random;//for random number
/**
	* Game of guessing a secret number.-- write a description here
	* @author Varit Assavavidsidchai
	*/

import java.util.Scanner;
public class GuessingGame {
	/*properties of a guessing game*/
	private int upperbound;
	private int secret;
	private String hint;
	private int count=0;
	
	/*
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number
	 * @return a random between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random( seed );
		return rand.nextInt(limit) + 1;
	}
	
	/*Initialize a new game.
	 * @parameter upperbound is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperbound){
		this.upperbound=upperbound;
		this.secret=getRandomNumber(20);
		this.hint="I'm thinking of a number between 1 and "+upperbound;
		
	}
	/*check input number.If it equals secret number. then it's ture. if not then it's false.
	 *@parameter number for check correct or not correct. 
	 */
	public boolean guess(int number ){
		if(number==secret){
			count++;
			System.out.println("Correct "+count);
			return true;
		}else{
			if(number>secret){
				this.hint = "Sorry,your guess is too large";count++;
			}else{
				this.hint = "Sorry,your guess is too small";count++;
			}
		}
		return false;
	}
	/*
	 * for when input numbers is not correct then It will show the hint.
	 */
	public void setHint(){
		this.hint=hint;
	}
	/*
	 * REturn a hint based on the most recent guess.
	 * @return hint based on most recent guess.
	 */
	public String getHint(){
		return this.hint;
	}
	/*
	 * for count the Round that we play for win.
	 */
	public int getCount(){
		return count;
	
	}
}


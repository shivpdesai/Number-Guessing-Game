package guessinggame;
//Java Game "Guess the Number" that allows a user to guess a 
//random number that has been generated.
import javax.swing.*;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNumber = (int)(Math.random()*100+1);
		int userAnswer = 0;
		int count = 1;
		while (userAnswer != computerNumber) {
			String response = JOptionPane.showInputDialog(null, 
					"Enter a guess between 1 and 100", "Guessing Game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber
					,count));
			count++;
		}

	}

	private static String determineGuess(int userAnswer, int computerNumber, int count) {
		// TODO Auto-generated method stub
		if(userAnswer<=0 || userAnswer > 100) {
			return "Your Guess is Invalid";
		}
		else if (userAnswer == computerNumber)
		{
			return "Correct!\n Total Guesses: " + count;
		}
		else if (userAnswer > computerNumber) {
			return "Your guess is too high, try again. \n Try Number: " + count;
		}
		else if (userAnswer < computerNumber) {
			return "Your guess is to low, try again. \n Try Number: " + count;
		}
		else {
			return "Your guess is incorrect\n Try Number: " + count;
		}
	}

}

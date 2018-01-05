package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String word=JOptionPane.showInputDialog("Who walks on 4 legs in the morning, 2 at noon, and 3 in the evening?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("a person")) {
			score++;
		}
			
		// 4.  if the user's answer is correct
		word=JOptionPane.showInputDialog("Many have heard me, but no one has seen me.  I will not speak back until spoken to.  Who am I?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("an echo")) {
			score++;
		}
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		word=JOptionPane.showInputDialog("This person is billionare, a genius, and he donates a lot to charity.")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("Bill Gates")) {
			score++;
		}
		word=JOptionPane.showInputDialog("This five letter word becomes shorter when you add two letters to it.  What is the word?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("short")) {
			score++;
		}
		word=JOptionPane.showInputDialog("What has a mouth but never eats? Has a bed but never sleeps. Has banks but no money?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("a river")) {
			score++;
		}
		word=JOptionPane.showInputDialog("10 fish are in a tank. 2 drown, 4 swim away, 3 die. How many are left?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("10")) {
			score++;
		}
		word=JOptionPane.showInputDialog("I'm more powerful than God, more evil than the devil, the poor have me, the rich need me. If you eat me you'll die. What am I?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("nothing")) {
			score++;
		}
		word=JOptionPane.showInputDialog("What's black when you get it, red when you use it, and white when you're all through with it?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("charcoal")) {
			score++;
		}
		word=JOptionPane.showInputDialog("Ripped from my mothers womb, beaten and burned, I became a blood thirsty killer. What am I?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("iron ore")) {
			score++;
		}
		word=JOptionPane.showInputDialog("I am always hungry, I must always be fed, The finger I touch will soon turn red?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("fire")) {
			score++;
		}
		word=JOptionPane.showInputDialog("What word looks the same upside down and backwards?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("swims")) {
			score++;
		}
		word=JOptionPane.showInputDialog("There was a plane crash every single person died. Who survived?")	;
		// 3.  Use an if statement to check if their answer is correct
		if(word.equals("married couples")) {
			score++;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}
}

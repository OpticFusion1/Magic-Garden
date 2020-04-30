/**
 * Game: Magic Garden
 * Producer: Vast-Horizon
 * completion date: April_30th_2020
 * 
 * A simple java text-based adventure game, should take
 * Estimated pass time is 2 minutes
 * 
 * Github link: https://github.com/Vast-Horizon/Magic-Garden              :)
 * **/

import java.util.Scanner;

import javax.swing.JOptionPane;
public class Game {
	
	

	public static void main(String[] args) 
	{
	
		String mess_1 = "Your goal is to get out of here and keep alive";
		String mess_2 = "There are both happy&sad ending of this game, enjoy!";
		
		
		JOptionPane.showMessageDialog(null, "----------Magic Garden---------","Welcome, adventurer",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "You come to an unknown garden","Welcome, adventurer",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "You remember you came from the WEST, but the road to the west disappeared","Welcome, adventurer",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mess_1 +"\r\n"+ mess_2,"Welcome, adventurer",JOptionPane.INFORMATION_MESSAGE);
	

		Game.theGame(); //Start the first stage of the game
		

	}
	
	
	
	
	public static void theGame() // first game stage method. 
	//Note: the whole gaming process should follows the order of Introduction--> theGame-->theGame3-->theGame2-->theGame4-->Ending
	{
		
		Object[] options = {"North", "South", "East"}; //create the options array, these texts will show up on the dialog buttons
		int choiceF = JOptionPane.showOptionDialog(null,"Which way would you like to go now? ", "Make a Decision",
						JOptionPane.YES_NO_CANCEL_OPTION, //option type: yes_no_cancel
						JOptionPane.QUESTION_MESSAGE,     //dialog type is Question
						null,options,options[2]); //null indicates no frame has been pointed.    options[2]: the 0, 1st, 2ed elements in the array options.
		


		

		
		if (choiceF == 0) //Use "if-else if" to deal with different choices
		{
			JOptionPane.showMessageDialog(null, "---You encounter a monster---",  "Warning", JOptionPane.WARNING_MESSAGE); //dialog type is Warning
			
			Object[] option_2 = {"Run away", "Try to kill it"};
			int choiceS = JOptionPane.showOptionDialog(null,"What would you do", "Make a Decision",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,option_2,option_2[1]); //options[1]: the 0, 1st, elements in the array options.



			if (choiceS == 0) 
			{
				JOptionPane.showMessageDialog(null, "You run back to the beginning point","Fortunately",JOptionPane.INFORMATION_MESSAGE);//dialog type is Information
				theGame();//restart the first game stage method
			}
			else if (choiceS == 1) 
			{
				JOptionPane.showMessageDialog(null, "OMG, you get killed",  "Warning", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Game over",  "Lose", JOptionPane.WARNING_MESSAGE); // Game over
			}

		}
		
		else if (choiceF == 1) 
		{
			
			Object[] option_3 = {"Eat it", "Take it"};
			int choiceT = JOptionPane.showOptionDialog(null,"You find a golden apple", "Make a Decision",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,option_3,option_3[1]);
			
			
			if (choiceT == 0) 
			{
				
				JOptionPane.showMessageDialog(null, "You are poisoned",  "Warning", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Game over",  "Warning", JOptionPane.WARNING_MESSAGE);
			
	
			}
			else if (choiceT == 1) 
			{
				JOptionPane.showMessageDialog(null, "You get the fruit"," ",JOptionPane.INFORMATION_MESSAGE);

				
				
				theGame3();
				
			}
		}
		
		else if (choiceF == 2) 
		{

			Object[] conObj1 = {"Continue"};
			int con1 = JOptionPane.showOptionDialog(null,"---You encounter a strange wizard---", " ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj1 ,conObj1 [0]);
			
			
			int con2 = JOptionPane.showOptionDialog(null,"Where is my golden apple, that is my magic weapon!!", "Wizard",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj1,conObj1[0]);
			
			
			
			Object[] option_4 = {"Try to kill the wizard","Yes, go this way and go toward SOUTH, then you can find the apple","No, I have no idea what you are talking about"};
			int choiceFo = JOptionPane.showOptionDialog(null,"Hey! Stranger, did you see my golden apple?", "Wizard",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,option_4,option_4[2]);

		
			
			if ((choiceFo == 0)) 
			{
				JOptionPane.showMessageDialog(null, "The wizard zap you and you died"," ",JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Game over",  "Warning", JOptionPane.WARNING_MESSAGE);
				
	
			}
			else if (choiceFo == 1) 
			{
				Object[] conObj2 = {"Continue"};
				int con3 = JOptionPane.showOptionDialog(null,"NO !!!!", "Wizard ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
						null,conObj2 ,conObj2 [0]);
				int con4 = JOptionPane.showOptionDialog(null,"You lied, I can tell you have never been to south", "Wizard ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
						null,conObj2 ,conObj2 [0]);
				JOptionPane.showMessageDialog(null, "You are curious about the south, and you leave"," ",JOptionPane.INFORMATION_MESSAGE);
				theGame();
;
		
	
			}
			else if (choiceFo == 2) 
			
			{
		
				JOptionPane.showMessageDialog(null, " You are a good man, I can see you really don't know","Wizard",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, " (The strange wizard vanish)"," ",JOptionPane.INFORMATION_MESSAGE);

				theGame();
			}
			
		}

				
			
			
	}
	
	public static void theGame2() //The second stage method. Try to Crack the mystery
	{
		
		
		Object[] option_5 = {"Go left", "Go right"};
		int choiceF = JOptionPane.showOptionDialog(null,"Which way would you like to go now? ", "Make a Decision",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,option_5,option_5[1]);

		

		
		if (choiceF == 0) 
		{

			Object[] option_6 = {"Take it", "Open it"};
			int choiceS = JOptionPane.showOptionDialog(null,"You find a stone box ", "Make a Decision",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,option_6,option_6[1]);
			
	
			if (choiceS == 1) 
				
			{
				
				
				String pass = JOptionPane.showInputDialog("Please enter the password:");
				
				if ( pass.equals("2020"))
				{
		
					
					JOptionPane.showMessageDialog(null, " You get a sword"," Oh ",JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Suddenly!",  "Warning", JOptionPane.WARNING_MESSAGE);
				
			
					theGame4();
				}
				else 
				{
					
					JOptionPane.showMessageDialog(null, "Oops, you can't open it",  "Wrong passward", JOptionPane.WARNING_MESSAGE);
					
					theGame2();
				}

			}
			else 
			{
		
				JOptionPane.showMessageDialog(null, "The box is too heavy to take away",  "huh", JOptionPane.WARNING_MESSAGE);
				theGame2();

			}

		}
		
		
		else if (choiceF == 1) 
		{
			JOptionPane.showMessageDialog(null, " ---You find a mysterious stele---"," ??? ",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "The person who knows the answer to this question is a genius","On the Stele ",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Where are you from?","On the Stele ",JOptionPane.INFORMATION_MESSAGE);
	
			String answer = JOptionPane.showInputDialog("Type what you want to answer to the stele:");
			
			
			if (answer.equals("west")||answer.equals("WEST")||answer.equals("West")) 
			{
				JOptionPane.showMessageDialog(null, "A string of strange numbers appeared on the stone tablet", " ",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "---2 0 2 0---", " ",JOptionPane.WARNING_MESSAGE);

				
				
				theGame2(); 

	
			}
			else
			{
				
				JOptionPane.showMessageDialog(null, "There is no response from the stele", " ",JOptionPane.INFORMATION_MESSAGE);
				theGame2();
	
			}
		}
		
		
	}
	
		
	
		
	
	
	
	
	public static void theGame3() //The second stage method, knows the wizard may help you out
	{
		
		
		Object[] conObj2 = {"Continue"};
		int con3 = JOptionPane.showOptionDialog(null,"---You encounter a strange wizard---", " ? ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null,conObj2 ,conObj2 [0]);
		int con4 = JOptionPane.showOptionDialog(null,"Hey, that's my golden apple!", "Wizard ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null,conObj2 ,conObj2 [0]);
		JOptionPane.showMessageDialog(null, "(You give the apple to him)"," ",JOptionPane.INFORMATION_MESSAGE);
		
		int con5 = JOptionPane.showOptionDialog(null,"You are really nice, what's your name?", "Wizard ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null,conObj2 ,conObj2 [0]);
		
		String name = JOptionPane.showInputDialog("Type your name here:");
		
		JOptionPane.showMessageDialog(null,"Great, "+ name + " . Seem you get lost, I can help you get out of here as long as you prove your courage "," ",JOptionPane.INFORMATION_MESSAGE);
	
		JOptionPane.showMessageDialog(null, "(The Wizard vanish)"," ",JOptionPane.INFORMATION_MESSAGE);
		
		theGame2();
		
		
	}
	
	
	public static void theGame4()  //The final stage method, choose to kill the monster or not. happy/sad ending
	
	{
	    Scanner sc = new Scanner(System.in);

		
		Object[] options = {"1.Try to kill it", "2.Run away"};
		int choiceS = JOptionPane.showOptionDialog(null,"You encounter a monster ", "Make a Decision",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null,options,options[1]);

		   
		
			
		if (choiceS == 0) 
			{
			
			Object[] conObj2 = {"Continue"};
			Object[] conObj3 = {"Thank you"};
			int con1 = JOptionPane.showOptionDialog(null,"You killed the monster with the sword", " ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj2 ,conObj2 [0]);
			int con2 = JOptionPane.showOptionDialog(null,"(The Wizard appear)"+"\r\n"+" Wonderful, You not just find my apple but also kill the monster", "Wizard ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj2 ,conObj2 [0]);
			int con3 = JOptionPane.showOptionDialog(null,"You are so brave, let me help you leave this magic garden in return for that"+"\r\n"+"Glad to meet you", "Wizard ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj2 ,conObj2 [0]);
			int con4 = JOptionPane.showOptionDialog(null,"The Wizard helps you out", "Great! ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj2 ,conObj2 [0]);
			
			int con5 = JOptionPane.showOptionDialog(null,"-----HAPPY ENDING------", "Great! ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj3 ,conObj3 [0]);
			int con6 = JOptionPane.showOptionDialog(null,"Game Producer: Vast-Horizon"+"\r\n"+"\r\n"+"----------Magic Garden---------", " ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null,conObj3 ,conObj3 [0]);
		
			
			}
		else if (choiceS == 1) 
			{
				
			    Object[] conObj3 = {"Thank you"};
			    
				JOptionPane.showMessageDialog(null, "You flinch, the monster catches up and eats you including the sorwd that you are carry on",  "Warning", JOptionPane.WARNING_MESSAGE);
		
				JOptionPane.showMessageDialog(null, "The monster's stomach was pierced, also died"+"\r\n"+"\r\n"+"               -----SAD ENDING-----",  "Not Bad!", JOptionPane.WARNING_MESSAGE);
				
				int con7 = JOptionPane.showOptionDialog(null,"Game Producer: Vast-Horizon"+"\r\n"+"\r\n"+"----------Magic Garden---------", " ",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
						null,conObj3 ,conObj3 [0]);
			
				

			
				
			}

		
		

		
	}
	
	
}


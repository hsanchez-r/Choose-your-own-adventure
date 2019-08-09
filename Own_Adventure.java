package myownpractice1;

import javax.swing.JOptionPane;

public class Own_Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		String question1 = JOptionPane.showInputDialog("Your are in a creepy house! Would youu like to go \"upstairs\" or into the \"kitchen\"?");
		
		if(question1.equalsIgnoreCase("kitchen")) {
			
			String question2 = JOptionPane.showInputDialog("There is a long countertop with dirty dishes everywhere. \nOff the one side there is, as you'd expect, a refrigerator. \nYou may open the \"refrigerator\" or look in a \"cabinet\"");
			
			if(question2.equalsIgnoreCase("refrigerator")) {
				
				System.out.println(question2);
				
				String question3 = JOptionPane.showInputDialog("\nInside the refrigerator you see food and stuff. It look pretty nasty. \nWould you like to eat some of the food? (\"yes\" or \"no\")");
				
				if(question3.equalsIgnoreCase("yes")) {
					
					System.out.println(question3);
					
					System.out.println("\nYou will survive no matter what");
					
				} else {
					
					System.out.println(question3);
					
					System.out.println("\nYou will die of starvation");
					
				}
				
			} else {
				
				System.out.println(question2);
				
				String question3 = JOptionPane.showInputDialog("\nInside the cabinet you see food and stuff. It look pretty nasty. \nWould you like to eat some of the food? (\"yes\" or \"no\")");
				
				if(question3.equalsIgnoreCase("yes")) {
					
					System.out.println(question3);
					
					System.out.println("\nYou will survive no matter what");
					
				} else {
					
					System.out.println(question3);
					
					System.out.println("\nYou will die of starvation");
					
				}
			}
		} else {
			
			if(question1.equalsIgnoreCase("upstairs")) {
				
				String question4 = JOptionPane.showInputDialog("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the halfway. Where would you like to go?");
				
				if(question4.equalsIgnoreCase("bedroom")) {
					
					System.out.println(question4);
					
					String question5 = JOptionPane.showInputDialog("\nYou are in a plush bedroom, with expensive furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
					
					if(question5.equalsIgnoreCase("yes")) {
						
						System.out.println(question5);
						
						System.out.println("\nBravo! You found out what's inside");
						
					} else {
						
						System.out.println(question5);
						
						System.out.println("\nWell, then I guess you'll never know what was in there");
						
					}
				} else {
					
					System.out.println(question4);
					
					String question5 = JOptionPane.showInputDialog("\nYou are in a plush bathroom, with expensive furniture. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
					
					if(question5.equalsIgnoreCase("yes")) {
						
						System.out.println(question5);
						
						System.out.println("\nBravo! You found out what's inside");
				} else {
					
					System.out.println(question5);
					
					System.out.println("\nWell, then I guess you'll never know what was in there");
					
				}
				
			}
			
		}

	}

}
}	

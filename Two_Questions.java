package myownpractice1;

import javax.swing.JOptionPane;

public class Two_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String answer = "";
		
		String q1 = JOptionPane.showInputDialog("Is it animal, vegetable, or mineral?");
		
		String q2 = JOptionPane.showInputDialog("Is it bigger than a breadbox?");
		
		if(q1.equalsIgnoreCase("animal")) {
			
			System.out.println("Question 1) Is it animal, vegetable, or mineral?" + "\n" + q1);
			
			if(q2.equalsIgnoreCase("yes")) {
				
				System.out.println("Question 2) Is it bigger than a breadbox?" + "\n" + q2);
				
				answer = "moose";
				
				System.out.println("My guess is that you are thinking of a " + answer);
				
			} else {
				
				System.out.println("Question 2) Is it bigger than a breadbox?" + "\n" + q2);
				
				answer = "squirrel";
				
				System.out.println("My guess is that you are thinking of a " + answer);
				
				
			}
			
		}
		
		if(q1.equalsIgnoreCase("mineral")) {
			
			System.out.println("Question 1) Is it animal, vegetable, or mineral?" + "\n" + q1);
			
			if(q2.equalsIgnoreCase("yes")) {
				
				System.out.println("Question 2) Is it bigger than a breadbox?" + "\n" + q2);
				
				answer = "Camaro";
				
				System.out.println("My guess is that you are thinking of a " + answer);
				
			} else {
				
				System.out.println("Question 2) Is it bigger than a breadbox?" + "\n" + q2);
				
				answer = "paper clip";
				
				System.out.println("My guess is that you are thinking of a " + answer);
				
				
			}
			
		}
		
		if(q1.equalsIgnoreCase("vegetable")) {
			
			System.out.println("Question 1) Is it animal, vegetable, or mineral?" + "\n" + q1);
			
			if(q2.equalsIgnoreCase("yes")) {
				
				System.out.println("Question 2) Is it bigger than a breadbox?" + "\n" + q2);
				
				answer = "watermelon";
				
				System.out.println("My guess is that you are thinking of a " + answer);
				
			} else {
				
				System.out.println("Question 2) Is it bigger than a breadbox?" + "\n" + q2);
				
				answer = "carrot";
				
				System.out.println("My guess is that you are thinking of a " + answer);
				
				
			}
			
		}



	}

}


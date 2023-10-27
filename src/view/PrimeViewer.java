package view;

import java.util.Scanner;

import controller.PrimeController;

public class PrimeViewer {
	private int start = 0;
	private int finish = 0;
	
	// Prompts user to enter two positive numbers (start & finish)
	public void viewer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to prime numbers calculator. You can find prime numbers between two numbers as long as they are positive.\nStart with the lower number.");
		System.out.println("Choose a first number:");
		try {
			setStart(scan.nextInt());
			System.out.println("Choose a second number:");
			setFinish(scan.nextInt());
			
		} catch (Exception e) {
			System.out.println("It must be numbers");
		}
		
	}
	
	public int getStart() {
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getFinish() {
		return finish;
	}
	
	public void setFinish(int finish) {
		this.finish = finish;
	}

}

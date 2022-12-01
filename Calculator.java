package edu.frostburg.cosc240;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		accumulate(in);
		add(in);
	}
	
	/**
	 * Adds a bunch of numbers together until user types -1
	 * 
	 * @param in Scanner for keyboard input.
	 */
	public static void accumulate(Scanner in) {
		int sum = 0;
		boolean go = true;

		while(go) {
			int userNum = in.nextInt();
			if(userNum == -1) {
				go = false;
			}else if(userNum < 0){
				System.err.println("Can't do that!");
			}else {
			}
				sum = sum + userNum;
			}
		}
		
		
		
		System.out.println(sum);
	}
	
	public static void add(Scanner in) {
		
	}

}

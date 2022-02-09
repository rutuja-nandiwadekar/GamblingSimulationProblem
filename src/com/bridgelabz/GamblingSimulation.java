package com.bridgelabz;

public class GamblingSimulation {
	//initialization
	public static int STAKE = 100;
	public static int BET = 1;
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem");
		winOrloose(); //calling method
	}

	public static void winOrloose() {
		//initialization
		int check = (int) Math.floor((Math.random() * 10) % 2);
		if (check == 0) {
			STAKE++;
			System.out.println("Gambler won");
		} else {
			STAKE--;
			System.out.println("Gambler loose");
		}
	}
}
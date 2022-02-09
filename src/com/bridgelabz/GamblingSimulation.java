package com.bridgelabz;

public class GamblingSimulation {

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem");
		winOrloose();
	}

	public static void winOrloose() {
		int STAKE = 100;
		int BET = 1;

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
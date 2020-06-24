package com.demo.programmes;

public class Trainberths {

	public static void getberthnumber(int seat) {

		if (seat > 0 && seat <= 72) {
			if (seat % 8 == 1 || seat % 8 == 4) {
				System.out.println("seat at  lower");

			}

			else if (seat % 8 == 2 || seat % 8 == 5) {
				System.out.println("seat at  middle");

			}

			else if (seat % 8 == 3 || seat % 8 == 6) {
				System.out.println("seat at  upper");

			}

			else if (seat % 8 == 7) {
				System.out.println("seat at  lower side");

			}

			else {
				System.out.println("seat at  upper side");

			}

		}

		else
			System.out.println("no seat in train ");

	}

	public static void main(String[] args) {

		getberthnumber(48);

	}

}

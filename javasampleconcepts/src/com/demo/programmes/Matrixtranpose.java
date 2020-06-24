package com.demo.programmes;

import java.util.Scanner;

public class Matrixtranpose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int matrix[][]=new int[10][10];

		System.out.println("enter matrix row size and column size");

		int row = sc.nextInt();
		int col = sc.nextInt();

		System.out.println("enter matraix values");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();

				System.out.print(" ");
			}

			System.out.println();
		}

		System.out.println("printing matrix values");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}

			System.out.println();
		}

		int trasposematix[][] = new int[10][10];

		System.out.println("traspose  matrix is");

		for (int i = 0; i < col; i++) {

			for (int j = 0; j < row; j++) {
				trasposematix[j][i] = matrix[i][j];
			}

		}

		System.out.println("printing matrix  after traspose values");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(trasposematix[i][j]);
				System.out.print(" ");
			}

			System.out.println();
		}

	}

}

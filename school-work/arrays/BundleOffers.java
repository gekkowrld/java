/**
 * This is a program that accepts user choice
 * and assign the associated cost to a variable
 */

import java.util.Scanner;

 class BundleOffers{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.println("Choice \t\tBundle type");

		String data[][] = {{"99", "500"}, {"50", "150"}, {"20", "50"}, {"10", "15"}, {"5", "7"}};

		for (int i = 0; i < data.length; i++){
			System.out.print((i+1) + "\t\t");
			for (int j = 0; j < data[i].length; j++){
				if (data[i][j] == data[i][0]){
					System.out.print("Ksh." + data[i][j] + "\t\t");
				}else if( data[i][j] == data[i][1]){
					System.out.print(data[i][j] + "MB\t\t");
				}else{
					System.out.print(data[i][j] + "\t\t");
				}
			}
			System.out.println();
		}

		System.out.println("Enter the choice: ");
		int choice = input.nextInt();

		if (choice == 0){
			input.close();
			return;
		}

		for (int i = 0; i < data.length; i++){
			if ((i + 1) == choice){
				System.out.println("You have received " +data[i][0] + " MB for Ksh " + data[i][1]);
			}
		}

		input.close();
	}
 }

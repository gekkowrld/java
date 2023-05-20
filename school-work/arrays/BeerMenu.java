/**
 * This is a program that prints out a menu
 * it then asks a user for the choice number
 * It calculate the cost and returns the cost
 * The program only expects two columns, i.e
 * Beer Brand and Price column. If you change it
 * then make sure that the first two are in place
 */

 import java.util.Scanner;;

 class BeerMenu{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.println("**** Jamal and Daughters Pub ****");
		System.out.println("Beer Brand \t\t Price");
		System.out.println("-------------------------------");
		String commodity[][] = {{"Tusker", "100",}, {"Pilsner", "120"}, {"Smirnoff Ice", "140"}, {"White Cap", "90"}};

		for(int i = 0; i < commodity.length; i++){
			System.out.print((i+1) + ") ");
			for(int j = 0; j < commodity[i].length; j++){
				if (j == (commodity[commodity.length -1 ].length) -1){
					System.out.print(commodity[i][j] + "/=");
				}else{
					System.out.print(commodity[i][j] + "\t\t");
				}

			}
			System.out.println();
		}

		System.out.print("Enter your choice: ");
		int choice = input.nextInt();

		for(int i = 0; i < commodity.length; i++){
			if((i + 1) == choice){
				System.out.print("How many bottles of " + commodity[i][0].toLowerCase() + " do you want? ");
				int bottles = input.nextInt();

				int price = bottles * Integer.parseInt(commodity[i][1]);

				System.out.println(bottles + " bottles of " + commodity[i][0].toLowerCase() + " will cost you Kshs. " + price);
			}
		}

		if (choice < 1 || choice > commodity.length){
			System.out.println("Choice " + choice + " isn't available");
		}

		input.close();
	}
 }

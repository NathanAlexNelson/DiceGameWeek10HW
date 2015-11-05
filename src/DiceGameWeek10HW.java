import java.util.Scanner;


public class DiceGameWeek10HW {
	int Dice = 0;
	int X;
	int Y;
	int Amount;
	int roll;
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many six sided dice would you like to roll? 1 - 3");
	Amount = input.nextInt();
	
	DiceRolls Rolling = new DiceRolls(Amount);
	
	roll = Rolling.DiceNum();
	
	
	
	if (Dice == 1) {
	System.out.println("What number would you like to guess?");
	X = input.nextInt();
	
	if ((X > 6) || (X < 1)){
	System.out.println("Please insert a number between 1 and 6");
	}
	else if (X == roll){
		System.out.println("You have chosen the correct amount!");
	}
	else if (X < roll){
		System.out.println("You have guessed to low!");
}
	else if (X > roll){
		System.out.println("You have guessed to high!");
	}	
	
	
	
	else if (Dice == 2){
		System.out.println("What number would you like to guess?");
		X = input.nextInt();
		if ((X > 12) || (X < 1)){
			System.out.println("Please insert a number between 1 and 12");
			}	
		else if (X == roll){
			System.out.println("You have chosen the correct amount!");
		}
		else if (X < roll){
			System.out.println("You have guessed to low!");
	}
		else if (X > roll){
			System.out.println("You have guessed to high!");
	}
		
		
	else if (Dice == 3){
		System.out.println("What number would you like to guess?");
		X = input.nextInt();
		if ((X > 18) || (X < 1)){
			System.out.println("Please insert a number between 1 and 18");
			}
		else if (X == roll){
			System.out.println("You have chosen the correct amount!");
		}
		else if (X < roll){
			System.out.println("You have guessed to low!");
	}
		else if (X > roll){
			System.out.println("You have guessed to high!");
		}

		}
}
	else{
		System.out.println("You have chosen an invalid number.");
}
	}
}
}
ssimport java.text.DecimalFormat;
import java.util.Scanner;

public class CordWeight {

	public static void main(String[] args) {
		final double LessThan10 = 2.3;
		final double TenFooter = 3.4;
		final double FifteenFooter = 3.4;
		final double TwentyFooter = 4.8;
		final double TwentyFiveFooter = 5.0;
		final double FortyFooter = 9.8;
		final double FiftyFooter = 9.9;
		int amountLess10 = 0;
		int amount10 = 0;
		int amount15 = 0;
		int amount20 = 0;
		int amount25 = 0;
		int amount40 = 0;
		int amount50 = 0;
		double weightLess10 = 0;
		double weight10 = 0;
		double weight15 = 0;
		double weight20 = 0;
		double weight25 = 0;
		double weight40 = 0;
		double weight50 = 0;
		int userAnswer = 0;
		final int HALFBRICKWEIGHT = 18;
		final int BRICKWEIGHT = 32;

		DecimalFormat weightFormat = new DecimalFormat("0.0");

		Scanner myscanner = new Scanner(System.in);
		System.out.println(
				"Are there any extensions that are less than 10 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amountLess10 = myscanner.nextInt();
		}
		weightLess10 = amountLess10 * LessThan10;

		System.out.println("Are there any extensions that are 10 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount10 = myscanner.nextInt();
		}
		weight10 = amount10 * TenFooter;

		System.out.println("Are there any extensions that are 15 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount15 = myscanner.nextInt();
		}
		weight15 = amount15 * FifteenFooter;

		System.out.println("Are there any extensions that are 20 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount20 = myscanner.nextInt();
		}
		weight20 = amount20 * TwentyFooter;

		System.out.println("Are there any extensions that are 25 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount25 = myscanner.nextInt();
		}
		weight25 = amount25 * TwentyFiveFooter;

		System.out.println("Are there any extensions that are 40 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount40 = myscanner.nextInt();
		}
		weight40 = amount40 * FortyFooter;

		System.out.println("Are there any extensions that are 50 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount50 = myscanner.nextInt();
		}
		weight50 = amount50 * FiftyFooter;

		int TotalNumber = amountLess10 + amount10 + amount15 + amount20 + amount25 + amount40 + amount50;
		System.out.println("You have " + TotalNumber + " extensions.");

		double TotalWeight = weightLess10 + weight10 + weight15 + weight20 + weight25 + weight40 + weight50;
		System.out.println("Your total weight is: " + weightFormat.format(TotalWeight));

		int AmountOfBricks = (int) (TotalWeight / BRICKWEIGHT);
		System.out.println("The amount of bricks needed is " + AmountOfBricks);

		double LeftOverWeight = (TotalWeight % BRICKWEIGHT);

		int AmountOfHalfBricks = (int) (LeftOverWeight / HALFBRICKWEIGHT);

		if (TotalWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) >= 1.5) {
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		} else if (TotalWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) <= .358) {
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		}

		System.out.println("The amount of half bricks needed is " + AmountOfHalfBricks + "\r");

		if (TotalWeight <= 50 && TotalWeight >= 32) {
			System.out.println("\r" + "Only use this between 32-50 lbs: " + (TotalWeight - AmountOfBricks * 32));
		} else if (TotalWeight >= 18 && TotalWeight < 32) {
			System.out.println("\r" + "Only use this between 18-32 lbs: " + (TotalWeight - AmountOfHalfBricks * 18));
		}

	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {

		final int HALFBRICKWEIGHT = 18;
		final int BRICKWEIGHT = 32;
		final double ETCSOURCE4WEIGHT = 15.9;
		//final int BATTENWEIGHT = 88;
		final int PARCANWEIGHT = 3;
		final int CENTURY2212 = 16;
		final double ALTMAN3INCHFRESNELS = 2.2;
		final int CENTURY3480 = 17;
		//final double Scroller = 5.4;
		double TotalWeightETC;
		int TotalWeightParcan;
		int TotalWeightCENTURY2212;
		double TotalWeightALTMAN3INCHFRESNELS;
		int TotalWeightCENTURY3480;
		int AmountOfETC;
		int AmountOfPARCANS;
		int AmountOfCENTURY2212;
		int AmountOfALTMAN3INCHFRESNELS;
		int AmountOfCENTURY3480;
		double TotalFixtureWeight;
		int AmountOfBricks;
		int AmountOfHalfBricks;
		double LeftOverWeight;

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

		DecimalFormat weightFormat = new DecimalFormat("0.0");
		
		System.out.println(
				"This program is will assist you in determining how much counterweight is required over pipe for \n"
						+ "your lighting fixtures and cables on a batten used in the Montana Theatre \n"
						+ "Enter all amounts as WHOLE numbers (e.g. 7)\n");
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("\nHow many ETC Source 4's are attached to the batten?");
		AmountOfETC = myscanner.nextInt();

		System.out.println("How many PARCANS are attached to the batten?");
		AmountOfPARCANS = myscanner.nextInt();

		System.out.println("How many Century 2212's are attached to the batten?");
		AmountOfCENTURY2212 = myscanner.nextInt();

		System.out.println("How many Altman 3\" fresnels's are attached to the batten?");
		AmountOfALTMAN3INCHFRESNELS = myscanner.nextInt();

		System.out.println("How many Century 3480's are attached to the batten?");
		AmountOfCENTURY3480 = myscanner.nextInt();

		/*
		 * EXTENSIONS
		 */
		
		System.out.println(
				"\n" + "\n" + "Are there any extensions that are less than 10 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amountLess10 = myscanner.nextInt();
		}
		weightLess10 = amountLess10 * LessThan10;

		System.out.println("\n" + "Are there any extensions that are 10 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount10 = myscanner.nextInt();
		}
		weight10 = amount10 * TenFooter;

		System.out.println("\n" + "Are there any extensions that are 15 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount15 = myscanner.nextInt();
		}
		weight15 = amount15 * FifteenFooter;

		System.out.println("\n" + "Are there any extensions that are 20 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount20 = myscanner.nextInt();
		}
		weight20 = amount20 * TwentyFooter;

		System.out.println("\n" + "Are there any extensions that are 25 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount25 = myscanner.nextInt();
		}
		weight25 = amount25 * TwentyFiveFooter;

		System.out.println("\n" + "Are there any extensions that are 40 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount40 = myscanner.nextInt();
		}
		weight40 = amount40 * FortyFooter;

		System.out.println("\n" + "Are there any extensions that are 50 feet?" + "\n" + "Press 1 for yes and 2 for no. ");
		userAnswer = myscanner.nextInt();
		if (userAnswer == 1) {
			System.out.println("How many are there?");
			amount50 = myscanner.nextInt();
		}
		weight50 = amount50 * FiftyFooter;

		int TotalNumber = amountLess10 + amount10 + amount15 + amount20 + amount25 + amount40 + amount50;
		System.out.println("You have " + TotalNumber + " extensions.");

		double TotalWeight = weightLess10 + weight10 + weight15 + weight20 + weight25 + weight40 + weight50;
		//System.out.println("Your total weight is: " + weightFormat.format(TotalWeight));
		
		/*
		 *  MATHS
		 */
		
		TotalWeightETC = AmountOfETC * ETCSOURCE4WEIGHT;
		System.out.println("Your total ETC weight is " + TotalWeightETC + " pounds");

		TotalWeightParcan = AmountOfPARCANS * PARCANWEIGHT;
		System.out.println("Your total PARCAN weight is " + TotalWeightParcan + " pounds");

		TotalWeightCENTURY2212 = AmountOfCENTURY2212 * CENTURY2212;
		System.out.println("Your total Century 2212 weight is " + TotalWeightCENTURY2212 + " pounds");

		TotalWeightALTMAN3INCHFRESNELS = AmountOfALTMAN3INCHFRESNELS * ALTMAN3INCHFRESNELS;
		System.out.println("Your total Altman 3\" Fresnels weight is " + weightFormat.format(TotalWeightALTMAN3INCHFRESNELS) + " pounds");

		TotalWeightCENTURY3480 = AmountOfCENTURY3480 * CENTURY3480;
		System.out.println("Your total Century 3480 weight is " + TotalWeightCENTURY3480 + " pounds");
		

		TotalFixtureWeight = TotalWeightETC + TotalWeightParcan + TotalWeightCENTURY2212
				+ TotalWeightALTMAN3INCHFRESNELS + TotalWeightCENTURY3480;


		double TotalOverallWeight = TotalWeight + TotalFixtureWeight;
		System.out.println("Your total overall weight is " + weightFormat.format(TotalOverallWeight) + " pounds");

		AmountOfBricks = (int) (TotalOverallWeight / BRICKWEIGHT);
		System.out.println("The amount of bricks needed is " + AmountOfBricks);

		LeftOverWeight = (TotalOverallWeight % BRICKWEIGHT);

		AmountOfHalfBricks = (int) (LeftOverWeight / HALFBRICKWEIGHT);

		if (TotalOverallWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) >= 1.5) {
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		} else if (TotalOverallWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) <= .358) {
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		}

		System.out.println("The amount of half bricks needed is " + AmountOfHalfBricks + "\r");

		if (TotalOverallWeight <= 50 && TotalOverallWeight >= 32) {
			System.out.println("\r" + "Only use this between 32-50 lbs: "
					+ weightFormat.format(TotalFixtureWeight - AmountOfBricks * 32));
		} else if (TotalOverallWeight >= 18 && TotalOverallWeight < 32) {
			System.out.println("\r" + "Only use this between 18-32 lbs: "
					+ weightFormat.format(TotalFixtureWeight - AmountOfHalfBricks * 18));

		}

	}
}

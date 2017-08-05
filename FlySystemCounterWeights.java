import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/*
 * Mario Hernandez
 *****************Purpose*********************
 * Purpose: This program is designed for Lighting Design students working in the Montana Theatre in
the Performing Arts Radio Television (PARTV) building. It's a formula to determine how much counter-weight
is needed on the fly system to balance the lighting instruments on a batten so it doesn't come crashing down
or flying up on it's own.
 *********************************************
 ****************CHANGE LOG*******************
 *Feb 22 2017 - Created class, created variables and basic counter-weight formula to ETC and Parcan fixtures.
 *Mar 28 2017 - Made an example to add in required randomness. Added more cable and scroller variables, as well as example variables. 
 *********************************************
 */

/* Need to ask if cables are present
 * Need to ask what type type of cable 
 */

public class FlySystemCounterWeights {

	public static void main(String[] args) {
		final int HALFBRICKWEIGHT = 18;
		final int BRICKWEIGHT = 32;
		final double ETCSOURCE4WEIGHT = 15.9;
		final int BATTENWEIGHT = 88;
		final int PARCANWEIGHT = 3;
		final int CENTURY2212 = 16;
		final double ALTMAN3INCHFRESNELS = 2.2;
		final int CENTURY3480 = 17;
		final double Scroller = 5.4;
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
		int ETCExample;
		int ParcanExample;
		final int MAXRANDOM = 6;

		System.out.println(
				"This program is will assist you in determining how much counterweight is required over pipe for \n"
						+ "your lighting fixtures and cables on a batten used in the Montana Theatre \n"
						+ "Enter all amounts as WHOLE numbers (e.g. 7)\n");

		Random Example = new Random();
		ETCExample = Example.nextInt(MAXRANDOM);
		ParcanExample = Example.nextInt(MAXRANDOM);
		DecimalFormat weightFormat = new DecimalFormat("0.0");

		/*System.out.println("Example for " + ETCExample + " ETC Source 4's and " + ParcanExample + " Parcans. ");

		TotalWeightETC = (double) ETCExample * ETCSOURCE4WEIGHT;
		System.out.println("Your total ETC weight is " + TotalWeightETC + " pounds");

		TotalWeightParcan = ParcanExample * PARCANWEIGHT;
		System.out.println("Your total PARCAN weight is " + TotalWeightParcan + " pounds");

		TotalFixtureWeight = TotalWeightETC + TotalWeightParcan;
		System.out.println("Your total fixture weight is " + TotalFixtureWeight + " pounds");

		AmountOfBricks = (int) (TotalFixtureWeight / BRICKWEIGHT);
		System.out.println("The amount of bricks needed is " + AmountOfBricks);

		LeftOverWeight = (TotalFixtureWeight % BRICKWEIGHT);

		AmountOfHalfBricks = (int) (LeftOverWeight / HALFBRICKWEIGHT);
		
		if (TotalFixtureWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) >= 1.5) {
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		}
		else if (TotalFixtureWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) <= .358){
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		}
		
		System.out.println("The amount of half bricks needed is " + AmountOfHalfBricks + "\r");
		
		if (TotalFixtureWeight <=50 && TotalFixtureWeight >= 32){
			System.out.println("\r" + "Only use this between 32-50 lbs: " + weightFormat.format(TotalFixtureWeight - AmountOfBricks*32));
			}
		else if (TotalFixtureWeight >= 18 && TotalFixtureWeight <32){
			System.out.println("\r" + "Only use this between 18-32 lbs: " + weightFormat.format(TotalFixtureWeight - AmountOfHalfBricks*18));
		}
*/
		
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

		TotalWeightETC = AmountOfETC * ETCSOURCE4WEIGHT;
		System.out.println("Your total ETC weight is " + TotalWeightETC + " pounds");

		TotalWeightParcan = AmountOfPARCANS * PARCANWEIGHT;
		System.out.println("Your total PARCAN weight is " + TotalWeightParcan + " pounds");
		
		TotalWeightCENTURY2212 = AmountOfCENTURY2212 * CENTURY2212;
		System.out.println("Your total Century 2212 weight is " + TotalWeightCENTURY2212 + " pounds");
		
		TotalWeightALTMAN3INCHFRESNELS = AmountOfALTMAN3INCHFRESNELS * ALTMAN3INCHFRESNELS;
		System.out.println("Your total Altman 3\" Fresnels weight is " + TotalWeightALTMAN3INCHFRESNELS + " pounds");
		
		TotalWeightCENTURY3480 = AmountOfCENTURY3480 * CENTURY3480;
		System.out.println("Your total Century 3480 weight is " + TotalWeightCENTURY3480 + " pounds");

		TotalFixtureWeight = TotalWeightETC + TotalWeightParcan + TotalWeightCENTURY2212 + TotalWeightALTMAN3INCHFRESNELS + TotalWeightCENTURY3480;
		System.out.println("Your total fixture weight is " + TotalFixtureWeight + " pounds");

		AmountOfBricks = (int) (TotalFixtureWeight / BRICKWEIGHT);
		System.out.println("The amount of bricks needed is " + AmountOfBricks);

		LeftOverWeight = (TotalFixtureWeight % BRICKWEIGHT);

		AmountOfHalfBricks = (int) (LeftOverWeight / HALFBRICKWEIGHT);
		
		if (TotalFixtureWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) >= 1.5) {
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		}
		else if (TotalFixtureWeight / (HALFBRICKWEIGHT + BRICKWEIGHT) <= .358){
			AmountOfHalfBricks = AmountOfHalfBricks + 1;
		}
		
		System.out.println("The amount of half bricks needed is " + AmountOfHalfBricks + "\r");
		
		if (TotalFixtureWeight <=50 && TotalFixtureWeight >= 32){
			System.out.println("\r" + "Only use this between 32-50 lbs: " + weightFormat.format(TotalFixtureWeight - AmountOfBricks*32));
			}
		else if (TotalFixtureWeight >= 18 && TotalFixtureWeight <32){
			System.out.println("\r" + "Only use this between 18-32 lbs: " + weightFormat.format(TotalFixtureWeight - AmountOfHalfBricks*18));
		}
	}

}

package Week_7;

import java.util.Scanner;

public class StuResCard {

	public static void main(String[] args) {

		System.out.println(" --------------------------------------------------------");
		System.out.println("| S T U D E N T    R E S U L T    C A R D    S Y S T E M |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| 1. PRINT RECORDS                                       |");
		System.out.println("| 2. ADD NEW RECORD                                      |");
		System.out.println("| 3. UPDATE CURRENT RECORD                               |");
		System.out.println("| 4. REMOVE A RECORD                                     |");
		System.out.println("| 5. VIEW DAILY ACTIVITIES REPORT                        |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| 6. Exit                                                |");
		System.out.println(" --------------------------------------------------------");

		int userinput = 0;

		label: while (userinput != 6) {
			userinput = 0;
			System.out.print("\n Enter a choice and Press ENTER to continue[1-6]:");
			Scanner input = new Scanner(System.in);
			userinput = input.nextdouble();
			
			userinput = 6;

			switch (userinput) {
			

			case 1:
				System.out.print("\n Print Records");

				continue label;

			case 2:

				System.out.print("\n Add a record");
				
				continue label;

			case 3:
				System.out.print("\n Update a Record");
				
				continue label;

			case 4:
				System.out.print("\n Remove a record");
				continue label;

			case 5:
				System.out.print("\n Prints Daily Activties");
				
				continue label;

			case 6:
				System.out.println("\n\n Thanks for using this program...!");
				break;

			default:
				System.out.println("\n This doesn't appear to be a valid option...!");
				continue label;

			}
			input.close();
		}

	}
}

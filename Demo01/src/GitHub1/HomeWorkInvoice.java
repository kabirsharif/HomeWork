package GitHub1;

import java.util.Scanner;

public class HomeWorkInvoice {
	
	
	public static void main(String Args[]) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Apple Unit Price : ");
		int appleUnitPrice=input.nextInt();
		System.out.println("Enter Apple Amount Bought : ");
		int appleAmount=input.nextInt();
		int appleTotalPrice = appleUnitPrice*appleAmount;
		
		System.out.println("Enter Dates Unit Price : ");
		int datesUnitPrice=input.nextInt();
		System.out.println("Enter Dates Amount Bought : ");
		int datesAmount=input.nextInt();
		int datesTotalPrice = datesUnitPrice*datesAmount;
		
		System.out.println("Enter Banana Unit Price : ");
		int bananaUnitPrice=input.nextInt();
		System.out.println("Enter Banana Amount Bought : ");
		int bananaAmount=input.nextInt();
		int bananaTotalPrice = bananaUnitPrice*bananaAmount;
		
		System.out.println("Enter State VAT Rate : ");
		float vatRate=input.nextFloat();
		
		System.out.println("\n\n\t**** Mahmud & Brothers Inc. ****\n");
		System.out.println(" \tItemized Invoice of Purchase.\n ");
		System.out.println("\tItems" + "\t\tUnit Price" + " \t Total Price\n");
		
		System.out.println("\tGreen Apple : " + "\t\t" + appleUnitPrice + "\t " + appleTotalPrice);
		System.out.println("\tArabian Dates : " + "\t" + datesUnitPrice + "\t " + datesTotalPrice);
		System.out.println("\tBanana : " + "\t\t" + bananaUnitPrice + "\t " + bananaTotalPrice + "\n");
		
		float totalPrice = appleTotalPrice+datesTotalPrice+bananaTotalPrice;
		System.out.println("\tTotal Price : "+totalPrice);
		System.out.println("\tVat Rate : "+vatRate*100+"%");
		System.out.print("\tPayable Price : ");
		System.out.println( totalPrice+totalPrice*vatRate);
		System.out.println("\n");
		System.out.println("\t** <3 Thank you for shopping with us <3 **");
		
		input.close();
	}

}

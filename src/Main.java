import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Cost of Bill: $");
        double bill=Scan.nextDouble();
        System.out.print("Tip Percent in Decimals: ");
        double tipPrc=Scan.nextDouble();
        System.out.print("Number of People: ");
        int numPeople=Scan.nextInt();
        //double =((int)(100x))/100
        double totalTip=bill*tipPrc;
        totalTip=((int)(100*totalTip))/100.0;
        double totalCost=bill+totalTip;
        totalTip=((int)(100*totalTip))/100.0;
        double tipPer=totalTip/numPeople;
        tipPer=((int)(100*totalTip))/100.0;
        double totalPer=totalCost/numPeople;
        totalPer=((int)(100*totalPer))/100.0;
        System.out.println("The total cost of the tip is $"+totalTip);
        System.out.println("The total cost of the bill is $"+totalCost);
        System.out.println("The cost of the tip per person is $"+tipPer);
        System.out.println("The cost of the bill per person is $"+totalPer);
    }
}
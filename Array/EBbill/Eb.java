import java.util.Scanner;
public class Eb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the EB bill for each 2-month period
        double[] ebBills = new double[6];
        String[] periods = {"Jan-Feb", "Mar-Apr", "May-Jun", "Jul-Aug", "Sep-Oct", "Nov-Dec"};
        
        // Fixed rate per unit of electricity
        double ratePerUnit = 5.0;
        double freeUnits = 100.0;

        // Calculate the EB bill for each period
        for (int i = 0; i < periods.length; i++) {
            System.out.print("Enter units consumed for " + periods[i] + ": ");
            double units = scanner.nextDouble();
            
            // Deduct free units
            double billableUnits = units - freeUnits;
            if (billableUnits < 0) {
                billableUnits = 0;
            }
            
            ebBills[i] = billableUnits * ratePerUnit;
        }

        // Display the EB bills for each period
        System.out.println("\nElectricity Bills for each period:");
        for (int i = 0; i < periods.length; i++) {
            System.out.println(periods[i] + ": " + ebBills[i]);
        }

        scanner.close();
    }
}
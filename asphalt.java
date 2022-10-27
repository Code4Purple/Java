import java.util.Scanner;

public class asphalt {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scan = new Scanner(System.in);

        // Below this comment: declare any variables you may need
        double length;
        int lanes;
        int depth;

        // Below this comment: collect the required inputs
        System.out.print("Enter length of road in miles    : ");
        length = scan.nextDouble();
        System.out.print("Enter number of lanes            : ");
        lanes = scan.nextInt();
        System.out.print("Enter depth of asphalt in inches : ");
        depth = scan.nextInt();
        System.out.println("");

        // Below this comment: write Java code to do the computations needed to
        // determine the correct output
        double depth_feet = depth / 12.0; // depth feet
        double width_feet = lanes * 12; // lane feet
        double length_feet = length * 5280; // making miles into feet

        double cubic_feet = length_feet * width_feet * depth_feet;
        double pounds = cubic_feet * 145;
        double tons = pounds / 2000;

        double truckloads = (int) Math.ceil(tons / 5);
        double cost = truckloads * 5 * 150;

        // Below this comment: output the correct output
        System.out.printf("Truckloads of asphalt needed is  : %.0f\n", truckloads);
        System.out.printf("Total cost of asphalt is         : $%.2f\n", cost);

    }
}

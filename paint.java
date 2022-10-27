import java.util.Scanner;

public class paint {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // collect your input(s)
        int height;
        int width;

        System.out.print("Enter Wall Height: ");
        height = scnr.nextInt();
        System.out.print("Enter Wall Width: ");
        width = scnr.nextInt();
        System.out.println();

        // compute the required output(s)
        int area = height * width;
        double gallons = area / 350.0;
        int cans = (int) Math.ceil(gallons);

        // display the output(s)
        System.out.println("Wall area : " + area + " square feet");
        System.out.printf("Paint needed : %.2f gallons\n", gallons);
        System.out.printf("Cans needed : %d can(s)\n", cans);

    }
}

/*
 * Test Data
 * Enter wall height (feet) : 12
 * Enter wall width (feet) : 15
 * 
 * Wall area : 180 square feet
 * Paint needed : 0.51 gallons
 */
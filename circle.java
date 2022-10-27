/*****
 * 
 * Test Data
 * Properties of a Circle
 * Radius : 10.25
 * Diameter : 20.5
 * Circumference : 64.40075
 * Area : 330.05384375
 * Area of Semicircle : 165.026921875
 * 
 * Properties "Rounded" Down
 * Radius : 10
 * Diameter : 20
 * Circumference : 64
 * Area : 330
 * Area of Semicircle : 165
 * 
 *****/

public class circle {
    public static void main(String[] args) {
        System.out.println("Properties of a Circle");
        System.out.println("Radius             : " + 10.25);
        System.out.println("Diameter           : " + 10.25 * 2);
        System.out.println("Circumference      : " + 3.1415 * (10.25 * 2));
        System.out.println("Area               : " + 3.1415 * (10.25 * 10.25));
        System.out.println("Area of Semicircle : " + (3.1415 * (10.25 * 10.25)) / 2);
        System.out.println();
        System.out.println("Properties \"Rounded\" Down");
        System.out.println("Radius             : " + (int) 10.25);
        System.out.println("Diameter           : " + (int) (10.25 * 2));
        System.out.println("Circumference      : " + (int) (3.1415 * (10.25 * 2)));
        System.out.println("Area               : " + (int) (3.1415 * (10.25 * 10.25)));
        System.out.println("Area of Semicircle : " + (int) ((3.1415 * (10.25 * 10.25)) / 2));
    }
}

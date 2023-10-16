import java.util.Scanner;

public class Driver {

    Spot spot1;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Spot Console V1.0!");
        new Driver();
    }

    Driver() {
        spot1 = new Spot();
        float temp;
        display();
        System.out.println("Please Enter xCoord : ");
        temp = input.nextFloat();
        spot1.xCoord = temp;

        System.out.println("Please Enter yCoord : ");
        temp = input.nextFloat();
        spot1.yCoord = temp;

        System.out.println("Please Enter Diameter : ");
        temp = input.nextFloat();
        spot1.diameter = temp;

        display();
    }

    void display() {
        System.out.println("The xCoord is : " + spot1.xCoord);
        System.out.println("The yCoord is : " + spot1.yCoord);
        System.out.println("The Diameter is : " + spot1.diameter);

    }
}
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
        display();
        System.out.println("Please Enter xCoord : ");
        float xValue = input.nextFloat();
        spot1.xCoord = xValue;
        display();
    }

    void display() {
        System.out.println("The xCoord is : " + spot1.xCoord);
        System.out.println("The yCoord is : " + spot1.yCoord);
        System.out.println("The Diameter is : " + spot1.diameter);

    }
}
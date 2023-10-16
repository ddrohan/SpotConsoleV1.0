import java.util.Scanner;

public class Spot {

    float xCoord;
    float yCoord;
    float diameter;

    Spot() {}

    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter xCoord : ");
        xCoord = input.nextFloat();

        System.out.println("Please Enter yCoord : ");
        yCoord = input.nextFloat();

        System.out.println("Please Enter Diameter : ");
        diameter = input.nextFloat();
    }

    public void display() {
        System.out.println("The xCoord is : " + xCoord);
        System.out.println("The yCoord is : " + yCoord);
        System.out.println("The Diameter is : " + diameter);

    }
}

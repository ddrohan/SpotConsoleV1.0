import java.util.Scanner;

public class Driver {

//Making a change remotely


    Spot spot1;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Spot Console V1.0!");
        new Driver();
    }

    Driver() {
        spot1 = new Spot();
        spot1.display();
        spot1.setDetails();
        spot1.display();
    }
}

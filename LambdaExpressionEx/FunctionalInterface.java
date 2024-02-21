package LambdaExpressionEx;
import java.io.*;

@java.lang.FunctionalInterface
interface Cab{
    void bookCab();

}

public class FunctionalInterface {
    public static void main(String[] args)
    {

        // Creating object of above functional interface
        Cab cab = new Cab() {
            // Method 2
            // Overriding above bookCab() method
            @Override public void bookCab()
            {

                // Print statement
                System.out.println(
                        "Booking Successful!! Arriving Soon!!");
            }
        };

        cab.bookCab();
    }
}

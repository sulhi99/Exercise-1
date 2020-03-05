import java.util.Scanner;

public class DateFormat // start of class
{

    public static void main(String[] args)
    { // start of main method

        Scanner input = new Scanner(System.in);

        String date = input.next();

        String newDateFormat = date.replaceAll("/",".");
        System.out.println("Output: " +newDateFormat);

    } // end of main method
} // end of class
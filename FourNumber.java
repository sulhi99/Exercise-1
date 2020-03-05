public class FourNumber // start of class
{

    public static void main(String[] args) // start of main method
    {

        String stringNumber = "2018";
        int sumNum = 0;
        String stringNum;

        for (int i = 0; i < stringNumber.length(); i++)
        {
            System.out.println(stringNumber.charAt(i));
            stringNum = String.valueOf(stringNumber.charAt(i));
            sumNum = sumNum + Integer.parseInt(stringNum);
        }

        System.out.println("the sum of digit is: " +sumNum);

    } // end of main method
} // end of class

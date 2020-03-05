import java.util.Scanner;
  public class FormatDate 
  {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    String date = in.next();
    String newDateFormat = date.replaceAll("/" ,".");
     System.out.println("The final string is " + newDateFormat);
    }
  }

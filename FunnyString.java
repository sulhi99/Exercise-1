import java.util.Scanner; 
public class FunnyString // Start of class
{
  public static void main(String[] args) // start of main method
  {
  String colour, food, animal, nameFriend;
  Scanner input = new Scanner(System.in);
System.out.println("**********ENTER YOUR DETAILS************");
System.out.print("Enter your fav colour:");
colour = input.nextLine();
System.out.println("colour: " + colour);
System.out.print("Enter your fav food:");
food = input.nextLine();
System.out.println("Food: " + food);
System.out.print("Enter your fav animal:");
animal = input.nextLine();
System.out.println("animal: " + animal);
System.out.print("Enter your first name of a friend: ");
nameFriend = input.nextLine();
System.out.println("nameFriend: " + nameFriend);
input.close();

System.out.println("I had a dream that" + " "+ nameFriend +" " + "ate a" + " " + colour +" cat and said it tasted like" + " "+ food +"!");
  
  } // end of main method
} // end of class
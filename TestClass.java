package GroupProject809;
import java.util.Scanner;

/**
 * Created by Group 10 Team on 16/02/2021
 *
 */
public class TestClass
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      UserInterface userInterface = new UserInterface(scanner);

//Created a welcome method, this avoids the user getting asked for their name again if they choose a to keep going.
      userInterface.welcome();
      userInterface.start();
//Created a continueTest method to loop the user around the more tests or leave the revision app.
      userInterface.continueTest();

   }//main
}//class
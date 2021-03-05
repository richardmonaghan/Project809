package GroupProject809;

import java.util.Scanner;

/**
 * Created by Alexander on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class UserInterface
{
   private Scanner scanner;
   static public String input;
   public String afterTest;

//UPDATED WITH AGREED TOPICS
   private String[] topics = {"1) Variables / Data Input / Selection", "2) Control - Methods", "3) Classes", "4) Arrays"};
   public UserInterface(Scanner scanner) {
      this.scanner = scanner;
   }//Alternative constructor


   public void start() {
      //ask user to select a topic
      System.out.println();
      System.out.println("Welcome to the Java Revision App!");
      System.out.println("Which of the following topics would you like to test yourself on?");
      for (String topic : topics) {
      //Updates to print next line
      System.out.println(topic + " "); }
      System.out.println("Please enter your selection:");
      input = scanner.nextLine();

      if (input.equals("Arrays")) {
         //run the Array topic quiz
         ArrayTopic arrayRound = new ArrayTopic();
         arrayRound.askQs();
         arrayRound.printScore();
      } else if (input.equals("Classes")) {
         //run the Array topic quiz
         ClassesTopic classesRound = new ClassesTopic();
         classesRound.askQs();
         classesRound.printScore();
      } else if (input.equals("Control")){
         System.out.print("RunControl");
      } else if (input.equals("Var")) {
         System.out.print("RunControl");
      }
   }//start

   public void continueTest() {
         System.out.println();
         System.out.println("Well Done on completing " + input);
         System.out.println("Would you like to complete another test subject? Y/N");
         afterTest = (scanner.nextLine());
         if (afterTest == "Y") {
         System.out.println("Please select which topic you like to revise next? \n");
         start();
      }//if
         else {
      System.out.println("Thank you!");{
         endTest();
            }
      }//else
   }//ContinueTest

   public void endTest() {
       System.exit(0);
   }
}//class
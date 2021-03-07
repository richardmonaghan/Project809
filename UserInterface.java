package GroupProject809;

import java.util.Scanner;

/**
 * Created by Group10 Team on 16/02/2021
 *
 */
public class UserInterface {

   static public Scanner scanner;
   static public int userSelection;
   public String[] topics = {"1 - Variables / Data Input / Selection", "2 - Control - Methods", "3 - Classes", "4 - Arrays"};

   public UserInterface(Scanner scanner) {
      this.scanner = scanner;
      }//Alternative constructor

   public void welcome() {
//User Info and welcome to App
      System.out.println();
      System.out.println("Welcome to the Java Revision Quiz!");
      System.out.println("Enter your name to to continue: ");
      String name = scanner.nextLine();
      System.out.println("Welcome " + name.toUpperCase() + " let's begin!");
   }


   public void start(){
      System.out.println("Which of the following topics would you like to test yourself on?");

//Topic Array List
      for (String topic : topics) {
      System.out.println(topic + " ");
      }

//Do While Loop for user selection - to ensure they select 1 -4
      do {
         System.out.println("Please enter your selection: 1, 2, 3, or 4:");
         userSelection = scanner.nextInt();
      } while (userSelection >= 5);

//Switch statement to select revision topic
      switch (userSelection) {
            case 1:
               System.out.println("Run Variables etc Class - Sarma");
               break;
            case 2:
               System.out.println("Run Control Class - Enya");
               break;
            case 3:
               ClassesTopic classesRound = new ClassesTopic();
               classesRound.askQs();
               classesRound.printScore();
               break;
            case 4:
               ArrayTopic arrayRound = new ArrayTopic();
               arrayRound.askQs();
               arrayRound.printScore();
               break;
         }//switch
   }//start

   public void continueTest()
//Select whether they wish to continue
   {  System.out.println("Would you like try another test section");
      String endTest = scanner.next();
      if (endTest.equals("N")) {
         System.out.println("We hope you enjoyed using the app!");
      }
      else if (endTest.equals("Y")){
         System.out.println("Great lets keep going, please select a topic.");
         start();
      }
   }
}//class
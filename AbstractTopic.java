package GroupProject809;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Group 10 Team on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
abstract class AbstractTopic
{
   public Scanner scanner;
   protected String topic;
   public int topicScore, userSelection;
   //a list to store all the questions and answers for this round
   public ArrayList<QuestionAndAnswer> questionsAndAnswers;


   public AbstractTopic(){
      this.questionsAndAnswers = new ArrayList<>();
      this.topicScore = 0;
      this.scanner = new Scanner(System.in);
   }//default constructor

   public void askQs (){
      System.out.println("\nHere are the questions on " + topic + ":\n");

      // loop through each question in the list for that topic
      for (QuestionAndAnswer q : questionsAndAnswers) {
         q.askQ();
         if (q.isCorrect(scanner.nextLine())){
            System.out.println("This is correct! \n");
            topicScore++;
         }//if
         else q.correctAnswer();
      }//for
   }//askQs

   public void printScore() {
      System.out.println("You scored " + topicScore + " on the " + topic + " questions");
   }//printScore
}//class
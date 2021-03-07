package GroupProject809;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Alexander on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ArrayTopic extends AbstractTopic
{
   public ArrayTopic()
   {
      this.topic = "4";

      this.questionsAndAnswers.add(new QuestionAndAnswer("Does an array have a fixed size? (y/n)", "y"));
      this.questionsAndAnswers.add(new QuestionAndAnswer("Can arrays contain different data types?", "n"));



   }//default constructor
}//class
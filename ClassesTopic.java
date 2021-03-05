package GroupProject809;

/**
 * *Created by ric_m on 03/03/2021
 * *UPDATE WITH COMMENTS ABOUT PROGRAM HERE
 **/
public class ClassesTopic extends AbstractTopic
{

   public ClassesTopic()
   {
      this.topic = "Classes";
      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "What are the typical one of the key elements of a class" + "\nA - Instance Variables, \nB - Instance Classes, \nC- Instance Objects, \nD - Instance index",
            "a"));

      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "An object is known as a member of a Class but often what other term is used?",
            "instance"));

      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "A static Modifier associates a variable or method with its _____? (Fill in the blank)",
            "class"));

      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "Java allows us to ______ attributes and methods from one another ?",
            "inherit"));

      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "myCar = ___ Car(); The operator is missing, can you complete it?",
            "new"));


   }//main
}//class

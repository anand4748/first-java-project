
import java.util.Scanner;

public class QuizApplication {
   static Question[] questions = new Question[10];
   static Scanner scanner;

   public QuizApplication() {
   }

   public static void main(String[] var0) {
      questions[0] = new Question("Q1", "how do you create a varable with  numeric value 5?", new String[]{"num x=5", "x=5;", "int x=5", "foloat x=5"}, "int x=5", "next", "no");
      questions[1] = new Question("Q2", "Which method can be used to find the length of string?", new String[]{"getsize()", "getlength()", " len()", "lenght()"}, "lenght()", "next", "no");
      questions[2] = new Question("Q3", "Which operator is used to add togher two vaues?", new String[]{"The * sign", "The + sign", "the & sign", "the # sign"}, "The + sign", "next", "no");
      questions[3] = new Question("Q4", "Which operator is used to sow modules of vaues?", new String[]{"The * sign", "The + sign", "the - sign", "the % sign"}, "The % sign", "next", "no");
      questions[4] = new Question("Q5", "void show which value?", new String[]{"0", "1", "0 or 1", "Null"}, "null", "next", "no");
      System.out.println("do you want to add more question or not");
      boolean var1 = scanner.nextBoolean();
      if (var1) {
         questions[5] = new Question("Q6", "void show which value?", new String[]{"0", "1", "0 or 1", "Null"}, "null", "next", "no");
      }

      startQuiz();
   }

   public static void startQuiz() {
      int var0 = 0;
      int var1 = 0;
      Question[] var2 = questions;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Question var5 = var2[var4];
         if (var5 != null) {
            System.out.println(var5.getQuestion());

            int var6;
            for(var6 = 0; var6 < var5.getOptions().length; ++var6) {
               System.out.println(var6 + 1 + ". " + var5.getOptions()[var6]);
            }

            System.out.print("Enter your answer (1-" + var5.getOptions().length + "): ");
            var6 = scanner.nextInt() - 1;
            if (var5.getOptions()[var6].equals(var5.getCorrectAnswer())) {
               ++var0;
               System.out.println("Correct!");
            } else {
               ++var1;
               System.out.println("Incorrect. The correct answer is " + var5.getCorrectAnswer());
            }
         }
      }

      displayFinalScore(var0, var1);
   }

   public static void displayFinalScore(int var0, int var1) {
      int var2 = var0 + var1;
      double var3 = (double)var0 / (double)var2 * 100.0;
      System.out.println("Quiz complete! Your final score is:");
      System.out.println("Correct answers: " + var0);
      System.out.println("Incorrect answers: " + var1);
      System.out.println("Percentage: " + var3 + "%");
      if (var3 >= 0.0 && var3 <= 25.0) {
         System.out.println("You must study much harder!");
      } else if (var3 >= 26.0 && var3 <= 50.0) {
         System.out.println("You are studying good, need some more study!");
      } else if (var3 >= 51.0 && var3 <= 75.0) {
         System.out.println("You are a topper! Just a bit of extra effort!");
      } else if (var3 >= 76.0 && var3 <= 100.0) {
         System.out.println("You are very good! Best of luck for the next round!");
      }

   }

   static {
      scanner = new Scanner(System.in);
   }
}


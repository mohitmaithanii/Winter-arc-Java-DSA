// Java Variables :
// A variable is a name given to a memory location that stores a value. Variables are used to store and manipulate data in a Java program. A variable has a name, a datatype, and a value.

public class Variable {
   public static void main(String[] args) {

      // Variable names can start with letters (both lowercase and uppercase)
      int age = 22;
      int AGE = 20;

      System.out.println("age : " + age);
      System.out.println("AGE : " + AGE);

      // Variable names can also start with an underscore (_)
      int _marks = 80;
      System.out.println("_marks : " + _marks);

      // Variable names can use camelCase notation
      int firstMark = 83;
      int secondMark = 58;

      System.out.println("firstMark : " + firstMark);
      System.out.println("secondMark : " + secondMark);

      // Variable names can start with a dollar sign ($)
      int $score = 100;
      int score$allowed = 23;

      System.out.println("$score : " + $score);
      System.out.println("score$allowed : " + score$allowed);

   }
}

// Rules for Naming Variables in Java:

/*
 * 1. A variable name must start with a letter, underscore(_) or dollar sign($).
 * 2. A variable name cannot start with a number.
 * 3. A variable name cannot be a keyword (e.g., 'public', 'class', 'void').
 * 4. Variable names cannot use whitespace (spaces, tabs, etc.).
 * 5. Java is case-sensitive, hence 'age' and 'AGE' are two different variables.
 */
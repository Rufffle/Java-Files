package task1;

import java.util.Scanner;
import java.util.Stack;

public class main {

  static boolean matchingPair(char character1, char character2) {
    if (character1 == '(' && character2 == ')') {
      return true;
    } else if (character1 == '{' && character2 == '}') {
      return true;
    } else if (character1 == '[' && character2 == ']') {
      return true;
    } else {
      return false;
    }
  }

  static boolean areParenthesisBalanced(String braces) {

    Stack st = new Stack();

    for (int index = 0; index < braces.length(); index++) {

      if (braces.charAt(index) == '{' || braces.charAt(index) == '('
              || braces.charAt(index) == '[') {
        st.push(braces.charAt(index));
      }

      if (braces.charAt(index) == '}' || braces.charAt(index) == ')'
              || braces.charAt(index) == ']') {
        if (st.isEmpty()) {
          return false;
        } else if (!matchingPair((char) st.pop(), braces.charAt(index))) {
          return false;
        }
      }

    }
    if (st.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.err.println("Enter your input : ");
    String braces = input.next();

    if (areParenthesisBalanced(braces)) {
      System.out.println("Balanced ");
    } else {
      System.out.println("Not Balanced ");
    }
  }

}

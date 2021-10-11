import java.util.*;

public class SRPN {

  // creating new stack
  Stack<Integer> stack = new Stack<>();

  public void processCommand(String s) {
    try {
      // if + sign added then pop the top two from stack and add them together
      if (s.equals("+")) {
        int operandA = stack.pop();
        int operandB = stack.pop();
        double saturatedValue = (double) operandB + (double) operandA;
        stack.push((int)saturatedValue);
      }
      // if - sign added then pop the top two from stack and take away
      else if (s.equals("-")) {
        int operandA = stack.pop();
        int operandB = stack.pop();
        double saturatedValue = (double) operandB - (double) operandA;
        stack.push((int)saturatedValue);
      }
      // if * sign added then pop the top two from stack and multiply
      else if (s.equals("*")) {
        int operandA = stack.pop();
        int operandB = stack.pop();
        double saturatedValue = (double) operandB * (double) operandA;
        stack.push((int)saturatedValue);
      }
      // if % sign added then pop the top two from stack and apply modulo
      else if (s.equals("%")) {
        int operandA = stack.pop();
        int operandB = stack.pop();
        double saturatedValue = (double) operandB % (double) operandA;
        stack.push((int)saturatedValue);
      }
      // if / sign added then pop the top two from stack and apply division
      else if (s.equals("/")) {
        int operandA = stack.pop();
        int operandB = stack.pop();
        double saturatedValue = (double) operandB / (double) operandA;
        stack.push((int)saturatedValue);
      }
      // if entered character is d then print out everything in the stack on a new
      // line
      else if (s.equals("d")) {
        proccessD();
      }
      // peek top of stack if equals sign
      else if (s.equals("=")) {
        try {
          System.out.println(stack.peek());
        } catch (EmptyStackException e) {
          System.out.println("Stack empty.");
        }
      }

      // otherwise any number we enter gets pushed into the stack
      // note that taking in as a double then casting to int solves
      else {
        double y = Double.parseDouble(s);
        int x = (int) y;
        stack.push(x);
      }
    }

    catch (EmptyStackException x) {
      System.out.println("Stack underflow.");
    } catch (ArithmeticException y) {
      System.out.println("Divide by 0.");
    } catch (NumberFormatException z) {
      System.out.println("Unrecognised operator or operand \"" + s + "\"");
    }

  }

  // d prints out everything in the stack on a new line
  public void proccessD() {
    if (stack.isEmpty()) {
      System.out.println(Integer.MIN_VALUE);
    } else {
      for (int element : stack) {
        System.out.println(element);
      }
    }
  }

   
}

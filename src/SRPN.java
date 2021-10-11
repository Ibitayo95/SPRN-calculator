import java.util.*;

public class SRPN {

  // creating new stack
  Stack<Integer> stack = new Stack<>();

  public void processCommand(String s) {
    try {
      if (s.equals("+")) {
        processPlus();
      } else if (s.equals("-")) {
        processMinus();
      } else if (s.equals("*")) {
        processMultiply();
      } else if (s.equals("%")) {
        processModulo();
      } else if (s.equals("/")) {
        processDivide();
      } else if (s.equals("d")) {
        proccessD();
      } else if (s.equals("=")) {
        processEquals();
      }
      // otherwise any number we enter gets pushed into the stack
      // note that taking in the number as a double, then casting to int keeps the numbers saturated
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

  // CALCULATION METHODS
  // if + sign added then pop the top two from stack and add them together
  public void processPlus() {
    if (stack.size() >= 2) {
      int operandA = stack.pop();
      int operandB = stack.pop();
      double saturatedValue = (double) operandB + (double) operandA;
      stack.push((int) saturatedValue);
    } else {
      throw new EmptyStackException();
    }
  }

  // if - sign added then pop the top two from stack and subtract
  public void processMinus() {
    if (stack.size() >= 2) {
      int operandA = stack.pop();
      int operandB = stack.pop();
      double saturatedValue = (double) operandB - (double) operandA;
      stack.push((int) saturatedValue);
    } else {
      throw new EmptyStackException();
    }
  }

  // if * sign added then pop the top two from stack and multiply
  public void processMultiply() {
    if (stack.size() >= 2) {
      int operandA = stack.pop();
      int operandB = stack.pop();
      double saturatedValue = (double) operandB * (double) operandA;
      stack.push((int) saturatedValue);
    } else {
      throw new EmptyStackException();
    }
  }

  // if % sign added then pop the top two from stack and apply modulo
  public void processModulo() {
    if (stack.size() >= 2) {
      int operandA = stack.pop();
      int operandB = stack.pop();
      double saturatedValue = (double) operandB % (double) operandA;
      stack.push((int) saturatedValue);
    } else {
      throw new EmptyStackException();
    }
  }

  // if / sign added then pop the top two from stack and apply division
  public void processDivide() {
    if (stack.size() >= 2) {
      int operandA = stack.pop();
      int operandB = stack.pop();
      double saturatedValue = (double) operandB / (double) operandA;
      stack.push((int) saturatedValue);
    } else {
      throw new EmptyStackException();
    }
  }

  // equals shows what is currently sitting on the top of the stack using peek()
  public void processEquals() {
    try {
      System.out.println(stack.peek());
    } catch (EmptyStackException e) {
      System.out.println("Stack empty.");
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

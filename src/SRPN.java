import java.util.*;


 public class SRPN {

  //creating new stack
Stack <Integer> stack = new Stack<>();

    public void processCommand(String s) {
      try {
  //if + sign added then pop the top two from stack and add them together
        if (s.equals("+")) {
          int operandA = stack.pop();
          int operandB = stack.pop();
          stack.push(operandB + operandA);
        }
  //if - sign added then pop the top two from stack and take away
        else if (s.equals("-")) {
          int operandA = stack.pop();
          int operandB = stack.pop();
          stack.push(operandB - operandA);
        }
  //if * sign added then pop the top two from stack and multiply
        else if (s.equals("*")) {
          int operandA = stack.pop();
          int operandB = stack.pop();
          stack.push(operandB * operandA);
        }
  //if % sign added then pop the top two from stack and apply modulo
        else if (s.equals("%")) {
          int operandA = stack.pop();
          int operandB = stack.pop();
          stack.push(operandB % operandA);
        }
  //peek top of stack if equals sign
        else if (s.equals("=")) { 
          try {
            System.out.println(stack.peek());
        }
          catch (EmptyStackException e) {
            System.out.println("Stack empty.");
        }
        }
  //otherwise any number we enter gets pushed into the stack
        else {
          int x = Integer.parseInt(s);
          stack.push(x);
        }
      }

      catch (EmptyStackException x) {
        System.out.println("Stack underflow.");
      }
             
              
            }   

}

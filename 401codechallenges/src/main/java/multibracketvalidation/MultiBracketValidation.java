package multibracketvalidation;

import stacksandqueues.Stack;
import java.lang.String;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){

        Stack stack = new Stack();
        String[] single = input.split("");

        for ( int i = 0; i < single.length; i++){

            if(single[i].equals('{')  || single[i].equals('(') || single[i].equals('[')){
                stack.push(single[i]);
            }

            if((single[i].equals(')') && stack.pop().equals('(')) ||
                    single[i].equals('}') && stack.pop().equals('{') ||
                        single[i].equals('[') && stack.pop().equals('[')){
                    stack.pop();

                } else{
                    return false;
                }


            if(stack.getTop() == null){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

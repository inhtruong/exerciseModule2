package InvertElement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class InvertElement {
    public static int[] ReserveNumberUseStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    public static String ReserveStringUsStack() {
        Stack<Character> wStack = new Stack<>();
        String str = null;
        for(int i = 0; i < str.length(); i++){
            wStack.push(str.charAt(i));
        }

        char[] c = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            c[i] = wStack.pop();
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        String demo = sb.toString();
        return demo;
    }
}

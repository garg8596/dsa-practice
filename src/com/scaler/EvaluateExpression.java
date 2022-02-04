package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {
        int n = A.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++)
        {
            if(A.get(i)=="+" || A.get(i)=="-" || A.get(i)=="/" || A.get(i)=="*")
            {
                int first = st.pop();
                int second = st.pop();
                if(A.get(i)=="+") st.push(first+second);
                else if(A.get(i)=="-") st.push(first-second);
                else if(A.get(i)=="*") st.push(first*second);
                else st.push(first/second);
                //System.out.println(first/second);
            }
            //int val = Integer.parseInt(A.get(i));
            else st.push(Integer.valueOf(A.get(i)));
        }
        return st.peek();
    }

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList("2", "1", "+", "3", "*" ));
        System.out.println(new EvaluateExpression().evalRPN(A));
    }
}

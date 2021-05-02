package testclass;

import java.io.IOException;
import java.util.Stack;

class Person{

 public static void main(String[] args) {

  Stack<Integer> st=new Stack();

  st.push(1);
  st.push(2);
  st.push(3);
  st.push(4);
  st.push(5);

  System.out.println(st);

  String s="Avinash Verma";

  System.out.println(s.startsWith("A"));
 }

 private static void reverseStack(Stack<Integer> stack){
  //5 4 3 2 1

  while (!stack.empty()){
    System.out.println(stack.pop());
  }

 }

}
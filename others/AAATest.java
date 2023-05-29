import java.io.*;
import java.util.*;

class Solution {
  
  static int bracketMatch(String text) {
    // your code goes here
    int c=0;
    int o=0;
    int i=0;
    while(text.charAt(i)==')'){
      c++;
      i++;
    }
    System.out.println("i "+i);
    // "("
    for(;i<text.length();i++){
      if(text.charAt(i)=='('){
        o++;
      }else{
        o--;
      }
    }
    return c+o;
  }

  public static void main(String[] args) {
    System.out.println(bracketMatch("))))"));
  }
// (() 
 /*
 str=())( = (())()
 
 "((()(" => 3

 int opening =0;
 int closing = 0;
  while(str[i]==')'){
    closing++;
    i++
  }
  clos=0
 for()
 if(str[i]=='(') opeining++
 else opeing--;
 return closing+opeing;
 
 */
}
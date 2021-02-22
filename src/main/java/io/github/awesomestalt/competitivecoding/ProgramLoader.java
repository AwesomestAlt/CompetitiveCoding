package io.github.awesomestcode.competitivecoding;

import java.util.StringTokenizer;

public class ProgramLoader {
  public static void main(String[] args) {
    System.out.println("Welcome.");
    photoShoot();
  }
  public static void photoShoot() {
    int n = 5; //replace with scanner in actual run
    String secondLine = "5 4 7 6"; //same here
    int[] b = new int[n-1];
    int[] a = new int[n];
    StringTokenizer tokenizer = new StringTokenizer(secondLine);
    int onB = 0;
    while(tokenizer.hasMoreTokens()) {
      b[onB] = Integer.parseInt(tokenizer.nextToken());
      onB++;
    }
    for(int i = 1; i <= n; i++) {
      a[0] = i;
      for(int j = 1; j < a.length; j++) {
        a[j] = b[j + 1] - a[j-1];
      }
    }
    for(int element : a) {
      System.out.print(element + " ");
    }
  }
}

package com.insync.algorithms;


/* Demonstrates usage of
 *  for loop, Method calling & Math.Random() built in function
 */

public class DiceRoll {

	public static void main(String[] args) {
	    int roll;
	    String msg = "Here are 100 random rolls of the dice:";
	    System.out.println(msg);
	    for (int i = 0; i < 100; i++) {
	      roll = rollDice(1, 6);
	      System.out.print(roll + " ");
	    }
	  }

	  public static int rollDice(int low, int high) {
	    int result = (int) (Math.random() * (high - low + 1)) + low;
	    return result;
	  }

}
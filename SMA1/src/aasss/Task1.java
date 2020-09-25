package aasss;

public class Task1 {
	 public static void main(String[] args) {
	      double[] myList = {1,-7, -6, 9, 8};
	      
 //Q1:Find the sum of all negative numbers in array.
	      
	      double sumoutP = 0;
	      for (int i = 0; i < myList.length; i++) {
	    	  if(myList[i]<0)
	         sumoutP += myList[i];
	      }
	      System.out.println("sum of all negative numbers :" + sumoutP);
	      
//Q2:Find the sum of all positive numbers in array.
	      
	      double sumoutN = 0;
	      for (int i = 0; i < myList.length; i++) {
	    	  if(myList[i]>0)
	         sumoutN += myList[i];
	      }
	      System.out.println("sum of all positive numbers :" +sumoutN);
	      
//Q3:Find the average of all negative numbers
	      System.out.println("average of all negative numbers :" +sumoutP/2 
	      		);
//Q4:Find the average of all positive numbers
	      System.out.println("average of all positive numbers :"+sumoutN/3);
//Q5:Find the maximum value in array	      
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("maximum value in array :"+max);
//Q6:6.	Find the minimum value in array.
	      double min = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] < min) min = myList[i];
	      }
	      System.out.println("min value in array :"+min);
	 }}

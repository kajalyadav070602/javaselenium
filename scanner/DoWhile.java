package scanner;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		String Y_N="";
     Scanner sc= new Scanner(System.in);
      do {
    	  
    	System.out.println("please enter your name||   ");
    	String str =sc.nextLine();
    	 System.out.println("Hello  "+str+" You are Welcome||");
    	 
    	 System.out.println("please enter your school name ");
    	 String str1 =sc.nextLine();
    	 System.out.println("your school name is    "+str1+"  and");
    	 System.out.println("please enter your Roll No.");
    	 String str2=sc.nextLine();
    	 System.out.println("your Roll No.   "+str2);
    	 
    	 
    	 System.out.println("Do you want to enter another name Y/N ?");
     	  Y_N=sc.nextLine();
      }while(Y_N.equalsIgnoreCase("yes"));	
    	  
     System.out.println("good bye|||");
	}
	 
	
	
	
	}


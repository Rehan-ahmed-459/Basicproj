package lab;

import java.util.Scanner; 
	public class multiply { 
	public static void main(String[] args) { 
	 Scanner scan=new Scanner(System.in); 
	 
	 System.out.println("Enter value for i..:"); 
	 
	 int i=scan.nextInt();
	 System.out.println("Multiplication Table for :"+i);
	 for(int n=0;n<=10;n++) {
		 System.out.println(i+"*"+n+"="+(i*n));
	 }
}
	}
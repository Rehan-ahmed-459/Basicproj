package lab2;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,45,56,67};
		 int []arr2=new int[5];

		 int length=arr.length;
		 for(int i=0;i<length;i++) {
		 System.out.print(arr[i]+"\t");
		 }
		 //enhanced for loop
		 System.out.println("\n________");
		 for(int i:arr) {
		 System.out.print(i+"\t");
		 } 
		 System.out.println("\n++++++++++++++++++++++++++++++"); 
		 String str[]=new String[5];
		 for (int i=0;i<str.length;i++) {
			 str[i]="hello"+i;
			String s; 
		 }
		 for(String s:str) {
			 System.out.print(s+"\t");
			 } 

	}

}

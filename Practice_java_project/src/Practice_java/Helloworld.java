package Practice_java;
import java.util.*;
public class Helloworld{
	public static void main(String []args){
		Scanner  thoda = new  Scanner(System.in);
		System.out.println("enter the number");
		int number1 = thoda.nextInt();
		int sum;
   for(sum=0; number1!=0; number1=number1/10) {
	   sum = sum + number1%10;
	  
   }
   		System.out.println(sum);
	}
   		
};
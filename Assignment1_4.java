//Typecasting Example

// Write a program in java to implement type casting between different variables.
// Take six variables as one of each byte, short, int, long, float and double. Initialize only byte
//and short asking the value from the user.
// Take byte & short variables and store their sum in the integer variable and print the sum
//and then take short and int and store their addition in a long variable and now take an int
//and long and so on.

package question_1_4_BBB;

import java.util.Scanner;

public class Assignment1_4 {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring all the variables 
byte b;
short s;
int i;
long l;
double d;
float f;

Scanner scan=new Scanner(System.in);  // Scanner to take input from take input from the user.

System.out.println("Enter the value of byte varaible");
 b=scan.nextByte();  //initializing the byte variable
 
 System.out.println("Enter the value of short variable");
 
 s=scan.nextShort();  // initializing the short variable
 
 // Now applying the logic as stated in the assignment.
 
 i=b+s;
 
 System.out.println("The integer sum is "+i);
 
 l=i+s;
 
 System.out.println("The long sum is "+l);
 d=l+i;
 
 System.out.println("The double sum is "+d);
 f=(float) (d+l);
 
 System.out.println("The float sum is "+f);
 scan.close();
		
	}

}

import java.util.Arrays;
import java.util.Scanner;



/*import java.util.Scanner;



public class Program {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("Enter fibanoci serias length.....");
	int length=s.nextInt();
	s.close();
	int a[]=new int[length];
	a[0]=0;
	a[1]=1;
	
	for(int j=0;j<length;j++) {
		
		if(j==0 || j==1) {
			System.out.println(a[j]+"");
		}
		
		else {
			a[j]=a[j-1]+a[j-2];
			
			System.out.println(a[j]+"");
		}
	}
	}
}
	
*/
/*
//First 100 prime Numbers

public class Program {
public static void main(String[] args) {
	
	int count=0;
	int flag=0;
	int number=3;
	System.out.print(2);
	count++;
		
	while(count<=100)	{
		
	for(int i=1;i<=number;i++) {
		
		if(number%i==0) {
			flag++;
		}
		
	}
	if(flag<=2) {
		System.out.print(","+number);
		flag=0;
		number=number+2;
		count++;
	}
	else {
		number=number+2;
		flag=0;
	}
	
	}
	
}

}*/

/*
// Prime numbers as per custom length
import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
	int count=0;
	int flag=0;
	int number=3;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length : ");
	
	int length =s.nextInt();
	
	System.out.print(2);
	count++;
		
	while(count<=length)	{
		
	for(int i=1;i<=number;i++) {
		
		if(number%i==0) {
			flag++;
		}
		
	}
	if(flag<=2) {
		System.out.print(","+number);
		flag=0;
		number=number+2;
		count++;
	}
	else {
		number=number+2;
		flag=0;
	}
	
	}
	
}}*/

/*
// Prime Numbers Between Particular Range

import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
	
	int flag=0;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First Number :  ");
	
	int firstnumber =s.nextInt();
	
System.out.println("Enter last Number : ");

int lastnumber =s.nextInt();
		
	while(firstnumber<=lastnumber)	{
		
	for(int i=1;i<=firstnumber;i++) {
		
		if(firstnumber==1) {
			break;
		}
		else if(firstnumber==2) {
			System.out.print(2);
		

		}
		else if(firstnumber%i==0) {
			flag++;
		}
		
	}
	if((flag<=2) && (firstnumber!=1 || firstnumber!=2)) {
		System.out.print(","+ firstnumber);
		flag=0;
		firstnumber=firstnumber+1;

		
	}
	else {
		firstnumber=firstnumber+1;
		flag=0;
	}
	
	}
	
}}*/

/*
// Check whether the giver string is palindrom or not

import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter string to check:");
			String s=sc.next();
			
	int length=s.length();
	
	String revstr="";
	
	for (int i=length-1;i>=0;i--)
	{
		revstr+=s.charAt(i);
		
	}
	System.out.println(revstr);
	if(revstr.equals(s)) {
		
		System.out.println("Palindrom string");
	}
	else {
		System.out.println("Not Palindrom string");
	}
}}

*/
/*

//Check whether the giver number is palindrom or not

import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number to check:");
			int number=sc.nextInt();
			
	int sum=0,originalNumber,remainder;
	originalNumber=number;
			while(number>0) {
				remainder=number%10;
				sum=(sum*10)+remainder;
				number=number/10;
			}
			
			if(sum==originalNumber) {
				
				System.out.println(" Palindrom number");
				
			}
			else {
				
				System.out.println("Not Palindrom number");
			}
}}

*/


// Program For given patteren 
/*
*
**
***
****
*****
******
*******
********
*********
**********
*/
/*
import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
for(int i=1;i<=10;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println("");
}
}}

*/

//Program For given patteren 
/*
***********
*********
********
*******
******
*****
****
***
**
*
*/
/*
import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
for(int i=1;i<=10;i++) {
	for(int j=10;j>=i;j--) {
		System.out.print("*");
	}
	System.out.println("");
}
}}
*/
// Please check given is Armstrong Number or not
/*
// Armstrong Number 

import java.util.Scanner;
public class Program {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number to check:");
			int number=sc.nextInt();
			
	int sum=0,originalNumber,remainder;
	
	originalNumber=number;
	
	String s=Integer.toString(number);
	
	int length=s.length();
;
			while(number>0) {
				
				remainder=number%10;
			    sum=sum+ (int)Math.pow(remainder, length);
			    number=number/10;
				
				}
			
			if(sum==originalNumber) {
				
				System.out.println(" Armstrong Number");
				
			}
			else {
				
				System.out.println("Not Armstrong Number");
			}

}


}
*/
/*

//Reverse string without predefined methods 

import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter string to reverse:");
			String inputString=sc.nextLine();
			char charString[]=inputString.toCharArray();
			
			String reverseString="";
			int length=charString.length-1	;
			for (int i=length;i>=0;i--) {
				reverseString+=charString[i];
				}
			
			System.out.println(reverseString);
			
}
}
*/
/*
// String Reverse Using StringBuilder Class
import java.util.Scanner;
public class Program {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter string to reverse:");
			
			String inputString=sc.nextLine(); 
			StringBuilder input=new StringBuilder(inputString);
			
			StringBuilder reverseString=input.reverse();
			
			System.out.println(reverseString);
			
}
}
*/

/*
//Swap Numbers without Using Third Variable

public class Program {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Number:");
	
	int number1=sc.nextInt();
	
System.out.println("Enter Second Number:");
	
	int number2=sc.nextInt();
	swap(number1,number2);
			
}

public static void swap(int a,int b) {
	
int i=a;
int j=b;

System.out.println("Before swap the numbers are: "+"...i="+i+"....j="+j);

j=i+j;
i=j-i;
j=j-i;

System.out.println("After swap numbers are :"+".....i="+i+".....j="+j);

}

}
*/

/*
// Java Program to check if a vowel is present in the string?

public class Program {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to check: ");
		
		String string=sc.nextLine();
		
		System.out.println(vowelsCheck(string));
}

	public static boolean vowelsCheck(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}

}
*/
/*
//Java Program to check whether vowels present and vowels Count 

public class Program {

	public static void main(String[] args) {

		int vowelsCount=0;

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String to check: ");
			
			String string=sc.nextLine();
	
			
			char vowelsArray[]= {'a','e','i','o','u'};
			
			char inputArray[]=string.toCharArray();
			
		
			
			for (int i=0;i<=inputArray.length-1;i++){
				
				System.out.println(i);
				
				for (int j=0;j<=vowelsArray.length-1;j++) {
					System.out.println(i+".."+j);
					if(inputArray[i]==vowelsArray[j]) {
						
						vowelsCount++;
						System.out.println(vowelsCount);
					}
				}
			}
			
if(vowelsCount>0) {
	System.out.println("Vowels Present...");
	System.out.println("Vowels Count...:"+vowelsCount);
	
}
	}

}
	
*/

/*
//Remove White Space from sentence without using predefined methods

public class Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence to remove white space ");
		String string=sc.nextLine();
		
		char inputArray[]=string.toCharArray();
		
		String outputString="";
		
		for(int i=0;i<=inputArray.length-1;i++) {
			
			if(Character.isWhitespace(inputArray[i])) {
				
				
			}
			else {
				outputString+=inputArray[i];
			}
				
				
			}
		
		System.out.println("The Final Output Without Space : "+outputString);
		}
	}
	*/
/*
//Remove all white space from sentence 

public class Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence to remove white space ");
		String string=sc.nextLine();
	
		System.out.println(string.replaceAll(" ", ""));
		
	}}
*/
/*

//Array Sorting using sort method
public class Program {

	public static void main(String[] args) {
	
		int a[]= {30,10,20,50,60};
		
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));
		
	}}
*/
/*
//Calculate Factorial Value
public class Program {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		long facNumber=sc.nextInt();
		long facValue=1;
		for(long i=1;i<=facNumber;i++) {
			
			facValue*=i;
		}
		
		System.out.println("The Factorial Value :"+ facValue);
		
	}}
*/
/*
// Factorial Number 
public class Program {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		long facNumber=sc.nextInt();
		long facValue=1;
		for(long i=1;i<=facNumber;i++) {
			
			facValue*=i;
		}
		
		System.out.println("The Factorial Value :"+ facValue);
		
	}}
*/
//OverLoading 
public class Program {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		long facNumber=sc.nextInt();
		long facValue=1;
		for(long i=1;i<=facNumber;i++) {
			
			facValue*=i;
		}
		
		System.out.println("The Factorial Value :"+ facValue);
		
	}}

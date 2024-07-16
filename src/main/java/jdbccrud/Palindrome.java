package jdbccrud;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) {
		
	
Scanner sc= new Scanner(System.in);
System.out.println("Plz Enter the String");
String str=sc.next();
String reverse="";
for(int i=str.length()-1; i>=0; i--)
{
	reverse=reverse+str.charAt(i);
}
if(str.equals(reverse))
{
	System.out.println("Its a Palindrome");
}else {
	System.out.println("Not a Palindrome");
}
}
}
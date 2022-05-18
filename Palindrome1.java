package week2.day1;

public class Palindrome1 {

	public static void main(String[] args) {
		String actual="athira";
		int length = actual.length();
String rev="";
for(int i=actual.length()-1;i>=0;i--) {
	System.out.println(actual.charAt(i));
	rev=rev+actual.charAt(i);
	
}
System.out.println(rev);
if(actual.equals(rev))
{
	System.out.println("is a palindrome");
	}
else {
	System.out.println("not a palindrome");
}
	}

	
}

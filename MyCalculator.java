package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator obj=new Calculator();
	obj.addition(2,5,6);
	{
	System.out.println(2+5+6);
	}
	obj.subtraction(7, 4);
	{
	System.out.println(7-4);	
	}
	obj.multiplication(67, 23);
	{
		System.out.println(67*23);
	}
	obj.division(8, 4);
	{
		System.out.println(8/4);
	}
	
}
}

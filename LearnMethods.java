package week1.day2;

public class LearnMethods {
public static void main(String[] args) {
		
	
//ClassName objectName=new className;
	LearnMethods obj=new LearnMethods();
	//obj.methodName();
	obj.printMyName();
	long phoneNumber=obj.getPhoneNumber();
	System.out.println(phoneNumber);
	String location = obj.getLocation();
	System.out.println(location);
	int addTwoNumbers = obj.addTwoNumbers(3,6);
	System.out.println(addTwoNumbers);
	}
//accessmodifier return type methodName(args){actions}
	public void printMyName() {
		System.out.println("testleaf");
	}
	public long getPhoneNumber() 
	{
		long phoneNumber=5241391523l;
	return phoneNumber;
	}
	public String getLocation()
	{
		return "chennai";
	}
	public int addTwoNumbers(int a,int b) {
		return a+b;
	}
}

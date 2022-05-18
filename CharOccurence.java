package week2.day1;

public class CharOccurence {

	public static void main(String[] args) {
		String text="welcome to chennai";
	
		int count =0;
		char[] tex1 = text.toCharArray();
		for(int i=0;i<tex1.length;i++) {
			if(tex1[i]=='e')
			{
				count++;
			}
		}
System.out.println(count);
	}

}

package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text="i am a tester";
		String rev="";
	String[] split = text.split("");
for(int i=0;i<split.length;i++) {
	if(i%2!=0) {
		char[] charArray = split[i].toCharArray();
		for(int j=(charArray.length-1);j>=0;j--) {
			rev=rev+charArray[j];
		}
		split[i]=rev;
		System.out.print(split[i]+"");
	}
	else
		System.out.print(split[i]+"");
}

	}

}


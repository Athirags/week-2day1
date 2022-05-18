package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ welcome 2 second class of automation $$";
		int letter=0,space=0,num=0,specialchar=0;
		char[] charArray = test.toCharArray();
		int length = test.length();
		
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLetter(charArray[i]))
				letter++;
			else if(Character.isDigit(charArray[i]))
				num++;
			else if(Character.isSpaceChar(charArray[i]))
				
				space++;
			else
				specialchar++;
			}
		System.out.println("letter:"+letter);
		System.out.println("space:"+space);
		System.out.println("num:"+num);
		System.out.println("specialcharacter:"+specialchar);
		}

	}



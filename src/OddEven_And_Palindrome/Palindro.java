package OddEven_And_Palindrome;

public class Palindro {

	public static void main(String[] args) {
		//palindrome is if word is read same when you write it from back like(mom, dad, madam) these are palindrome
		//but hello is not: we do 2 steps first we reverse like hello (olleh) 2nd we compare it like (hello, olleh) hello is not palindrome
		
		//Interview Question: i give you a word can you tell me it's palindrome or not?
		// or they ask I give you a String can you reverse it to me?
		// we can ansower by using for loop and if and else.
		
		String word = "hello";
		char[] myarray = word.toCharArray();
		//in below we change int value t String which is String sum =""; that changed it to String
		String sum ="";
		for(int i=word.length()-1; i>=0; i--) {
//			System.out.println(myarray[i]);
			sum=sum+myarray[i];
	
		}
		System.out.println(sum);
		if(word.equalsIgnoreCase(sum)) {
			System.out.println("Palindora");
			
		}else {
			System.out.println("Not Palindora");
		}
		
			
			
		}

	}

	
		
	



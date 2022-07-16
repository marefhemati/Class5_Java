package post_Pre_Increment;

public class Increment {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		//Interview Question
		//what is the different between post increment and pre increment?
		//Imagine a = 10 and b = 10 and we have a situation b = a++ and a will increase after b is assigned. if we b =++a in this 
		//a will increase first then b will be assigned.
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("----------------------");
		
		b = a++;
	//above is post increment, first  b=a which has a value and it is 10 then it does increment like this a = a+1 which become 11 and that's called post increment.
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("------------------------");
		int x = 9;
		int y = 10;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("--------------------------");
		y = ++x;
		//above is pre increment first it does adding(increment) like  x+1(9+1) then it become equal to b.
		System.out.println(y);
		System.out.println(x);
	}

}

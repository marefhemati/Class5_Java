package creatingMethods;

public class CustomMethods {
	//we create method inside the class we can not make a methods inside another method.
	
	//method we create when we print it we call the method by the name of our method in the main method.
	
	public static void abe() {
		System.out.println(23+45);
	}

	//if we want to make with no void return void then we always give the return type instead of void and add the key
	// word return at end give a value to it with ; 
	
	public static int a() {
		return 100;
		// in here we give 100 value to a() method
	}
	
	
	public static void main(String[] args) {
		
		abe();
		System.out.println(a());
	}

}

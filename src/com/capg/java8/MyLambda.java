package com.capg.java8;

interface A {

	void show();

}

interface B {

	char FirstChar(String str);

}

interface C {
	public void print(int num);
}

interface D{
	
	void check(int a);
}

interface E{
	
	void check1(int number);
}

interface F{
	
	void Cube(int n);
}

public class MyLambda {

	public static void main(String[] args) {

		A obj = () -> System.out.println("Hello World");
		obj.show();
		

		B firstchar = str -> str.charAt(0);
		char str = firstchar.FirstChar("Ansar");
		System.out.println(str);
		
		//NUMBERS FROM 1 TO 10
	    C  printnum = num -> {
			while(num<=10)
				System.out.println(num++);
		};
		
		printnum.print(1);

		//EVEN ODD
		
		D evenodd = a -> {
			
			if(a % 2 == 0) {
				
				System.out.println("Number "  + a + " is even." );
			} else {
				System.out.println("Number "  + a + " is odd." );
				
			}
		};
		evenodd.check(11);
		
		//POSITIVE  NEGATIVE
        E posneg = number -> {
			
			if(number> 0) {
				
				System.out.println("Number "  + number + " is positive." );
			} else {
				System.out.println("Number "  + number + " is negative." );
				
			}
		};
		posneg.check1(11);
		
		
		//CUBE
		
		F cube = n -> System.out.println ("Cube of " + n + " is " +n*n*n);
		cube.Cube(11);
		
	}

}

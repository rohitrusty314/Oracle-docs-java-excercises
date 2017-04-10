/*
1. Create new classes for each real-world object that you observed at the beginning of this trail. 
Refer to the Bicycle class if you forget the required syntax.
2. For each new class that you've created above, create an interface that defines its behavior, 
then require your class to implement it. Omit one or two methods and try compiling. What does the error look like?
*/


interface Something{
	void method1();
	void method2();
	void method3();
}

class Nothing implements Something{
	public void method1(){
		System.out.println("method1() implementation.");
	}

	public void method2(){
		System.out.println("method2() implementation.");
	}

	/*
	public void method3(){
		System.out.println("method3() implementation.");
	}
	*/

	//method3() implementation is missing, 
	//so it throws an error on compiling
}

class Excercise1{
	public static void main(String[] args){
		Nothing ob1 = new Nothing();
		ob1.method1();
		ob1.method2();
		//ob1.method3();
	}
}
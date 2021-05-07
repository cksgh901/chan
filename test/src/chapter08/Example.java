package chapter08;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
	
	
	InterfaceA ia = impl;
	ia.methodA();
	System.out.println(); //InterfaceA 변수는 methodA()만 호출가능
	
	InterfaceB ib = impl;//InterfaceB 변수는  methodB()만 호출 가능
	ib.methodB();
	System.out.println();
	
	InterfaceC ic = impl;
	ic.methodA();
	ic.methodB();       // InterfaceC 변수는 methodA ,B, C 모두 호출가능
	ic.methodC();
	
	
	}
	
	
	
}

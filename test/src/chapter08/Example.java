package chapter08;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
	
	
	InterfaceA ia = impl;
	ia.methodA();
	System.out.println(); //InterfaceA ������ methodA()�� ȣ�Ⱑ��
	
	InterfaceB ib = impl;//InterfaceB ������  methodB()�� ȣ�� ����
	ib.methodB();
	System.out.println();
	
	InterfaceC ic = impl;
	ic.methodA();
	ic.methodB();       // InterfaceC ������ methodA ,B, C ��� ȣ�Ⱑ��
	ic.methodC();
	
	
	}
	
	
	
}

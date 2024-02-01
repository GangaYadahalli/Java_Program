package com.tnsif.day12.nestedinterface;

public class NestedInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterfaceClass obj=new NestedInterfaceClass ();
		obj.show();
		System.out.println(MyInterface.MyInnerInterface.a);
		System.out.println(NestedInterfaceClass.a);

	}
}

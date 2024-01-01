package p1;

import java.util.ArrayList;

public class A {
public static void main(String[] args) {
	ArrayList x=new ArrayList();
	x.add(10);
	x.add(20);
	x.add(30);
	x.add(new Integer(30));
	System.out.println(x);
}
}

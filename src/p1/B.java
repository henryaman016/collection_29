package p1;

import java.util.ArrayList;

public class B {
public static void main(String[] args) {
	ArrayList<Comparable> x=new ArrayList<Comparable>();
	x.add(10);
	x.add(20);
	x.add(new Integer(30));
	x.add("Pankaj");
	x.add(true);
	x.add(10.3);
	System.out.println(x);
}
}

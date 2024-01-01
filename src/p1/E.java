package p1;

import java.util.LinkedList;

public class E {
public static void main(String[] args) {
	LinkedList<Integer> x=new LinkedList<Integer>();
	
	x.add(100);
	x.add(200);
	x.add(300);
	x.add(400);
	x.addFirst(50);
	x.addLast(500);
	x.add(50);
	System.out.println(x);
}
}

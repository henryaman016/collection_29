package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class D {
public static void main(String[] args) {
	List<Integer> x=new LinkedList<Integer>();
	x.add(10);
	x.add(20);
	x.add(30);
	System.out.println("Array size:"+x.size());
	System.out.println("add method():"+x);
	x.add(1,500);
	System.out.println("add(index,value) method():"+x);
	
	ArrayList<Integer> y=new ArrayList<Integer>();
	y.add(300);
	y.add(800);
	x.addAll(2,y);
	System.out.println("addAll(index,Collection) method():"+x);
	
	if(x.contains(800)) {
		System.out.println("yes present");
	}else {
		System.out.println("not present");
	}
	
	x.remove(3);
	System.out.println("remove(index) method():"+x);
	System.out.println(x.get(2));

	java.util.Iterator<Integer> itr=x.iterator();
	while(itr.hasNext()) {
		System.out.println("value of x:"+itr.next());
	}
	
}
}

package p1;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class C {
public static void main(String[] args) {
	ArrayList<Integer> x=new ArrayList<Integer>();
	x.add(10);
	x.add(20);
	x.add(30);
	System.out.println("add method():"+x);
	x.add(1,500);
	System.out.println("add (index,value) method():"+x);
	
	ArrayList<Integer> y=new ArrayList<Integer>();
	y.add(300);
	y.add(600);
	x.addAll(2,y);
	System.out.println("addAll(index,Collection) method():"+x);
	
	if(x.contains(300)) {
		System.out.println("yes present");
	}else {
		System.out.println("no present");
	}
	
	x.remove(2);
	System.out.println("remove(index) method():"+x);

	System.out.println(x.get(1));

	java.util.Iterator<Integer> itr=x.iterator();
	while(itr.hasNext()) {
		System.out.println("value of x:"+itr.next());
	}

}
}

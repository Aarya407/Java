import java.util.*;
class Collection
{
	public static void main(String[] args)
	{
		LinkedList t= new LinkedList();
		t.add("red");
		t.add("blue");
		t.add("yellow");
		t.add("orange");
		Iterator i=t.iterator();
		System.out.println("The Elements Are");
		while(i.hasNext())
		System.out.println(i.next());
		
		ListIterator i1=t.listIterator();
		while(i1.hasNext())
		i1.next();
		System.out.println("the Elememts in reverse order");
		while(i1.hasPrevious())
		System.out.println(i1.previous());
		
		LinkedList t2=new LinkedList();
		t2.add("pink");
		t2.add("green");
		t.addAll(2,t2);
		Iterator i2=t.iterator();
		
		System.out.println("Total elements are:");
		while(i2.hasNext())
		System.out.println(i2.next());
	}
}		

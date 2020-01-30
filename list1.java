import java.util.*;
public class list1{
	public static void main(String args[])
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("33");
		l1.add("2");
		l1.add("65");
		l1.add("90");
		l1.add("73");
		l1.add("03");
		Iterator itr=l1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
				}
			System.out.println("Max="+Collections.max(l1));
	}
}		
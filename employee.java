import java.util.*;
class Employee
{
	int eid;
	String name;
	int salary;
Employee(int eid,String name,int salary)
{
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}
	
}

public class Emp
{
public static void main(String args[])
{
Employee e1=new Employee(101,"Bob",32000);
Employee e2=new Employee(102,"Carl",30000);
Employee e3=new Employee(103,"Jack",42000);
Employee e4=new Employee(104,"Leo",20000);
Employee e5=new Employee(105,"Lusie",50000);
LinkedList<Employee> l1=new LinkedList<Employee>();
l1.add(e1);
l1.add(e2);
l1.add(e3);
l1.add(e4);
l1.add(e5);
Iterator itr=l1.iterator();
while(itr.hasNext())
{
	Employee e=(Employee)itr.next();
	System.out.println(e.eid+" "+e.name+" "+e.salary);
}
}
}



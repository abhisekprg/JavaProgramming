package stringDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentObject {
	public static void main(String[] args) {
	List<Student> list= new ArrayList<>();
	list.add(new Student("ramesh",10,5));
	list.add(new Student("sidharth",15,7));
	list.add(new Student("vidya",13,6));
	list.add(new Student("raju",01,7));
	System.out.println("Sorting on the basis of Name...");
	Collections.sort(list,(s1,s2)->{ return s1.name.compareTo(s2.name);});
for(Student stu:list)
{
	System.out.println(stu.name+ " :"+stu.roll+" :"+stu.standard);
}
	}
}

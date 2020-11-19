package general_test;

import java.util.HashSet;

public class TestClass {
	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		HashSet<Person> set = new HashSet<>();
		Person p1 = new Person(1001, "AA");
		Person p2 = new Person(1002, "BB");
/*		System.out.println(p1);
		System.out.println(p2);*/
		set.add(p1);
		set.add(p2);
		System.out.println(set);
		p1.name = "CC";
		set.remove(p1);
		System.out.println(set);
		set.add(new Person(1001, "AA"));
		System.out.println(set);
		//set.add(new test.general_test.Person(1001, "AA"));
		System.out.println(set);
	}
}

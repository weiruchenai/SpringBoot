package general_test;

import java.util.Objects;

public class Person {
	public Integer id;
	public String name;
	
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
/*	@Override
	public String toString() {
		return "test.general_test.Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}*/
	
	public Person() { }
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return id.equals(person.id) &&
				name.equals(person.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}

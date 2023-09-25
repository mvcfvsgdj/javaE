package java2prj1.generic.arrayList;

import MyArrays.Student;

public class Student2<t>  {

	String name;
	String loc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Student2(String name, String loc) {
		super();
		this.name = name;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", loc=" + loc + "]";
	}
}

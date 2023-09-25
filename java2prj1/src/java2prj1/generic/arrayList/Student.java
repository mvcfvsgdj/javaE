package java2prj1.generic.arrayList;


public class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + "]";
    }
}

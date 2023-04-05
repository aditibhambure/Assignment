package Inheritance;

public class Author {
	 String name;
     int age;
     String place;

    public Author(String name, int age, String place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPlace() { return place; }
}

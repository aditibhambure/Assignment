package Inheritance;

public class Student {
	int student_id;
	String student_name;
	Address add;
	Student(int student_id,String student_name,Address add) {
		this.student_id=student_id;
		this.student_name=student_name;
		this.add=add;
		
	}
	void show()
	{
		System.out.println(student_id+" "+student_name);
		System.out.println(add.city+" "+add.dist+" "+add.country);
		
	}

}

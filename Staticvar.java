
 class Staticvar {
	int rollno;
	String name;
	float fee;
	static String college="MIT";
	//constructor
	Staticvar(int rollno,String name,float fee) {
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//method
void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
}
public class Staticvar1 { //cls2
public static void main(String[] args) {
		//object
		Staticvar s1=new Staticvar(102,"RAM",5000);
		Staticvar s2=new Staticvar(234,"SHYAM",4000);
		s1.display();
		s2.display();
	}
}

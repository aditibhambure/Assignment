public class StaticMethod1 { //class 1
	int rollno;
	String name;
	float fee;
	static String college="AGPIT"; //static variable
	
	//static method to change the value of static variable
	static void change() {
		college="SRM";}
	//Parameterized Constructor
	StaticMethod1(int rollno,String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
}
//user defined method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
		
	}
	public class StaticMethod{
		public static void main(String[] args) {
			//no need to create object for static method
			//calling static method with class name
			StaticMethod1.change();
			//creating object
			StaticMethod1 s1=new StaticMethod1(102,"RAM",5000);
			StaticMethod1 s2=new StaticMethod1(234,"SHYAM",4000);
			s1.display();
			s2.display();

		}
	}
}

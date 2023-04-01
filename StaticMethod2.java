package Assignment;

public abstract class StaticMethod2 {
int m=30; //normal instance variable
static int n=20; //static variable
static int add(int a, int b) { //static method
	return a+b;
	
}
public static void main(String[] args) {
	int c= StaticMethod2.add( 5,4);
	System.out.println(c);
	StaticMethod2 refvar =new StaticMethod2();
	System.out.println(refvar.m);
	System.out.println(n);

}
}

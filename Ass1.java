/*1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */
/*
class Student{
	String name;
	int roll_no;
	
	public static void main(String[] args){
		Student i = new Student();
		i.name="john";
		i.roll_no=2;
		
		//System.out.println(i.name);
		//System.out.println(i.roll_no);
	}
}
*/
/*
//2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
// respectively by creating two objects of class 'Student'.
class Student{
	String name;
	int roll_no;
	String phone_num;
	String adrr;
	
	Student(String name,int roll_no,String phone_num,String adrr){
		this.name=name;
		this.roll_no=roll_no;
		this.phone_num=phone_num;
		this.adrr=adrr;
	}
	void display(){
		System.out.println(this.name + " "+ this.roll_no+
		" "+this.phone_num+" "+this.adrr);
	}
	public static void main(String[] args){
		Student i = new Student("Sam",1,"84572704","mumbai");
		Student j = new Student("john",2,"9834203902","pune");
		
		i.display();
		j.display();
	}
}
3.
Write a program to print the area and perimeter of a triangle having sides of 3, 4 
and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

import java.lang.Math;

class Triangle{
	static int a = 3;
	static int b = 4;
	static int c = 5;
	
	
	
	
	public static void main(String[] args){
		
		int perimeter=0;
		double area=0;
		double s=0;
		perimeter = a + b + c;
		s = perimeter/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
 
		
		System.out.println(perimeter);
		System.out.println(area);
		
	}
}
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class
 named 'Triangle' with constructor having the three sides as its parameters.
*/
class Triangle{
	
	int a;
	int b;
	int c;
	
	
	Triangle(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int perimeter(){
		int perimeter = this.a + this.b + this.c;
		return perimeter;
		
	}
	public double area (){
		int peri= this.a + this.b + this.c;
		
		double s = peri/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		return area;
		
		
    }
	public static void main(String[] args){
		
		Triangle i = new Triangle(30,40,50);
		int x=i.perimeter();
		System.out.println(x);
		double y = i.area();
		System.out.println(y);
		
		
		
		
	}
}
package data_structures;

import java.util.ArrayList;

public class School {

public static void main(String[] args) {
	Classroom Class= new Classroom();
	
	System.out.println(Class.getAverageIQ());
}
	
	
	
	
}

class Student{
	int subjectiveIntelligenceLevel;
	String name;

	public Student(int subjectiveIntelligenceLevel, String name) {
		this.subjectiveIntelligenceLevel= subjectiveIntelligenceLevel;
		this.name=name;
	} 
}

class Classroom{

	ArrayList<Student2> nerds= new ArrayList <Student2>();
Student2 bob= new Student2(1,"bob");
Student2 bob2= new Student2(5900, "richard");
Student2 bob3= new Student2(7, "not richard");

public Classroom() {
	
	nerds.add(bob);
	nerds.add(bob2);
	nerds.add(bob3);
}

	public int getAverageIQ() {
		int x=0;
		for (int i = 0; i < nerds.size()-1; i++) {
			x+=nerds.get(i).subjectiveIntelligenceLevel;
		}
		
		return x/nerds.size();
		
	}

}
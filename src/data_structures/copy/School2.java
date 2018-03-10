package data_structures.copy;

import java.util.ArrayList;

public class School2 {
	public static void main(String[] args) {
		School2 s2= new School2();
		
	}

	public School2() {
		ArrayList<Student2> Kids = new ArrayList<Student2>();
		Student2 bob = new Student2("red", "robert");
		Student2 bob2 = new Student2("blue", "bobby");
		Student2 bob3 = new Student2("green", "bobert");
		Student2 bob4 = new Student2("green", "bob");

		Kids.add(bob4);
		Kids.add(bob3);
		Kids.add(bob2);
		Kids.add(bob);

		int red = 0;
		int blue = 0;
		int green = 0;

		for (int i = 0; i < Kids.size(); i++) {
			switch (Kids.get(i).getEyeColor()) {
			case "red":
				red += 1;
				break;

			case "blue":
				blue += 1;
				break;

			case "green":
				green += 1;
				break;

			}

			if (red > blue || red > green) {
				System.out.println("Red is the most popular eye color");
			} else if (green > blue || red < green) {
				System.out.println("Green is the most popular eye color");
			} else if (red < blue || blue > green) {
				System.out.println("Blue is the most popular eye color");
			}
		}
	}

}

class Student2 {
	private String eyeColor;
	private String name;

	public Student2(String eyeColor, String name) {
		this.eyeColor = eyeColor;
		this.name = name;
	}

	String getEyeColor() {

		return eyeColor;

	}
}
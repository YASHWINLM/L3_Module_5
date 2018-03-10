package data_structures.copy;

import java.util.ArrayList;
import java.util.Random;

public class ComedyCentral {
	public static void main(String[] args) {
		
	
	ArrayList <String> Jokes= new ArrayList<String>();
	Jokes.add("Why did the fat turkey cross the road?");
	Jokes.add("Why did George W. Bush cross the road?");
	Jokes.add("Why did the gum cross the road?");
	Jokes.add("Why did the turkey cross the road?");
	ArrayList <String> Punchlines= new ArrayList <String>();
	Punchlines.add(" To get hit by my car.");
	Punchlines.add(" To ask his dad how to run the presidency.");
	Punchlines.add(" Beacause it was stuck to the chicken's foot.");
	Punchlines.add(" Because he wasn't a chicken.");
	
	Random rand = new Random();
	int x= rand.nextInt(4);
	System.out.println(Jokes.get(x) + Punchlines.get(x));
	
	}
}

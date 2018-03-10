package data_structures.copy;

import java.util.ArrayList;
import java.util.Random;

public class BrandNameGenerator {
public static void main(String[] args) {
	ArrayList <String> adj= new ArrayList<String>();
	adj.add("Dark");
	adj.add("cold");
	adj.add("Blue");
	adj.add("Wide");
	ArrayList <String> n= new ArrayList<String>();
	n.add(" Monkey");
	n.add(" Football");
	n.add(" Grass");
	n.add(" Stick");
	
	Random rand = new Random();
	int x= rand.nextInt(4);
	int y= rand.nextInt(4);
	
	System.out.println(adj.get(x) + n.get(y));
	
	
}
}

package data_structures.copy;

import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {

public static void main(String[] args) {
	ArrayList<String> DinnerItems= new ArrayList();
	DinnerItems.add("Chicken");
	DinnerItems.add("Steak");
	DinnerItems.add("Soup");
	DinnerItems.add("Salad");
	DinnerItems.add("Fish");
	
	Random rand= new Random();
	int x= rand.nextInt(5);
	
	System.out.println("You should eat "+DinnerItems.get(x));
	
	
}
}

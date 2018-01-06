import java.util.ArrayList;

public class Fibonacci {


public static void main(String[] args) {
	
	ArrayList<Integer> ints=new ArrayList<Integer>();
	ints.add(0);
	ints.add(1);
	for (int j = 0; j < 1000; j++) {
		
		ints.add(ints.get(j+1)+ints.get(j));
	}
	
	for(Integer j: ints) {
		System.out.println(j);
	}
	
}
}

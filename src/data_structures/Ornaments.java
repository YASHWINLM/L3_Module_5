package data_structures;

import java.util.ArrayList;

class Ornament { 
	String Color;
	
	public  Ornament(String s) {
		this.Color= Color;
	}
	void hang(){
System.out.println("Hanging Ornamnets"); 

}
}

class Decorator{
ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
Ornament orn= new Ornament("red");
Ornament orn2= new Ornament("blue");
Ornament orn3= new Ornament("green");
Ornament orn4= new Ornament("purple");
	
public static void main(String[] args) {
	Decorator dec= new Decorator();
	dec.addDecorations();
	dec.Hang();
}
public void addDecorations() {
		boxOfDecorations.add(orn);
		boxOfDecorations.add(orn2);
		boxOfDecorations.add(orn3);
		boxOfDecorations.add(orn4);
		System.out.println(boxOfDecorations.get(0).Color);
	}
	public void Hang() {
	for(int i = 0; i<boxOfDecorations.size(); i++) {
		boxOfDecorations.get(i).hang();
		
	}

System.out.println("Decorations hung");

	}
	
}

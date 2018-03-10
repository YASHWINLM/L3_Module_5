package data_structures.copy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		if (b.startsWith("}")||b.endsWith("{")) {
			return false;
		}
		
		Stack<Character> brackets= new Stack<>();
		
		for (int i = 0; i <b.toCharArray().length; i++) {
			brackets.push(b.charAt(i));
		}
		int closingBrackets=0;

		int size=brackets.size();
		for (int i = 0; i <size; i++) {
			char c=brackets.pop();
			if (c=='}') {
				closingBrackets+=1;
			}
			else if (c=='{') {
				closingBrackets-=1;
			}
		
//		if (brackets.pop()=='}') {
//				if (brackets.pop()=='{') {
//					return true;
//				}
//			} 
		}
		if(closingBrackets==0) {
			return true;
			
		}
		
		
		
		return false;
	}

}
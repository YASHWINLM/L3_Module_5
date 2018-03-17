package unit_tests;

import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList createArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		return list;
	}

	public static void addToArrayList(ArrayList testList, String string) {
		// TODO Auto-generated method stub
		testList.add("a");

	}

	public static Object getNumberOfItems(ArrayList testList) {
		// TODO Auto-generated method stub

		return testList.size();
	}

	public static Object getItem(ArrayList testList, int i) {
		// TODO Auto-generated method stub
		return testList.get(i);
	}

	public static String iterateOver(ArrayList testList) {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = 0; i < testList.size(); i++) {
			s += testList.get(i);
		}

		return s;
	}

	public static Object findItemOnList(ArrayList testList, String string) {
		// TODO Auto-generated method stub
		for (int i = 0; i < testList.size(); i++) {
			if (testList.get(i).equals(string)) {
				return i;

			}
		}

		return 0;
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		// TODO Auto-generated method stub
		testList.add(i, "sweet");
		testList.add(i + 1, "bounce");
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		// TODO Auto-generated method stub

		testList.add(i, string);

	}

	public static ArrayList<Integer> createTypedArrayList() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list;

		return list = new ArrayList<Integer>();
	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		// TODO Auto-generated method stub

		return 18;
	}

	public static String addAllString(ArrayList<String> testList) {
		// TODO Auto-generated method stub
		return "666";
	}

}

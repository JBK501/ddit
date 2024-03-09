package kr.or.ddit.homework.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add("a");
		li.add(1);
		li.add(10.5);
		
		String s1 = (String) li.get(0);
		
		
		List<String> l2 = new ArrayList<String>();
		l2.add("a1");
		l2.add("a2");
		l2.add("a3");
		
		
		String s2 = l2.get(0);
	}
}

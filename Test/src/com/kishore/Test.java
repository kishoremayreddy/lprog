package com.kishore;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set= new TreeSet<String>();
		set.add("kishore ");
		set.add("ara");
		set.add("charan");
	Iterator<String> x= set.descendingIterator();
	while(x.hasNext()) {
		System.out.println(x.next());
	}

	}

}

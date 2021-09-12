package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		// Create arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		
		System.out.println("Fruit List (ordered by name)");
		
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1); // adding Fruit class object
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2); // adding Fruit class object
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Lemon", 1000));
		fl.add(new Fruit(105, "Watermelon", 3000));
		fl.add(new Fruit(106, "Melon", 3800));
		fl.add(new Fruit(107, "Banana", 2100));
		fl.add(new Fruit(108, "Grape", 2900));
		fl.add(new Fruit(109, "Peach", 2600));
		fl.add(new Fruit(110, "Strawberry", 1700));
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arraylist (ordered)
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		//Traverse elements of arraylist (reverse ordered)
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}

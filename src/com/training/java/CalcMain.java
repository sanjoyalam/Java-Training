package com.training.java;

import java.util.ArrayList;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("add result: " + Calculator.add("1", "2"));
		System.out.println("subtract result: " + Calculator.subtract("6", "2"));
		System.out.println("multiple result: " + Calculator.multiply("2", "3"));
		System.out.println("divide result: " + Calculator.divide("10", "2"));
		System.out.println("divide result: " + Calculator.divide("10", "0"));

		ArrayList<Integer> iList = new ArrayList<Integer>();

		iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		iList.add(5);

		System.out.println("sumCollection result: " + Calculator.sumCollecion(iList));

		ArrayList<String> sList = new ArrayList<String>();

		sList.add("pen");
		sList.add("ball");
		sList.add("egg");
		sList.add("tape");
		sList.add("employee");

		System.out.println("sumCollection result: " + Calculator.checkString(sList, 'e'));

	}

}

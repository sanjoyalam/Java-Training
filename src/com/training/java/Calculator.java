package com.training.java;

import java.util.ArrayList;

public class Calculator {

	public static int add(final String strNum1, final String strNum2) {
		int result = 0;
		int numInt1 = convertToInt(strNum1);
		int numInt2 = convertToInt(strNum2);
		result = numInt1 + numInt2;
		return result;

	}

	public static int subtract(final String strNum1, final String strNum2) {
		int result = 0;
		int numInt1 = convertToInt(strNum1);
		int numInt2 = convertToInt(strNum2);
		result = numInt1 - numInt2;
		return result;

	}

	public static int multiply(final String strNum1, final String strNum2) {
		int result = 0;
		int numInt1 = convertToInt(strNum1);
		int numInt2 = convertToInt(strNum2);
		result = numInt1 * numInt2;
		return result;

	}

	public static int divide(final String strNum1, final String strNum2) {
		int result = 0;
		int numInt1 = convertToInt(strNum1);
		int numInt2 = convertToInt(strNum2);
		try {

			if (numInt2 == 0) {
				throw new ArithmeticException("Divide by zero");
			} else {
				result = numInt1 / numInt2;
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}
		return result;

	}
	
	public static int sumCollecion(final ArrayList<Integer> aList){
		int sum=0;
		for (Integer i : aList){
			sum+=i;
		}
		return sum;
	}
	
	public static ArrayList<String> checkString(final ArrayList<String> sList, char c){
		ArrayList<String> rList = new ArrayList<String>();
		for (int i =0; i <sList.size();i++){
			for (int j =0; j <sList.get(i).length();j++){
				if(sList.get(i).charAt(j)==c){
					rList.add(sList.get(i));
					break;
				}
			}
		}
		return rList;
	}


	private static int convertToInt(final String strNum) {
		int intNum = 0;
		try {
			intNum = Integer.parseInt(strNum);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input");
		} catch (NullPointerException e) {
			System.out.println("Null Input");
		}
		return intNum;

	}

}

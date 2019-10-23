package org.ntu.mantrov.labs.lab3;

import java.util.Random;

public class Var {
	
	public static String getRandString(Integer maxlength) {
		String chars = "qazxswedcvfrtgbnhyujmkiolp1234567890QAZXSWEDCVFRTGBNHYUJMKIOLP";
		int size = chars.length() - 1;
		String randpass = "";
		for (int i = 0; i < maxlength; i++) {
			randpass += chars.charAt((int) ((Math.random() * (size - 0)) + 0));
		}
		return randpass;
	}
	
	public static int getRandInt(int maxBound) {
		return new Random().nextInt(maxBound);
	}

}

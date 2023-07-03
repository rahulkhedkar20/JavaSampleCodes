package com.rk.codewar;

public class OppositesAttract {

	public static void main(String[] args) {

		System.out.println("They are in love : " + isLove(1, 2));

	}

	public static boolean isLove(final int flower1, final int flower2) {

		if ((flower1 % 2 != 0 && flower2 % 2 == 0) || ((flower1 % 2 == 0 && flower2 % 2 != 0))) {
			return true;
		} else {
			return false;
		}

		/*
		 * There is second optimized way to do that
		 */
		// return flower1 % 2 != flower2 % 2;

	}

}
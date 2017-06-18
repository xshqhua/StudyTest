package com.main;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n3 = Calculater.add(1.0f, 2.0f);
		System.out.println(n3);
	}

	public static float add(float n1, float n2) {
		return n1 + n2;
	}

	public static float sub(float n1, float n2) {
		return n1 - n2;
	}

	public static float mul(float n1, float n2) {
		return n1 * n2;
	}

	public static float div(float n1, float n2) {
		if (n2 >= -0.0000001 && n2 <= 0.0000001)
			return 0;
		return n1 / n2;
	}

}

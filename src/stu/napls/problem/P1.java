package stu.napls.problem;

public class P1 {

	public void solution(int a, int b) {
		System.out.println(aplusb(a, b));
	}

	/*
	 * param a: The first integer param b: The second integer return: The sum of a
	 * and b
	 */
	private int aplusb(int a, int b) {
		// write your code here, try to do it without arithmetic operators.
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		int x1 = a ^ b;
		int x2 = (a & b) << 1;
		return aplusb(x1, x2);
	}
}

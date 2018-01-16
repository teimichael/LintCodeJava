package stu.napls.problem;

public class P3 {

	public void solution(int k, int n) {
		System.out.println(digitCounts(k, n));
	}

	/*
	 * @param : An integer
	 * 
	 * @param : An integer
	 * 
	 * @return: An integer denote the count of digit k in 1..n
	 */
	public int digitCounts(int k, int n) {
		// Handle unit
		if (n < 10) {
			return 1;
		}
		// Handle else
		int result = 0;
		int p1 = 1;
		int p2 = p1 * 10;
		int temp;
		while (n >= p1) {
			if (k == 0 && n < p2) {
				break;
			}
			result += n / p2 * p1;
			temp = n % p2 / p1;
			if (temp > k) {
				result += p1;
			} else if (temp == k) {
				result += n % p2 % p1 + 1;
			}
			p1 = p2;
			p2 *= 10;
		}
		return result;
	}

	public int unoptimized(int k, int n) {
		// Handle unit
		if (n < 10) {
			return 1;
		}
		// Handle else
		int result = 0;
		int pow = 10;
		while (n >= pow / 10) {
			if (k == 0 && n < pow) {
				break;
			}
			result += n / pow * (pow / 10);
			if (n % pow / (pow / 10) == k) {
				result += n % pow % (pow / 10) + 1;
			} else if (n % pow / (pow / 10) > k) {
				result += pow / 10;
			}
			pow *= 10;
		}
		return result;
	}
}

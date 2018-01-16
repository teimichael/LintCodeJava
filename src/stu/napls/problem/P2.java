package stu.napls.problem;

public class P2 {

	public void solution(long n) {
		System.out.println(trailingZeros(n));
	}

	private static final double LOG5 = Math.log(5);

	private long counter;
	private long result;

	/*
	 * @param n: An integer
	 * 
	 * @return: An integer, denote the number of trailing zeros in n!
	 */
	public long trailingZeros(long n) {
		long result = 0;
		long j;
		for (int i = 1; (j = (long) (Math.pow(5, i))) <= n; result += n / j, i++) {
			
		}
		return result;
	}
	
	private long cal5(long n) {
		while (n % 5 == 0) {
			counter++;
			n /= 5;
		}
		return counter;
	}

	public long unoptimized(long n) {
		int nSum = 0;
		int nMid = 5;
		while (n >= nMid) {
			nSum += (n / nMid);
			nMid *= 5;
		}
		return nSum;
	}
}

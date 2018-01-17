package stu.napls.problem;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import stu.napls.model.Problem;

public class P20_DicesSum extends Problem{

	private int n = 15;

	public void solution() {
		System.out.println(refer(n));
//		System.out.println(dicesSum(n));
	}

	/**
	 * @param n
	 *            an integer
	 * @return a list of Map.Entry<sum, probability>
	 */
	private int[] bucket;
	private double sum;

	public List<Map.Entry<Integer, Double>> dicesSum(int n) {
		this.sum = 0;
		this.bucket = new int[n * 6 + 1];
		List<Map.Entry<Integer, Double>> result = new ArrayList<>();
		recursion(0, 0, n);
		for (int i = 1; i < bucket.length; i++) {
			if (bucket[i] != 0) {
				result.add(new AbstractMap.SimpleEntry<Integer, Double>(i, bucket[i] / sum));
			}
		}
		return result;
	}

	private void recursion(int k, int index, int n) {
		if (index == n) {
			bucket[k]++;
			sum++;
		} else {
			for (int i = 1; i <= 6; i++) {
				recursion(i + k, index + 1, n);
			}
		}
	}

	public List<Map.Entry<Integer, Double>> refer(int n) {
		// Write your code here
		// Ps. new AbstractMap.SimpleEntry<Integer, Double>(sum, pro)
		// to create the pair
		long[][] dp = new long[n + 1][6 * n + 1];
		dp[1][1] = 1;
		dp[1][2] = 1;
		dp[1][3] = 1;
		dp[1][4] = 1;
		dp[1][5] = 1;
		dp[1][6] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = i; j <= i * 6; j++) {
				long x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0;
				if (j - 1 > 0) {
					x1 = dp[i - 1][j - 1];
				}
				if (j - 2 > 0) {
					x2 = dp[i - 1][j - 2];
				}
				if (j - 3 > 0) {
					x3 = dp[i - 1][j - 3];
				}
				if (j - 4 > 0) {
					x4 = dp[i - 1][j - 4];
				}
				if (j - 5 > 0) {
					x5 = dp[i - 1][j - 5];
				}
				if (j - 6 > 0) {
					x6 = dp[i - 1][j - 6];
				}
				dp[i][j] = x1 + x2 + x3 + x4 + x5 + x6;
			}
		}
		List<Map.Entry<Integer, Double>> result = new ArrayList<Map.Entry<Integer, Double>>();
		for (int i = n; i <= 6 * n; i++) {
			AbstractMap.SimpleEntry<Integer, Double> entry = new AbstractMap.SimpleEntry<Integer, Double>(i,
					dp[n][i] / Math.pow(6, n));
			result.add(entry);
		}
		return result;
	}
}

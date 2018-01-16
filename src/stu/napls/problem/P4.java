package stu.napls.problem;

import java.util.PriorityQueue;

public class P4 {
	public void solution(int n) {
		System.out.println(nthUglyNumber(n));

	}

	/*
	 * @param n: An integer
	 * 
	 * @return: the nth prime number as description.
	 */
	public int nthUglyNumber(int n) {
		PriorityQueue<Long> pq = new PriorityQueue<>();
		pq.add(1l);
		long currentTop = 1;
		for (int i = 0; i < n - 1; i++) {

			currentTop = pq.poll();
			if (!pq.contains(currentTop * 2)) {
				pq.add(currentTop * 2);
			}
			if (!pq.contains(currentTop * 3)) {
				pq.add(currentTop * 3);
			}
			if (!pq.contains(currentTop * 5)) {
				pq.add(currentTop * 5);
			}
		}
		return pq.peek().intValue();
	}
}

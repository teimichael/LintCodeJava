package stu.napls.model;

import java.util.Stack;

public class MinStack {

	Stack<Integer> order;
	Stack<Integer> min;

	public MinStack() {
		order = new Stack<>();
		min = new Stack<>();
	}

	/*
	 * @param number: An integer
	 * 
	 * @return: nothing
	 */
	public void push(int number) {
		order.push(number);
		if (min.size() == 0 || min.peek() >= number) {
			min.push(number);
		} else {
			min.push(min.peek());
		}
	}

	/*
	 * @return: An integer
	 */
	public int pop() {
		int result = 0;
		if (order.size() > 0) {
			result = order.pop();
			min.pop();
		}
		return result;
	}

	/*
	 * @return: An integer
	 */
	public int min() {
		int result = 0;
		if (min.size() > 0) {
			result = min.peek();
		}
		return result;
	}
}

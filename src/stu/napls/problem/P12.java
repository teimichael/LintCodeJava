package stu.napls.problem;

import stu.napls.model.MinStack;

public class P12 {
	public void solution() {
		MinStack ms = new MinStack();
		ms.push(1);
		System.out.println(ms.pop());
		ms.push(2);
		ms.push(3);
		System.out.println(ms.min());
		ms.push(1);
		System.out.println(ms.min());
	}
}

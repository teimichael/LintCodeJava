package stu.napls.problem;

public class P8 {
	public void solution(char[] str, int offset) {
		rotateString(str, offset);
		System.out.println(str);
	}

	/*
	 * @param str: An array of char
	 * 
	 * @param offset: An integer
	 * 
	 * @return: nothing
	 */
	public void rotateString(char[] str, int offset) {
		int len=str.length;
		if (len>0) {
			offset %= len;
			char[] str2 = new char[offset];
			System.arraycopy(str, len - offset, str2, 0, offset);
			System.arraycopy(str, 0, str, offset, len - offset);
			System.arraycopy(str2, 0, str, 0, offset);
		}

	}

}

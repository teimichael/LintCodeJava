package stu.napls.problem;

public class P13 {

	public void solution(String source, String target) {
		System.out.println(strStr(source, target));
	}

	/*
	 * @param source: source string to be scanned.
	 * 
	 * @param target: target string containing the sequence of characters to match
	 * 
	 * @return: a index to the first occurrence of target in source, or -1 if target
	 * is not part of source.
	 */
	public int strStr(String source, String target) {
		if (source == null || target == null) {
			return -1;
		}

		if (target.equals("")) {
			return 0;
		}

		return search(source, target, getNext(target));
	}

	public int[] getNext(String b) {
		int len = b.length();
		int j = 0;

		int next[] = new int[len + 1];
		next[0] = next[1] = 0;

		for (int i = 1; i < len; i++) {
			while (j > 0 && b.charAt(i) != b.charAt(j))
				j = next[j];
			if (b.charAt(i) == b.charAt(j))
				j++;
			next[i + 1] = j;
		}

		return next;
	}

	public int search(String original, String find, int next[]) {
		int j = 0;
		for (int i = 0; i < original.length(); i++) {
			while (j > 0 && original.charAt(i) != find.charAt(j))
				j = next[j];
			if (original.charAt(i) == find.charAt(j))
				j++;
			if (j == find.length()) {
				return i - j + 1;
			}
		}
		return -1;
	}

}

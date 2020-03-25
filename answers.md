1) 
public static String flip() {
	Random rand = new Random();
	int r = rand.nextInt(3);
	if (r == 0) {
		return "tails";
	}
	return "heads";
}

2) 
public static boolean arePermutations(int[] a, int[] b) {
	boolean[] perm = new boolean[a.length];
	for(int i = 0; i < a.length; i++) {
		perm[i] = false;
		for(int j = 0; j < b.length; j++) {
			if (a[i] == b[j]) {
				perm[i] = true;
			}
		}
	}
	for (int k = 0; k < a.length; k++) {
		if (perm[k] != true) {
			return false;
		}
	}
	return true;
}

3) 0 1 0 1
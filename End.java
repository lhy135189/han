public class End {
	public static void main (String[] args) {
		one();
		System.out.println(two());
	}
	public static void one () {
		System.out.println("34 + 30 = " + 34 +30);
	}
	public static int two () {
		int count = 10;
		count *= count + 2;
		count /= 100;
		count++;
		return count;
	}
}
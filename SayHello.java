public class SayHello {
	public static void main (String[] args) {
		System.out.println("Below is the function of sayhello");
		saayhello(sum());
	}
	public static void sayhello(int sum) {
		System.out.println("say Hello!"+sum);
	}
	public static int sum() {
		int i,sum=0;
		for(i=0;i<=100;i++) {
			sum =+ i;
		}
		return sum;
	}
}
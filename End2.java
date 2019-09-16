public class End {
	public static void main(String[] args) {
		int res; 
		int n1 = 12, n2 = 24, n3 = 16, n4 = 3;
		double d;
		double v1 = 10.0, v2 = 3.1416;
		res = n1 / n4;
		d = n1 / n4;
		System.out.printf("res = %d;d = %f",res,d);
		res = n3 / n4;
		d = n3 / n4;
		System.out.printf("res = %d;d = %f",res,d);
		d = v1 / n4;
		System.out.printf("d = %f",d);
		d = v1 / v2;
		System.out.printf("d = %f",d);
		res = n1 / n2;
		d = (double)n1 / n2;
		System.out.printf("res = %d;d = %f",res,d);
		d = n1 / (double)n2;
		System.out.printf("d = %f",d);
		d = (double)(n1 / n2);
		System.out.printf("d = %f",d);
	}
}
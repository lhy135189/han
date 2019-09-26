public class ArrayAssignment{
	public static void main(String[] args){
		int[] a1 = {1,2,3,4,5};
		int[] a2 = a1;
		for ( int i = 0; i < a2.length; ++i ){
			a2[i]++;
		}
		for ( int value: a1 ){
			System.out.println(value);
		}
	}
}
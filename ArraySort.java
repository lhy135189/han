import java.util.Arrays;
public class ArraySort{
	public static void main(String[] agrs){
		int a[] = {34,23,3,54,2,43,6,9,43};
		Arrays.sort(a,1,8);
		for(int i = 0;i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
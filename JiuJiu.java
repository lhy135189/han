public class JiuJiu{
	public static void main(String[] args){
		int num;
		for (int i = 1; i <= 7; i++){
			for (int k = 1; k <= i; k++){
				num = i * k;
				System.out.printf(" %d * %d = %d " ,k,i,num);
			}
			System.out.println("\n");
		}
	}
}
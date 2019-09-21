import java.util.Scanner;
public class Pyramid{
	public static void main(String[] args){
		System.out.println("Please enter the number of layers you need to print:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; i++){
			for (int k = 0; k <= num-i+1; k++){
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}

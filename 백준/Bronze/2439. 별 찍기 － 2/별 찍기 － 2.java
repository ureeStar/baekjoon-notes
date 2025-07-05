import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			for(int j=T-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i+1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
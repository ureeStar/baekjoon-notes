import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min, max;
		
		int T = sc.nextInt();
		int[] array = new int[T];
		for(int i=0;i<T;i++) {
			array[i] = sc.nextInt();
		}
		max = array[0];
		min = array[0];
		
		for(int i=1;i<T;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
	}
}
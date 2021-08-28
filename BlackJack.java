package Question;

import java.util.Scanner;

//น้มุ 2798น๘


public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		int sum=scan.nextInt();
		
		Integer[] array= new Integer[num];
		
		for(int i=0; i<num; i++) {
			int n=scan.nextInt();
			array[i]=n;
		}
		combination(sum, array);
		
		

	}
	static int combination(int sum, Integer[] array){
		int num=0;
		
		
		return num;
	}
}

package Question;

//น้มุ 10250น๘

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//2
//6 12 10
//30 50 72

public class ACM_Model {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Scanner scan=new Scanner(System.in);
			
//		int num=Integer.parseInt(bf.readLine());
//		System.out.println();
		
		int num=scan.nextInt();
		Integer[] array=new Integer[num];
		for(int i=0; i<num; i++) {
//			int floor=Integer.parseInt(bf.readLine());
//			int room=Integer.parseInt(bf.readLine());
//			int person=Integer.parseInt(bf.readLine());
			
			int h=scan.nextInt();
			int w=scan.nextInt();
			int n=scan.nextInt();
			
			
			
			int floor=n%h;
			int room=n/h;
			
			System.out.println(floor+" "+room);
			
			if(n%h==0) {
				array[i]=h*100+room;
			}
			else {
				array[i]=(floor)*100+(room+1);
			}

//			bw.write(String.valueOf(room_num));
			
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
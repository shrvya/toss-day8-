 package toss;

import java.util.Scanner;
import java.lang.Math;

public class toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times of toss");
		int no;
		no=sc.nextInt();
		int tail = 0,head=0;
		double result;
		for(int i=0;i<no;i++) {
			result=Math.random();
			if(result<0.5)
			{
				tail++;
			}
			else {
				head++;
			}
			
		}
		System.out.println("percentage of tail is :"+((tail*100)/no));
		System.out.println("percentage of head is :"+((head*100)/no));		

	}

}

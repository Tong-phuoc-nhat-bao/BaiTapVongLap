package BaiTapVongLap;

import java.util.Scanner;

public class BaiTap2 {
	public static int TichChan(int n) {
		int tong=1;
		for (int i=2;i<2*n;i=i+2)			
		{
			tong=tong*i;
		}
		return tong;
	}
	public static int TichLe(int n) {
		int tong=1;
		for (int i=1;i<2*n+1;i=i+2)			
		{
			tong=tong*i;
		}
		return tong;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n= ");
		int n = input.nextInt();
		System.out.println("Tich chan="+TichChan(n));
		System.out.println("tich le="+TichLe(n));
	}
}

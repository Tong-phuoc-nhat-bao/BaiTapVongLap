package BaiTapVongLap;

import java.util.Scanner;

public class BaiTap1 {
	public static int TongChan(int n) {
		int tong=0;
		for (int i=0;i<2*n;i=i+2)			
		{
			tong=tong+i;
		}
		return tong;
	}
	public static int TongLe(int n) {
		int tong=0;
		for (int i=1;i<2*n+1;i=i+2)			
		{
			tong=tong+i;
		}
		return tong;
	}
	public static float TongTP(int n) {
		float tong=0;
		for (int i=1;i<n;i++)			
		{
			float a=i;
			tong=tong+(1/a);
		}
		return tong;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n= ");
		int n = input.nextInt();
		System.out.println("Tong chan="+TongChan(n));
		System.out.println("Tong le="+TongLe(n));
		System.out.println("Tong phan so="+TongTP(n));
	}
}

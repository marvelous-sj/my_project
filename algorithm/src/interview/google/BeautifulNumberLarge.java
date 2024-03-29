package interview.google;

import java.util.Scanner;

public class BeautifulNumberLarge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long size = sc.nextLong();
	for(int i=0;i<size;i++){
		long n=sc.nextLong();
		System.out.println("case #"+n+"=>"+beautiful(n));
	}
}

private static long beautiful(long n) {
	for(int bit=64;bit>2;bit--){
		long radix=getRadix(n,bit);
		if(radix!=-1){
			return radix;
		}
	}
		return n-1;  
}

private static long getRadix(long n, int bit) {
	long minRadix=2;
	long maxRadix=n;
	while(minRadix<maxRadix){
		long midRadix=minRadix+(maxRadix-minRadix)/2;
		long t=convert(midRadix,bit);
		if(t==n){
			return midRadix;
		}else if(t<n){
			minRadix=midRadix+1;
		}else{
			maxRadix=midRadix;
		}
	}
	return -1;
}

private static long convert(long radix, int bit) {
	long component=1;
	long sum=0;
	for(int i=0;i<bit;i++){
		if(Long.MAX_VALUE-sum<component)
			return Long.MAX_VALUE;
		sum+=component;
		if(Long.MAX_VALUE/radix<component)
			return Long.MAX_VALUE;
		component*=radix;
	}
	return sum;
}








}

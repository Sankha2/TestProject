package sankha;

import java.util.Arrays;
public class SplitArray {
	
	public static void main(String args[]) {
		int a[]= {4,5,6,8,8};
			
		int length=a.length;
		System.out.println(length);
		int n=length/2;
		int b[]=new int [n];
		int c[]=new int [length-n];
		for (int i=0;i<length;i++) {
			
			if(i<n) 
			b[i]=a[i];
			else 
				c[i-n]=a[i];
			}
		
			
		System.out.println("First half"+Arrays.toString(b));	
		System.out.println("Second half"+Arrays.toString(c));		
			
		}
		
		
	}



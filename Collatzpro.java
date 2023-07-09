package Collatz;
import java.util.Scanner;
public class Collatzpro 
{
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		int tn=sc.nextInt();
		sc.close();
		System.out.print(tn+" ");
		while(tn>1) {
			if(tn%2==0) {
				tn/=2;
				System.out.print(tn+" ");
			}
			else {
				tn=((tn*3)+1);
				System.out.print(tn+" ");
			}
		}
			
	}
	}
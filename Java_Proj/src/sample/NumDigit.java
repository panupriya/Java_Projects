package sample;
import java.util.Scanner;
public class NumDigit {
	public static void main (String[] args) {
	int num,count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	num = sc.nextInt();
	while(num>0) {
		num = num/10;
		count = count+1;
	}
System.out.println("number of digits is"+count);
}
}
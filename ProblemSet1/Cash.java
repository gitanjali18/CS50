import java.util.*;
import java.text.*;
import java.io.*;
import java.util.regex.*;
import java.math.*;
import java.util.Scanner;
public class Cash{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int c = 0;
		double cash ;

		cash = scan.nextDouble();

		cash*=100;

		while(cash>=25){
			cash-=25;
			c++;
		}
		while(cash>=10){
			cash-=10;
			c++;
		}
		while(cash>=5){
			cash-=5;
			c++;
		}
		while(cash>=1){
			cash-=1;
			c++;
		}
		System.out.println(c);

		scan.close();

	}
}
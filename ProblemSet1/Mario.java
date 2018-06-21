import java.util.*;
import java.text.*;
import java.io.*;
import java.util.regex.*;
import java.math.*;
import java.util.Scanner;
public class Mario{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n;

		n = scan.nextInt();

		for(int i =0; i<n;++i){

			for(int j=0;j<=n;j++){
				if(i+j>=n-1){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
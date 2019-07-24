import java.util.Scanner;
import java.util.Arrays;
public class Lab1_Ex3_IncreasingNumber {
	public static boolean checkNumber(int n){
		String str = Integer.toString(n);
		String digit[]=str.split("");
		for(int i=0;i<digit.length-1;i++){
			if(Integer.parseInt(digit[i])>Integer.parseInt(digit[i+1]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = checkNumber(n);
		System.out.println(ans);
		sc.close();
	}
}

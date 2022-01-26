import java.util.Scanner;
public class ThreeDigitNMulOf10
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n >= 100 && n < 1000 && n % 10 == 0)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}
}

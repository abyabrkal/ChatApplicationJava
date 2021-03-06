import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

// CLASS: Main
class Main
{
	// FUNCTION: main
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for(int cs = 1; cs <= t; ++cs)
		{
			String a = scan.next();
			String b = scan.next();

			System.out.println(a + " " + b);

			BigInteger bg = new BigInteger(a);
			BigInteger gg = new BigInteger(b);
			BigInteger ans = pow(bg, gg);
            //System.out.println(ans.toString());

			String an = ans.toString();
			long gt = gv(an);

			while(gt >= 10)
			{
				gt = sod(gt);
			}
			System.out.println("Case " + cs + ": " + gt);
		}

	}

    // FUNCTION: sod
	public static long sod(long x)
	{
		long anss = 0;

		while(x != 0)
		{
			anss += x % 10;
			x /= 10;
		}

		return anss;
	}

    // FUNCTION: gv
	public static long gv(String x)
	{
		long xx = 0;

		for(int i = 0; i < x.length(); ++i)
		{
			xx += x.charAt(i) - '0';
		}

		return xx;
	}

    // FUNCTION: pow
	public static BigInteger pow(BigInteger base, BigInteger exponent)
	{
		BigInteger result = BigInteger.ONE;

		while (exponent.signum() > 0)
		{
			if (exponent.testBit(0)) result = result.multiply(base);
			
			base = base.multiply(base);
			exponent = exponent.shiftRight(1);
		}
		return result;
	}

}
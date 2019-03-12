public class labs {

	// Number of Fibonacci numbers to output
	int numbersOutput = 5;
	// Count the amount of digits in this int
	int digitC = 1434;
	// Count the sums of these digits
	int sumDig = 2816;
  
	// Base used in Power Method
  	int powerBase = 5;
	// Exp used in Power Method
  	int powerExp = 6;
	
	// Factorial to be calculated
	int factorial = 7;

	
	public static void main(String[] args) {
		// Use constructor
		labs t = new labs();
	}
	
	labs() {
		// Outputs
		System.out.println("Exp ("+ powerBase + "^" + powerExp + ") : " + power(powerBase, powerExp));
		System.out.println("digitCount (" + digitC + ") : " + digitCount(digitC));
		System.out.println("sumDigits (" + sumDig + ") : " + sumDigits(sumDig));
		System.out.println("!Factorial (!" + factorial + ") : " + f(factorial));
		System.out.print("Fib Numbers (" + numbersOutput + ") : ");
		for (int x = 0; x < numbersOutput; x++) {
			System.out.print(fib(x) + ", ");
		}
	}
	
	// Recursive Fib method
	public int fib(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fib(n - 1) + fib(n - 2);
	}
	
	// Recursive digitCount method
	public int digitCount(int n) {
		if (n < 10) return 1;
		else
		return digitCount(n/10) + 1;
	}
	
	// Recursive sumDigits method
	public int sumDigits(int n) {
		if (n < 10) return n;
		else
		return sumDigits(n/10) + (n % 10);
	}
	
	// Recursive power method
	public int power(int base, int exo) {
		if (exo == 1) return base;
		else
			if (exo == 2) return base * base;
			else
				return base * power(base, exo-1);
	}
	
	// Recursive factorial method
	public int f(int n) {
		if (n == 1) return 1;
			else
				return n * f(n-1);
	}

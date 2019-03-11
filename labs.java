public class labs {

	int numbersOutput = 5;
	int digitC = 1434;
	int sumDig = 2816;
  
  int powerBase = 5;
  int powerExp = 6;
	
	public static void main(String[] args) {
		labs t = new labs();
	}
	
	public labs() {
		System.out.println("Exp ("+ powerBase + "^" + powerExp + ") : " + power(powerBase, powerExp));
		System.out.println("digitCount (" + digitC + ") : " + digitCount(digitC));
		System.out.println("sumDigits (" + sumDig + ") : " + sumDigits(sumDig));
		System.out.print("Fib Numbers (" + numbersOutput + ") : ");
		for (int x = 0; x < numbersOutput; x++) {
			System.out.print(fib(x) + ", ");
		}
	}
	
	public int fib(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fib(n - 1) + fib(n - 2);
	}
	
	public int digitCount(int n) {
		if (n < 10) return 1;
		else
		return digitCount(n/10) + 1;
	}
	
	public int sumDigits(int n) {
		if (n < 10) return n;
		else
		return sumDigits(n/10) + (n % 10);
	}
	
	public int power(int base, int exo) {
		if (exo == 1) return base;
		else
			if (exo == 2) return base * base;
			else
				return base * power(base, exo-1);
	}

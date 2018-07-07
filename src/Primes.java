public class Primes implements NumberGroup {
	public boolean contains(int value) {
		if (value < 2) {
			return false;
		}		
		
		if (value == 2) {
			return true;
		}
		
		if (value % 2 == 0) {
			return false;
		}		
		
		int divisor = 3;
		
		while (divisor < value) {
			 if (value % divisor == 0) {
				 return false;
			 }
			 
			 divisor += 2;
		}
		
		return true;
	}
}

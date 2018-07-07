public class Palindromes implements NumberGroup {
	public boolean contains(int value) {
		String original = "" + value;
		String backwards = "";
		
		for (int i = original.length() - 1; i >= 0; i--) {
			backwards += original.substring(i, i + 1);
		}
		return original.equalsIgnoreCase(backwards);
	}
}
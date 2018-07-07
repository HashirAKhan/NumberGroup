public class Range implements NumberGroup {
	private int min;
	private int max;
	
	public Range(int low, int high) {
		min = low;
		max = high;
	}
	
	@Override	
	public boolean contains(int value) {
		return value >= min && value <= max;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
}

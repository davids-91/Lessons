
public class Lessons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMinAndMax(new int[] {2,5,96,42});
	}
	
	private static void findMinAndMax(int a, int b, int c) {
		int min, max;
		if (a > b) {
			min = b;
			max = a;
		} else {
			min = a;
			max = b;
		}
		if (c < min) min = c;
		if (c > max) max = c;
		System.out.println("Min = " + min + "\nMax = " + max);
	}
	
	private static void findMinAndMax(int[] sequence) {
		int min, max;
		//initialize min & max
		if (sequence[0] > sequence[1]) {
			min = sequence[1];
			max = sequence[0];
		} else {
			min = sequence[0];
			max = sequence[1];
		}
		//comparing two next candidates for min and max
		int i = 2;
		while (i < sequence.length) {
			if (sequence[i] < sequence[i+1]) {
				//sequence[i] is potential minimum, but sequence[i+1] is potential maximum
				if (sequence[i] < min)
					min = sequence[i];
				if (sequence[i+1] > max)
					max = sequence[i+1];
			} else {
				//sequence[i] is potential maximum, but sequence[i+1] is potential minimum
				if (sequence[i+1] < min)
					min = sequence[i+1];
				if (sequence[i] > max)
					max = sequence[i];
			}
			i += 2;
		}
		if (sequence.length % 2 != 0) {
			//sequence is odd, check the last element
			if (sequence[sequence.length] < min) min = sequence[sequence.length];
			if (sequence[sequence.length] > max) max = sequence[sequence.length];
		}
		System.out.println("Min = " + min + "\nMax = " + max);
	}
}

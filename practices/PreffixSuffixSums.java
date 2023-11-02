package practices;

public class PreffixSuffixSums {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 2, 4, 0, 3, 2, 2, 2, 2 };

		int suffix = 0;
		int max = 0;

		for (int x : arr) //add all element
			suffix += x;

		int prefix = 0;

		for (int i = 0; i < arr.length; i++) {
			prefix += arr[i]; //
			if (prefix == suffix && max < suffix) {
				max = suffix;
			}
			suffix -= arr[i];
		}

		System.out.println(max);
	}

}

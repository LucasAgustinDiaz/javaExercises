package sort;

import util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RadixSort
{
	// Complexity O(m * n), m: max number of digits, n : number of elements
	public static void radixSort(int []arr)
	{
		String[] arrStr = StringUtil.toStringArray(arr);
		// normalize size of the elements
		StringUtil.lNormalize(arrStr,'0');
		int MAX_LENGTH = arrStr.length > 0 ? arrStr[0].length() : 0;
		//
		ArrayList<String> sorted = new ArrayList<>();
		sorted.addAll(Arrays.asList(arrStr));
		// 0 to 9 Digit
		Map<Integer, ArrayList<String>> mapDigit = new HashMap<Integer,ArrayList<String>>();
		// init map digit
		for (int i = 0; i <= 9; i++) mapDigit.put(i,new ArrayList<String>());
		// iterate
		for (int i = MAX_LENGTH; i > 0; --i)
			for (int j = arrStr.length; j > 0; --j) {
				for (String s : sorted)
					mapDigit.get(Integer.valueOf(s.substring(i-1,i))).add(s);
				// clear the last digit ordered
				sorted.clear();
				// mix the new ordered digits numbers
				for (Map.Entry<Integer,ArrayList<String>> entry : mapDigit.entrySet()) {
					sorted.addAll(entry.getValue());
					mapDigit.get(entry.getKey()).clear();
				}

			}
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(sorted.get(i));
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+(i<arr.length-1?",":""));
	}
}

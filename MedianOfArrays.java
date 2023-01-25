package MedianArrays;

import java.util.*;

public class MedianArrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		double i1 = 0;
		double i2 = 0;
		double o = 0;
		ArrayList<Integer> output = new ArrayList<Integer>();
		while ((i < nums1.length) && (j < nums2.length)) {
			if(nums1[i] >= nums2[j]) {
				if (nums1[i] == nums2[j]) {
					output.add(nums1[i]);
					output.add(nums2[j]);
					i++;
					j++;
					continue;
				}
				output.add(nums2[j]);
				j++;
				continue;
			}
			else {
				output.add(nums1[i]);
				i++;
				continue;
			}
		}
		while (j < nums2.length) {
			output.add(nums2[j]);
			j++;
		}
		while (i < nums1.length) {
			output.add(nums1[i]);
			i++;
		}
		if (output.size() % 2 == 0) {
			i1 = output.get(output.size()/2 - 1);
			i2 = output.get((output.size()/2));
			o = (i1 + i2) / 2;
		}
		else {
			i = (output.size()/2) + 1;
			o = output.get(i - 1);
		}
        return o;
    }

	public static void main(String[] args) {
		int[] input1 = {1,1,1,1,1,1,1,1,1,1,4,4};
		int[] input2 = {1,3,4,4,4,4,4,4,4,4,4};

		System.out.println(findMedianSortedArrays(input1, input2));
	}
}

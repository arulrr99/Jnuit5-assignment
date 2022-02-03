//MinMaxFinder class

package testing;

public class MinMaxFinder {
	
	public int[] findMinMax(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		int[] minMax=new int[2];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		minMax[0]=min;
		minMax[1]=max;
		return minMax;

	}

}

//MinMaxFinderTest class

package testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	@DisplayName("To find minimum and maximum of given array")
	void test() {
		MinMaxFinder m=new MinMaxFinder();
		assertArrayEquals(new int[] {3,56},m.findMinMax(new int[] {56,34,7,3,54,3,34,34,53}));
		assertArrayEquals(new int[] {0,35},m.findMinMax(new int[] {16,5,35,30,28,17,0,7,19}));
		assertArrayEquals(new int[] {110,201},m.findMinMax(new int[] {110,120,175,201,117}));
		assertArrayEquals(new int[] {1001,2500},m.findMinMax(new int[] {1001,1500,2500,2100,1300}));
	}

}

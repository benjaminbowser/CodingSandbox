package bogosort;

// Benjamin Bowser
// benjaminbowser.com
// 2/2/2019
// BogoSort code example

public class BogoSort {

	public BogoSort(int[] array) {
		long iterations = 0;
		long startTime = System.nanoTime();
		while(!sorted(array)) {
			sort(array);
			iterations++;
		}
		long endTime = System.nanoTime();
		System.out.println("Sorted in " + iterations + " randomizations. It took about " + ((endTime - startTime) / 1000000000) + " seconds.");
		System.out.print("Sorted Array: ");
		for (int value : array) {
			System.out.print(value + " ");
		}
	}
	
	public boolean sorted(int[] array) {
		for (int i=0; (i < array.length-1); i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public void sort(int[] array) {
		for (int i=0; i < array.length; i++) {
			int first = (int)(Math.random() * array.length);
			int second = (int)(Math.random() * array.length);
			
			// A classic Java swap:
			int temp = array[first];
			array[first] = array[second];
			array[second] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] array = { 403551, 409059, 365996, 292912, 124153, 486812, 268840, 416980, 211744, 202454, 287441, 398480, 51904, 389614, 330654, 185482, 164377, 154184, 
				226524, 420861, 165597, 390319, 355263, 320549, 152627, 386263, 210705, 315928, 350726, 153851, 166855, 10071, 439420, 77566, 11644, 55157, 370891, 136842,
				431033, 185065, 191366, 31406, 121107, 332075, 117014, 252359, 290288, 261618, 257417, 369561, 245232, 105871, 194098, 264039, 175748, 64846, 405313, 70431,
				7333, 408278, 198730, 183566, 336388, 152058, 431321, 173149, 383457, 434319, 247609, 129518, 124084, 266343, 398614, 416334, 275867, 297593, 238161, 344517, 
				23418, 285299, 145403, 180181, 112717, 114462, 230976, 176913, 199527, 372747, 43687, 195102, 244511, 327439, 101301, 258114, 184231, 34175, 24797, 84827,
				471893, 168537, 334300, 42834, 74964, 62805, 195585, 364308, 67408, 143777, 153021, 261266, 108406, 431082, 103068, 202459, 152783, 216748, 389066, 369502 };
		// Never finished
		
		int[] array2 = { 1, 42, 23, 59, 3, 90, 25, 500, 26, 13 };
		int[] array3 = { 1, 42, 23, 59, 3, 90, 25, 500, 26, 13, 66 };
		//BogoSort sort = new BogoSort(array); 
		BogoSort sort2 = new BogoSort(array2);
		//BogoSort sort3 = new BogoSort(array3);
	}
}

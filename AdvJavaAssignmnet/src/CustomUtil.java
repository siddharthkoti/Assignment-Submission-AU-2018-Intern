import java.util.Arrays;
public final class CustomUtil{
	private CustomUtil() {}
	
	private static <E> void swap(MyArrayList<E> a, int i, int j) {
        if (i != j) {
            E temp = a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);

        }
    }

    public static <E extends Comparable<E>> void CustomSort(MyArrayList<Integer> arr){
        for (int i = 0; i < arr.getSize() - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < arr.getSize(); j++) {
                if (arr.get(j).compareTo(arr.get(smallest)) <= 0) {
                    smallest = j;
                }
            }
            
            
            swap(arr, i, smallest);  // swap smallest to front
        }
    }
}

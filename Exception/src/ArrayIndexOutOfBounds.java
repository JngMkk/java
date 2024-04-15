public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	            at ArrayIndexOutOfBounds.main(ArrayIndexOutOfBounds.java:5)

	        ArrayIndexOutOfBoundsException: RuntimeException 상속
	    */
    }
}

package genericAssignment;

public class Q3Generics {
	 public static <T> void swap(T[] a, int i, int j) {
	        T temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a[]= {1,6,5,7};
swap(a, 2, 1);
for (Integer integer : a) {
	System.out.println(integer);
}

	}

}

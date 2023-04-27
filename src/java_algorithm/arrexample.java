package java_algorithm;

public class arrexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
		
		for(int i=0; i < 20; i++) {
			arr[i] = i*2;
		}
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i =0; i<arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i : arr) {
			System.out.print(i+ "~~");
		}
	}

}

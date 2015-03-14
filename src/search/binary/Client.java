package search.binary;

public class Client {
	
	static int[] array = {1,4,6,8,9,10,20,22,44,46,56,78,90,95,99,100};
	
	public static void main(String args[]){
		System.out.println("Binary Search");
		for(int n : array){
			System.out.print(" " + n);
		}
		System.out.println("\nTotal elements: " + array.length);
		System.out.println(search(77));
		
		
	}
	
	public static int search(int key){
		System.out.println("Searching for " + key);
		return binarySearch(array, 0, array.length, key);
	}
	
	public static int binarySearch(int[] numbers, int min, int max, int key){
		if(max <= min){
			return -1;
		}else{
			int mid = (min + max)/2;
			if( numbers[mid] < key ){
				return binarySearch(numbers, mid + 1, max, key);
			}else if(numbers[mid] > key){
				return binarySearch(numbers, min, mid, key);
			}else{
				return key;
			}
		}
	}
	
}

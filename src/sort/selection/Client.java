package sort.selection;

public class Client {
	static int numbers[] = {100,13,3,7,90,1,22,3,1,8,5,9,3,10,67,23,12};
		
	public static void main(String args[]){
		System.out.println("Selection Sort");
		int arraySize = numbers.length;
		for(int number: numbers){
			System.out.print(number + " ");
		}
		System.out.println("");
		int minIndex = 0;
		int minimum;
		for(int i = 0; i < arraySize ; i++){
			minimum = numbers[i];
			for(int j = i; j< arraySize; j++){
				if(numbers[j] <= minimum){
					minIndex = j;
					minimum = numbers[j];
				}
			}
			swap(i, minIndex);
		}
		System.out.println("Sorted : \n");
		for(int number: numbers){
			System.out.print(number + " ");
		}
	
	}
	
	public static void swap(int a, int b){
		int temp = numbers[a];
		numbers[a]= numbers[b];
		numbers[b] = temp;
	}
	
}

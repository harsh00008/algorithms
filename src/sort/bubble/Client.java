package sort.bubble;

public class Client {
	
	static int numbers[] = {100,13,3,7,90,1,22,3,1,8,5,9,3,10,67,23,12}; 
	
	public static void main(String args[]){
		
		int arraySize = numbers.length;
		System.out.println("Bubble Sort");
		for(int number : numbers){
			System.out.print( number + " ");
		}
		System.out.println("\nArray Size : " + arraySize);
		
		for(int i = 0; i< arraySize; i++){
			for(int j = 0; j < arraySize - 1; j++){
				if(numbers[j] >= numbers[j+1]){
					swap(j, j+1);
				}
			}
		}
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

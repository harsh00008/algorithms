package bubblesort;

public class Client {
	
	public static void main(String args[]){
		int numbers[] = {100,13,3,7,90,1,22,3,1,8,5,9,3,10,67,23,12};
		int arraySize = numbers.length;
		System.out.println("Bubble Sort");
		for(int number : numbers){
			System.out.print( number + " ");
		}
		System.out.println("\nArray Size : " + arraySize);
		for(int j = 0; j < arraySize; j++){
			for(int i = 0; i< arraySize; i++){
				if(i > 0){
					if(numbers[i-1] > numbers[i]){
						int temp = numbers[i];
						numbers[i] = numbers[i-1];
						numbers[i-1] = temp;
					}
				}else{
					if(numbers[i+1] < numbers[i]){
						int temp = numbers[i];
						numbers[i] = numbers[i+1];
						numbers[i+1] = temp;
					}
				}
			}
		}
		System.out.println("Sorted Array");
		for(int number: numbers){
			System.out.print(number + " ");
		}
	}
	
}

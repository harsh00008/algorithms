package sort.shell;

public class Client {
	
	static int[] input = {10,22,55,99,24,78,34,15,8,46,83,82,42};
	
	public static void main(String[] args){
		
		System.out.println("Original Elements");
		
		int interval = 2;
		
		int arraySize = input.length;
		
		int inner, outer = 0;
		
		outer = interval;
		
		while(outer < arraySize){
			
			inner = outer - interval;
			
			if(input[inner] > input[outer]){
				
				System.out.println("Swapping " + input[inner] + " & " + input[outer]);
				
				swap(inner, outer);
				
			}
			
			outer = outer + 1;
			
		}
		
		System.out.println("After Shell Sort");
		
		for(int i = 0; i < arraySize; i++){
			
			System.out.print( input[i] + " " );
			
		}
		
		//insertion sort
		for(int i = 1; i < arraySize; i++){
			
			int j = i;
			
			while( j > 0 && input[j] < input[j - 1] ){
				
				swap(j, j - 1);
				
				j--;
			}
			
		}
		
		System.out.println("\nAfter Insertion Sort");
		
		for(int i = 0; i < arraySize; i++){
			
			System.out.print( input[i] + " " );
			
		}
		
	}
	
	public static void swap(int i, int j){
		
		int temp = input[i];
		
		input[i] = input[j];
		
		input[j] = temp;
		
	}

}

package sort.quick;

import java.util.Arrays;

public class Client{
	
	public static int[] input = {14,10,55,2,83,24,11,2,4,99,65,41};
	
	public static void main(String[] args){
		
		System.out.println("Quick Sort");
		
		System.out.println("Input: " + Arrays.toString(input));
		
		quicksort(input, 0, (input.length - 1));
		
		System.out.println("Output: " + Arrays.toString(input));
		
	}
	
	
	public static int partition(int[] input, int left, int right){
		
		int pivot = input[(left+right)/2];
		
		while(left <= right){
			
			while(input[left] < pivot){
				
				left++;
				
			}
			
			while(input[right] > pivot ){
				
				right--;
				
			}
			
			if(left <= right){
			
				swap(left, right);
				
				left++; right--;
				
			}
			
		}
		return left;
	}
	
	public static void swap(int i, int j){
		
		int temp = input[i];
		
		input[i] = input[j];
		
		input[j] = temp;
		
	}
	
	public static void quicksort(int[] input, int left, int right){
		
		int index = partition(input, left, right);
		
		if(left < index - 1){
			
			quicksort(input,left, index - 1);
			
		}
		
		if(right > index){
			
			quicksort(input, index, right);
			
		}
		
	}
	
}
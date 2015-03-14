package sort.insertion;

public class Client {
	
	static int[] input = {24,13,9,64,7,23,34,47,23,23,23,23,23,64,1};
	
	public static void main(String[] args){
		System.out.println("Insertion Sort");
		int length = input.length;
		
		for(int i = 0; i< length; i++){
			System.out.print( input[i] + " ");
		}
		
		System.out.println("");
		
		int j = 0;
		for(int i = 1; i < length; i++){
			j = i;
			while(j > 0 && input[j] < input[j-1]){
				swap(j,(j - 1));
				j--;
			}
		}
		
		System.out.println("\n\nPrinting \n");
		for(int i = 0; i< length; i++){
			System.out.print( input[i] + " ");
		}
	}
	
	public static void swap(int i, int j){
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	

}

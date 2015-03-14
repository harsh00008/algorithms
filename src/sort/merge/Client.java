package sort.merge;

import java.util.Arrays;
import java.util.LinkedList;

public class Client {

	public static int[] input = {78,32,65,10,3,78,91,42,72,35,11,18,43};
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("Merge Sort");
		System.out.println("Input: " + Arrays.toString(input));
		int[] workspace = new int[input.length];
		mergeSort(workspace, 0, input.length - 1);
		System.out.println("Output: " + Arrays.toString(input));
//		
//		LinkedList listA = new LinkedList();
//		listA.add(1);
//		listA.add(3);
//		listA.add(9);
//		listA.add(11);
//		
//		LinkedList listB = new LinkedList();
//		listB.add(2);
//		listB.add(4);
//		listB.add(5);
//		listB.add(6);
//		
//		LinkedList listC = new LinkedList();
//		
//		int aIndex = 0, bIndex = 0, cIndex = 0;
//		
//		int sizeA = listA.size();
//		
//		int sizeB = listB.size();
//		
//		int sizeC = sizeA + sizeB;
//		
//		while(aIndex <= sizeA && bIndex <= sizeB){
//			if((Integer)listA.get(aIndex) < (Integer)listB.get(bIndex)){
//				listC.add(listA.get(aIndex++));
//			}else{
//				listC.add(listB.get(bIndex++));
//			}
//		}
//		
//		while(aIndex < sizeA ){
//			listC.add(listA.get(aIndex++));
//		}
//		
//		while(bIndex < sizeB ){
//			listC.add(listA.get(bIndex++));
//		}
//		
//		System.out.println(listC);
		
	}
	
	public static void mergeSort(int[] workspace, int low, int high){
		
		if(low == high) return;
		
		else{
			int mid = (low + high) / 2;
			
			mergeSort(workspace, low, mid);
			
			mergeSort(workspace, mid+1, high);
			
			merge(workspace, low, mid + 1, high);
		}
		
	}
	
	public static void merge(int[] workspace, int low, int mid, int high){
		
		int j = 0;
		int n = high - low + 1;
		int lowEnd = mid - 1;
		int lowBound = low;
		
		
		while( low <= lowEnd && mid <= high ){
			
			if(input[low] < input[mid]){
				workspace[j++] = input[low++];
			}else{
				workspace[j++] = input[mid++];
			}
			
		}
		
		while( low <= lowEnd ){
			workspace[j++] = input[low++];
		}
		
		while(mid <= high){
			workspace[j++] = input[mid++];
		}
		
		for(j = 0; j < n; j++){
			input[lowBound + j] = workspace[j];
		}
		
	}
	
	public void mergeS(int[] workspace, int low,int mid, int high){
		
		int j = 0;
		
		int lowBound = low;
		
		int lowEnd = mid - 1;
		
		int n = high - low + 1;
		
		while( low <= lowEnd && mid <= high ){
			
			if( input[low] < input[mid] )
				workspace[j++] = input[low++];
			else
				workspace[j++] = input[mid++];
			
		}
		
		while( low <= lowEnd )
			workspace[j++] = input[low++];
		
		while( mid <= high )
			workspace[j++] = input[mid++];
		
		for( j= 0; j< n; j++ )
			input[lowBound + j] = workspace[j];
			
	}
	
	
}

package demo.demo;

public class BinarySearch {
	
	public static void binerySearch(int []array,int first,int last,int key){
		// mid number
		int mid = (first+last)/2;
		while(first<=last){
			if (array[mid]<key){
				first= mid+1;
			}else if (array[mid]==key){
				System.out.println("Element is found " +mid);
				break;
			}else{
				last = mid -1;
			}
			mid= (first+last)/2;
		}if (first>last){
			System.out.println("Element not found");
		}
		
	}
	
	public static void main (String[]args){
		int array[] = {10,20,30,40,50,70};  
        int key = 70;  
        int last = array.length-1;
        binerySearch(array,0,last,key);
	}

}

package demo.demo;

public class BubblesortTest {
	
	public static void bubblesort(int []A){
		int temp;
		int n = A.length;
		for (int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if (A[j-1]>A[j]){
					temp= A[j-1];
					A[j-1]=A[j];
					A[j]=temp;
				}
			}
		}
		
		
	}
	
public static void main (String[]args){
	int[]A={5,30,120,5,8,9,3,4,160};
	
	System.out.println("Befor sort the numbers are belo");
	for (int numbers: A){
		System.out.print(numbers+",");
	}
	System.out.println();
	System.out.println("After Bubble sort");
	bubblesort(A);
	for (int numbers:A){
		System.out.print(numbers+",");
	}
	System.out.println();
}
}

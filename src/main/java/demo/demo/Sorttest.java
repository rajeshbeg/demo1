package demo.demo;
public class Sorttest {
	public static void Selectionsort(int []number){
	for (int i=0;i<number.length-1;i++){
		int index=i;
		for (int j=i+1;j<number.length;j++){
			if(number[index]>number[j]){
				index =j;
			}
		}
		int smallerNumber= number[index];
		number[index]=number[i];
		number[i]=smallerNumber;
	}	
	}
	
	public static void main (String args[]){
		int number[]={9,3,4,2,8,7,2,3,4};
		System.out.println("Before Sorting the numbers are ");
		for (int i: number){
			System.out.print(i+",");
		}
		System.out.println();
		
		
		Selectionsort(number);
		System.out.println("After Selection Sort");
		for(int i: number){
			System.out.println(i+" ");
		}
	}
	
}



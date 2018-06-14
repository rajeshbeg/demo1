package demo.demo;

public class MergesortTest {

	private int[] array;
	private int[] tempMergArr;
	private int length;
	
	public void sort(int[]inputArr){
		this.array= inputArr;
		this.length=inputArr.length;
		this.tempMergArr=new int[length];
	}
	public void doMerge(int higherIndex,int lowerindex){
		if(lowerindex<higherIndex){
			int middle= lowerindex +(higherIndex-lowerindex)/2;
			//below step sort the left side of the array
			doMerge(lowerindex, middle);
			// below step merge the right side 
			doMerge(middle+1, higherIndex);
			// merge both the side
			mergePart(higherIndex,middle, lowerindex);
		}
	}
	public void mergePart(int lowerindex,int middle,int higherindex){
		for (int i=lowerindex; i<=higherindex; i++){
			tempMergArr[i]=array[i];
		}
		
		int i = lowerindex;
        int j = middle + 1;
        int k = higherindex;
        
        while (i<=middle && j<=higherindex){
        	if(tempMergArr[i]<=tempMergArr[j]){
        		array[k]=tempMergArr[i];
        		i++;
        	}else{
        		array[k]=tempMergArr[j];
        		j++;
        	}
        	k++;
        }
        while (i<=middle){
        	array[k]=tempMergArr[i];
        	k++;
        	i++;
        	
        }
	}
	
	public static void main (String []args){
		// input
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		
		MergesortTest mt= new MergesortTest();
		mt.sort(inputArr);
		for(int i: inputArr){
			System.out.print(i);
			System.out.println(" ");
		}

	}

}



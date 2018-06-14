package demo1;

public class SortTest {
	
		public static void sortTest(int []A)
		{
		for (int i=0;i<A.length-1;i++){
			int index=i;
			for (int j=i+1;j<A.length;j++){
				if (A[i]>A[j]){
					index=j;
				}	
			}
				int smallnum= A[index];
				A[index]=A[i];
				A[i]=smallnum;
			
}
		}
public static void main (String args[]){
	int A[]={4,3,5,8,9,1};
sortTest(A);

for (int x : A){
	System.out.print(x);
	System.out.print(",");
}
}
}
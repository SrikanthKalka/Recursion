
public class SortedArrayRecursion {

	
	public static void main(String[] args) {
		int index = 5;

		int sortedArray[] = new int[6]; 
		sortedArray[0]= 30;
		sortedArray[1]= 25;
		sortedArray[2]= 20;
		sortedArray[3]= 15;
		sortedArray[4]= 10;
		sortedArray[5]= 5;
		System.out.println("Array values"+sortedArray.getClass());
		SortedArrayRecursion object = new SortedArrayRecursion();
	
		
		System.out.println("IsSorted Array --->"+object.isArraySortedOrder(sortedArray,index));
	}

	public boolean isArraySortedOrder(int[]A, int index){
		if(A.length==1){
			return true;	
		} else {
			System.out.println("------>"+((A[index-1]<A[index-2])?true:isArraySortedOrder(A,index-1)));
			return(A[index-1]<A[index-2])?true:isArraySortedOrder(A,index-1);
		
		}
		
		
	}
}

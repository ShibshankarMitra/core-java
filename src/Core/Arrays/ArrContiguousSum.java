package Arrays;

public class ArrContiguousSum {
	
	int contigousSumOfArr(int[] arr) {
		
		int max_so_far=arr[0];
		int max_ending_here=0;
		
		for(int i=0;i<arr.length;i++) {
			max_ending_here= max_ending_here+arr[i];
			if(max_ending_here<0)
				max_ending_here=0;
			else if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int[] arr= {4, -2, -3, 4, -1, -2, 1, 5, -3};
		ArrContiguousSum ags= new ArrContiguousSum();
		System.out.println(ags.contigousSumOfArr(arr));

	}

}

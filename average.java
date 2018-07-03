public class average{
    public static void main (String[] args){
        int[] arr = {2,20,3};
		int sum = 0;
		double avg;
		
		for (int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println(avg);
    }
}
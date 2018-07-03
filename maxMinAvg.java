public class maxMinAvg {
    public static void main(String[] args){
        int[] arr = {1, 5, 10, -2,45,23,78};
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		int avg;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
			sum += arr[i];
		}
		
		avg = sum/arr.length;	
		System.out.println("Max is: " + max + " Min is: " + min + " Avg is: " + avg);

    }
}
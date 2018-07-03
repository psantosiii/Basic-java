public class greaterThanNum{
    public static void main(String[] args){
        int[] x = {1,3,5,3,7,6,3,9,3};
		int num = 6;
		int counter = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] == num)
				counter++;
		}
		
		System.out.println(counter);
    }
}
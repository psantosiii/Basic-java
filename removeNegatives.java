public class removeNegatives {
    public static void main(String[] args){
        int[] arr = {1,2,3,-5,-6,-8,8,9,0};
        for(int i = 0;i <= arr.length;i++){
            if (arr[i] < 0)
                arr[i] = 0;
                System.out.println(arr[i]);
        }
    }
}
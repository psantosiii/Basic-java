public class odds {
    public static void main(String[] args){
        int[] arr = new int[133];
        int counter = 0;

        for(int i = 0; i <= 255;i++){
            if (i % 2 != 0){
                arr[counter] = i;
                System.out.println(arr[counter]);
                counter++;
            }
        }

    }
}
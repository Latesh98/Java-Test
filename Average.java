public class Average {
    public static void main(String[] args) {
        int arr[] = new int[]{45,8,32,97,55,11};
        double sum=0;

         int i=0;
        do{

            sum += arr[i];
            i++;
        }while(i<arr.length);
    

        double avg = sum/arr.length;
        System.out.println(avg);

    }
    
}

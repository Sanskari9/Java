public class Practice {
    public static void main(String [] args) {
        int arr [] ={5,4,2,6,1,8};
        for(int i=0;i<arr.length-1; i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
    }
}

public class Arrays {
    public static int sum(int arr[], int n){
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1=sum1+arr[i];
        }
        return sum1;
    }
    public static void main(String [] args) {
        int arr[] = {4,6,8,9,3};
        int n=arr.length;
        int a=sum(arr,n);
        System.out.println(a);
        
    }
}

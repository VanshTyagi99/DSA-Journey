class secondmax{
    public static void main(String args[]){
        int [] arr= {2,4,56,127,127,56};
        int n=arr.length;
       int max=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];

        }
       }
       for(int j=0;j<n;j++){
         if(arr[j]>smax && arr[j]!=max){
            smax=arr[j];
         }
       }
       System.out.println("Maximum=="+max);
       System.out.println("Second Maximum=="+smax);
    }
}
class wavearray{
    public static void main (String [] args){
        //array sorted

        int [] arr={1,4,5,7,8};
        int n= arr.length;

        for(int i=0;i<n;i+=2){
            if(i==n-1) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int ele:arr){
            System.out.print(" "+ele);
        }
    }
}

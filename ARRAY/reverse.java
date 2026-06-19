class reverse{
    public static void main(String [] args){
        int [] arr={2,45,6,4,3,56};
        int n=arr.length;
        int l=n/2;
        
        for(int i=0;i<l;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;

            
    }
    for(int ele:arr){
        System.out.print(ele+" ");
    }
        }
       
    }

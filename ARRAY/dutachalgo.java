           //Dutch National Flag Algorithm\

class dutachalgo{
    public static void main(String [] args){
        int [] arr={2,1,0,2,0,1,0};
        int n= arr.length;
        int start=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){

            if(arr[mid] ==0){
                swap(arr,start,mid);
                start++;
                mid++;

            }

            else if(arr[mid]==1){
                mid++;
            }

            else{
                swap(arr,mid,high);
                
                high--;
            }
        }

        for(int ele:arr){
            System.out.print(" "+ ele);
        }


    }

    static void swap(int arr[] , int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}           


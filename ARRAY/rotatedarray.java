class rotatedarray{
    public static void main(String[] args) {
        int [] arr={3,4,6,8,9,12,4};
        int n=arr.length;
     //   int i=0;
        int d=3;   //rotated array position-means 3rd se array ko rotate karna hai 
    //    int m=d-1;
    //    int j=n-1;      
    
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);

/* 
    System.out.println("  ");

        while(i<m){
           int temp=arr[i];
           arr[i]=arr[m];
           arr[m]=temp;
           i++;
           m--;
        }
       
   

         while(d<j){
           int temp=arr[d];
           arr[d]=arr[j];
           arr[j]=temp;
           d++;
           j--;
        }
i = 0;
j = n - 1;

     System.out.println("  ");
          while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
     */   
    for(int ele: arr){
        System.out.print(" "+ele);
    }

    



    }

   

    static void reverse(int arr[],int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }

}
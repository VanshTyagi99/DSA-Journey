class mergesorted{
    public static void main(String [] args){
        
        int [] arr1={2,5,7,8};
        int [] arr2={1,3,9,11,32};

        int n= arr1.length+arr2.length;
        int [] arr3= new int[n];
              
        merge(arr3,arr1,arr2);

        System.out.print("Sorted array is: ");
        for(int ele:arr3){
            System.out.print(" "+ele);
        }
        

    }

    static void merge(int[] arr3,int[] arr1, int[] arr2 ){
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            
            }
        }

        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }

    }
}
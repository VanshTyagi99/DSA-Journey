
class segration01 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 1, 0};
        int n = arr.length;
        int countzero=0;
        int countone=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countzero++;
            } else {
                countone++;
            }
        }

        for(int j=0;j<n;j++){
            if(j<countzero){
                arr[j]=0;
            }
            else{
                arr[j]=1;
            }

        }

        for(int ele:arr){
            System.out.print(" " +ele);
        }
    }
}

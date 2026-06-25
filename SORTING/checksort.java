
class checksort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,6, 4, 5,5};
        int i = 0;
        int j = 1;
        int n = arr.length;
        boolean a = false;

        while(j < n)
        {
            if (arr[i] <= arr[j]) {
                a = true;
            } else {
                a = false;
                break;
            }
            i++;
            j++;
        }
        if (a == true) {
            System.out.println("Sorted");

        } else {
            System.out.println("Not sorted");
        }

    }
}

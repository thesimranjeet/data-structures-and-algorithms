class InsertionSortRecursion{
    public static void main(String[] args){
        int[] a={22,34,-15,1,9,-22};

        insertionSort(a,1);

        for(int x:a){
            System.out.print(x+" | ");
        }
    }

    public static void insertionSort(int[] a, int n){
        // int n=a.length;
        // for(int i=1;i<n;i++){
        //     int temp=a[i];
        //     int j;
        //     for(j=i;j>0&&a[j-1]>temp;j--){
        //         a[j]=a[j-1];
        //     }
        //     a[j]=temp;
        // }
        // return;

        if(n==a.length){
            return;
        }

        int temp=a[n],j;
        for(j=n;j>0 && a[j-1]>temp;j--){
            a[j]=a[j-1];
        }

        a[j]=temp;

        insertionSort(a, n+1);

        return;

    }

}
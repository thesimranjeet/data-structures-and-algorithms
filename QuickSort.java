class QuickSort{

    public static void main(String[] args){

        int[] a={22,34,-15,1,9,-22};

        quickSort(a, 0, a.length);

        for(int x:a){
            System.out.print(x+" | ");
        }

    }

    public static void quickSort(int [] a, int start, int end){

        if(end-start<2){
            return ;
        }

        int pivotIndex=partition(a,start,end);
        quickSort(a,start,pivotIndex);
        quickSort(a,pivotIndex+1,end);

    }

    public static void partition(int [] a, int start, int end){
        int pivot=a[start];
        int i=start;
        int j=end;

        while(i<j){


            //Note: empty loop
            while(i<j && a[--j]>=pivot);

            if(i<j){
                a[i]=a[j];
            }

            //Note: empty loop
            while(i<j && a[++i]<=pivot);

            if(i<j){
                a[j]=a[i];
            }

        }


        a[j]=pivot;
        return j;
    }
}
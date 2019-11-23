class MergeDesc{
    public static void main(String[] args){

        int[] a={22,34,-15,1,9,-22};

        mergeSort(a, 0, a.length);
        for(int x:a){
            System.out.print(x+" | ");
        }

    }


    public static void mergeSort(int[] a, int start, int end){
        if(end-start<2){
            return;
        }

        int mid=(start+end)/2;
        mergeSort(a, start, mid);
        mergeSort(a, mid, end);
        merge(a, start, mid, end);

    }

    public static void merge(int [] a,int start, int mid, int end){
        if(a[mid-1]>=a[mid]){
            return;
        }
        int i=start;
        int j=mid;

        int tempAdd=0;
        int[] temp=new int[end-start];
        while(i<mid && j<end){
            temp[tempAdd++]=a[i]>=a[j]?a[i++]:a[j++];
        }

        //{22,34,-15,1,9,-22}
        System.arraycopy(a,i,a,start+tempAdd,mid-i);
        System.arraycopy(temp, 0, a, start, tempAdd);
        return;

    }


}
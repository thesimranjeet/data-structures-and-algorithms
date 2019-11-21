class RadixSort{
    public static void main(String[] args){

        int a[]={4725,4586,1330,8792,1594,5729};

        radixSort(a, 10, 4);


        for(int x:a){
            System.out.print(x+" | ");
        }
    }

    public static void radixSort(int[] a, int radix, int width){

        for(int i=0;i<width;i++){
            radixSingleSort(a,i,radix);
        }
    }

    public static void radixSingleSort(int[] a,int position, int radix){
        int[] countArray=new int[radix];
        for(int x:a){
            countArray[getDigit(position,x,radix)]++;
        }

        for(int i=1;i<radix;i++){
            countArray[i]+=countArray[i-1];
        }

        int[] temp=new int[a.length];

        for(int i=a.length-1;i>=0;i--){
            temp[--countArray[getDigit(position, a[i], radix)]]=a[i];
        }

        System.arraycopy(temp, 0, a, 0, a.length);

        return;


    }

    public static int getDigit(int position, int value, int radix){
        return (value/(int)(Math.pow(10, position)) ) % radix;
    }
}
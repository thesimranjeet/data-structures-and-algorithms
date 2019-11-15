package DSA;

class InsertionSort{
    public static void main(String[] args){
        System.out.println("Hello World");

        int[] a={22,34,-15,1,9,-22};

        int n=a.length;

        for(int i=1;i<n;i++){
            int t=a[i];
            for(j=i;j>0;j--){
                if(a[i-1]>t){
                    a[i]=a[i-1];
                }
            }

            // swap(a, i, m);
        }

        for(int x:a){
            System.out.println(x);
        }

    }

    // public static void swap(int[] a, int i, int j){
    //     if(i==j){
    //         return;
    //     }

    //     int t=a[i];
    //     a[i]=a[j];
    //     a[j]=t;
    // }
}
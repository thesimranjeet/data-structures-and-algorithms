class bubblesort{
    public static void main(String[] args){
        System.out.println("Hello World");

        int[] a={22,34,-15,1,9,-22};

        int n=a.length;

        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    swap(a, i, j);
                }
            }
        }

        for(int x:a){
            System.out.println(x);
        }

    }

    public static void swap(int[] a, int i, int j){
        if(i==j){
            return;
        }

        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
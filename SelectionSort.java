class SelectionSort{
    public static void main(String[] args){
        System.out.println("Hello World");

        int[] a={22,34,-15,1,9,-22};

        int n=a.length;

        for(int i=n-1;i>0;i--){
            int j,m=0;
            for(j=0;j<i;j++){
                if(a[m]<a[j]){
                    m=j;
                }
            }

            swap(a, i, m);
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
class CountingSort{
    public static void main(String [] args){
        int a[]={2,5,9,8,2,8,7,10,4,3};

        countSort(a);

        for(int x:a){
            System.out.print(x+"|");
        }

    }

    public static void countSort(int[] a){
        int m=0;

        for(int x:a){
            m=x>m?x:m;
        }

        int[] f=new int[m+1];

        for(int x:a){
            f[x]++;
        }

        for(int i=0,j=0;i<=m;i++){
            if(f[i]>0){
                while(f[i]!=0){
                    a[j++]=i;
                    f[i]--;
                }
            }
        }

        return;

    }
}
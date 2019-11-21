class CountingSort{
    public static void main(String[] args){
        int a[]={2,5,9,8,2,8,7,10,4,3};

        //countSort(a);
        stableCountSort(a);

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

    public static void stableCountSort(int[] a){
        int m=0;

        for(int x:a){
            m=x>m?x:m;
        }

        int[] f=new int[m+1];

        for(int x:a){
            f[x]++;

        }
        int temp=0;

        // for(int x:f){
        //     System.out.print(x+" F ");
        // }

        for(int i=1;i<f.length;i++){
            temp+=f[i];
            f[i]=temp;

            //System.out.print(temp+" T ");

        }

        int[] te = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            //int a[]={2,5,9,8,2,8,7,10,4,3};
            f[a[i]]-=1;
            te[f[a[i]]]=a[i];

        }

        // for(int x:te){
        //     System.out.print(x+" TE ");
        // }

        System.arraycopy(te, 0, a, 0, a.length);

        // for(int i=0,j=0;i<=m;i++){
        //     if(f[i]>0){
        //         while(f[i]!=0){
        //             a[j++]=i;
        //             f[i]--;
        //         }
        //     }
        // }

        return;

    }
}
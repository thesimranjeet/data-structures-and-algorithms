class Factorial{
    static int x[]=new int [1000];
    public static void main(String [] args){

        System.out.println(fact(5));

        System.out.println(factd(7));

        System.out.println(facti(7));
    }

    // Factorial using recursion
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return(n * fact(n-1));
    }

    // Factorial using recursive DP
    public static int factd(int n){
        if(n==0 || n==1){
            return 1;
        }
        else if(x[n]>0){
            return x[n];
        }
        else{
            x[n]=n*fact(n-1);
            return x[n];
        }
    }

    // Factorial using Iterative DP
    public static int facti (int n){
        int a[]=new int[n+1];
        a[1]=1;
        //int f=1;
        for(int i=2;i<=n;i++){
            a[i]= i* a[i-1];
        }

        return a[n];
    }
}
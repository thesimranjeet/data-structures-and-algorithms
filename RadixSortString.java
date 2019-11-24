class RadixSortString{
    public static void main(String[] args){

        String[] s={"bcdef","dbaqc","abcde","omadd","bbbbb"};

        radixSort(s,26,5);

        for(String x:s){
            System.out.print(x+" | ");
        }

    }

    public static void radixSort(String[] s,int radix,int width){

        for(int i=0;i<width;i++){
            radixSingleSort(s, width-i-1, radix);
        }

        return;

    }

    public static void radixSingleSort(String[] s,int pos,int radix){
        int count[]=new int[radix];

        for(int i=0;i<s.length;i++){
            count[getCharValue(s[i], pos)]++;

            //System.out.print(getCharValue(s[i], pos)+" // ");
        }

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        String[] ts=new String[s.length];

        for(int i=s.length-1;i>=0;i--){
            ts[--count[getCharValue(s[i], pos)]]=s[i];
        }

        System.arraycopy(ts, 0, s, 0, s.length);

        return;

    }

    public static int getCharValue(String s, int pos){
        char c=s.charAt(pos);
        int x=Integer.valueOf(c);
        return x-97;

    }
}
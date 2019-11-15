class ShellSort {
    public static void main(String[] args) {
        System.out.print("world !");

        int[] a = { 22, 34, -15, 1, 9, -22 };

        int n = a.length;

        for (int g = n / 2; g > 0; g /= 2) {
            for (int i = g; i < n; i++) {
                int t = a[i];
                int j;
                for (j = i; j >=g; j-=g) {
                    if (a[j-g] > t) {
                        a[j] = a[j-g];
                    } else {
                        break;
                    }
                }
                a[j]=t;
            }
        }

        for (int x : a) {
            System.out.print(x + " | ");
        }

    }
}
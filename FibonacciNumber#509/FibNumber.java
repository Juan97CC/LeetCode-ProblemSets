class FibNumber{
    static int fib (int n){
        if (n == 0 ) return 0;
        if (n == 1 || n == 2) return 1;

        int curr = 0, i = 2;
        int prev1 = 1, prev2 = 1;

        while (i < n){
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
            i++;
        }
        return curr;
    }

    public static void main (String[] args){
        int n = 9;
        int n1 = 6;
        System.out.println(fib(n));
        System.out.println(fib(n1));
    }




}
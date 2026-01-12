public class ClimbingStairs {

    static int climbStairs(int n) {

        int i = 0; // each step
        int n1 = 0, n2 = 1, current = 0;;
        while (i < n) {
            current = n1 + n2; // past two steps is equivalent to current step
            n1 = n2;
            n2 = current;
            i++;
        }

        return current;
    }
    

    public static void main(String[] args) {
        int n = 5;
        int n1 = 6;

        System.out.println(climbStairs(n));
        System.out.println(climbStairs(n1));
    }
}

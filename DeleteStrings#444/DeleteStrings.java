public class DeleteStrings {

    static int whichIsGreater(String num1, String num2){
        if (num1.length() != num2.length()){
            return num1.length() - num2.length();
        }
        return num1.compareTo(num2);
    }



    static String deleteString(String num1, String num2){

        int leadingNum = whichIsGreater(num1, num2);
        if (leadingNum < 0) { // num2 is greater than num1, so swap values then append a negative sign at the end
            String temp = num1;
            num1 = num2;
            num2 = temp;

        }

        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int borrow = 0;




        StringBuilder result = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 ) {
            int n1Value = (n1 >= 0) ? num1.charAt(n1) - '0' : 0;
            int n2Value = (n2 >= 0) ? num2.charAt(n2) - '0' : 0;

            // In case borrow == 1, then we must subtract it from n1Value
            if (borrow == 1) {
                n1Value = n1Value - 1;
                borrow = 0;
            }

            // In case we have to borrow
            if (n1Value < n2Value) {
                borrow = 1;
                n1Value = n1Value + 10;
            }

            int sum = n1Value - n2Value;

            result.append(sum);


            n1--;
            n2--;

        }

        String ans = result.reverse().toString();

        // Remove leading zeros
        int k = 0;
        while (k < ans.length() - 1 && ans.charAt(k) == '0') { k++; }

        ans = ans.substring(k);

        if (leadingNum < 0) ans = "-" + ans;
        return ans;

    }

    public static void main(String[] args) {


        String num1 = "52";
        String num2 = "19";
        String num3 = "1";
        String num4 = "991";
        String num5 = "10000";
        String num6 = "100";


        System.out.println("Result : 52 - 19 = " + deleteString(num1, num2));
        System.out.println("Result : 1 - 991 = "+ deleteString( num3, num4));
        System.out.println("Result : 1000 - 100 = "+ deleteString( num5, num6));



    }
}

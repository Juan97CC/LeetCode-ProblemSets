public class AddStrings{

    static String addStrings(String num1, String num2){
        int i = num1.length() - 1; // index for last character of num1/n1
        int j = num2.length() - 1; // index for last character of num2/n2
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0){
            
            int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + carry;

            carry = sum / 10;
            int digit = sum % 10;
            result.append(digit);
            i--;
            j--;
        }

        // indices for last characters are stored in `i` and `j`
        return result.reverse().toString();
    }
        


        public static void main(String[] args){
        String num1 = "456";
        String num2 = "77";
        String result = addStrings(num1, num2);
        System.out.println("Sum: " + result); // Output: Sum: 533


    }

    }


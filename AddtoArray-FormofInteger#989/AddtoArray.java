import java.math.BigInteger;
import java.util.*;

class addToArray {

    static List<Integer> addToArrayForm(int[] num, int k) {
        // Brute Force Solution
        /*
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < num.length; i++){
            sb.append(num[i]);
            }
            String strNum = sb.toString();
            BigInteger n = new BigInteger(strNum);
            System.out.println(n);

            n = n.add(BigInteger.valueOf(k));
            strNum = n.toString();

            List <Integer> res = new ArrayList<>();


            for (int j = 0; j < strNum.length(); j++){
            String d = String.valueOf(strNum.charAt(j));
            int f = Integer.parseInt(d);
            res.add(f);

            }

            return res;
        */
        
        // Optimized Solution
        int carry = 0;
        
        String[] strK = Integer.toString(k).split("");

        int i = num.length -1 ;
        int j = strK.length - 1;
        List <Integer> res = new ArrayList<>();

        while( j >= 0 || carry != 0 || i >= 0 ){

            int temp = (j >= 0) ? Integer.parseInt(strK[j]) : 0;
            int n = (i >= 0)? num[i] : 0;

            int sum = n + temp + carry;
            carry = sum / 10;
            int r = sum % 10;
        
            res.add(r);
            j--;
            i--;

        }

        Collections.reverse(res);
        return res;

    }


        public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println(result); // Output: [1, 2, 3, 4]
        }



        

    }

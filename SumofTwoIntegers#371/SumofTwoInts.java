class SumofTwoInts {
    
        static int add(int a, int b){
            int carry = 0;

            // Using bitwise operations to calculate sum
            while (b != 0) {
                carry = (a & b) << 1;
                a = a ^ b;
                b = carry;
        }
        return a;
    }



        public static void main(String[] args) {
           
            int result = add(1, 3);
            System.out.println("The sum is: " + result); //  sum is: 4
        }
       
}



       
    

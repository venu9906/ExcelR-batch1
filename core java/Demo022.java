public class Demo022 {
        static int isPalindrome(int x){
            if(x<=0){
                return -1;
            }        
            int original = x;
            int reversed = 0;
            while(x>0){
                int digit = x%10;
                reversed = reversed * 10 + digit;
                x = x/10;
            }
            return (original==reversed) ? 1 : 0;
        }
        public static void main(String[] args) {
            System.out.println(isPalindrome(101));
        }
    }

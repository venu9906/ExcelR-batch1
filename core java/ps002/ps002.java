package ps002;

class NextMultipleof100 {
    public static int getNextMultipleof100(int num) {
         if (num <= 0)
             return -1;
         return ((num / 100) + 1) * 100;
    }
}

public class ps002 {
    public static void main(String[] args) {
        NextMultipleof100 obj = new NextMultipleof100();
        int num = 223;
        System.out.println(obj.getNextMultipleof100(num));
    }
}
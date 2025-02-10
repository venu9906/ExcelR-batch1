public class Demo067 {
    public static void main(String[] args) {
        int[] array = {1, 12, 23, 42, 11};
        System.out.println("Even elements: ");
        for(int element : array){
            if(element % 2 == 0){
                System.out.println(element+ " ");
            }

        }

        }
    }
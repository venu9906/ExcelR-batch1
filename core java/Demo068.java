public class Demo068 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 12, 36, 4};

        int cout=0;
        for(int element : array){
            if(element % 2 == 0){
                System.out.println(element+" ");
                cout++;
            }
        }
        System.out.println("cout of even numbers: "+cout);

    }
}

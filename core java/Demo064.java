public class Demo064 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40};
        System.out.println("original array: ");
        for(int element :  array){
            System.out.println(element+" ");
        }
        System.out.println();

        int temp=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=temp;

        System.out.println("after swap: ");
        for(int element : array){
            System.out.println(element+" ");
        }
    }

}
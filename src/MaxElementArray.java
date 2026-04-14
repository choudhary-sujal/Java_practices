public class MaxElementArray {
    public static void main(String[] args){

        int array[]= {1,3,5,89,34,67,56,78};

        int max = array[0];

        for (int i=1; i<array.length; i++){
            if (array[i]> max) {
                max =array[i];

            }
        }
        System.out.println("The maximum number is = "+max);

    }
}

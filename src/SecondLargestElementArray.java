public class SecondLargestElementArray {
    public static void main(String[] args){

        int[] array = {10, 5, 20, 8, 16};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0; i< array.length;i++){
            int num = array[i];

            if (num>largest){
                secondLargest= largest;
                largest=num;
            } else if (num > secondLargest && num != largest) {
                secondLargest=num;
                
            }
        }
        System.out.println("SecondLargest Number is = "+ secondLargest);


    }
}

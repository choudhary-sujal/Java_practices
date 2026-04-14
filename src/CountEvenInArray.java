public class CountEvenInArray {
    public static void main(String[] args){

        int array[] = {1,2,5,6,9,76,45};

        int count =0;
        for (int i=0;i < array.length; i++){
            if (array[i] %2 ==0)
                count++;

        }
        System.out.print(count);

    }
}

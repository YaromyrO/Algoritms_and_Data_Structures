package algoritms.insertion;

public class Insertion {

    private int[] numbers;
    private int temp;
    private int j;

    public void sort(int[] array){
        this.numbers = array;
        insertion();
    }

    private void insertion(){

        for(int i = 1; i < numbers.length; i++){
            temp = numbers[i];
            j = i - 1;
            while (j >= 0 && numbers[j] > temp){
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = temp;
        }

    }
}

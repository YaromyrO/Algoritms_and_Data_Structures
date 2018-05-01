package algoritms.bubble;

public class Bubble {

    private int[] numbers;
    private int number;

    public void sort(int[] array){
        this.number = array.length;
        this.numbers = array;
        bubble();
    }

    private void bubble(){

        for(int i = 0; i < number; i++){
            for(int j = 1; j < (number - i); j++){
                if(numbers[j-1] > numbers[j]){
                    exchange(j-1, j);
                }
            }
        }

    }

    private  void exchange(int i ,int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}

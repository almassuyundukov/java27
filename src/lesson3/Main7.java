package lesson3;

public class Main7 {
    public static void main(String[] args) {
        // создать массив такой же длины, в каждую ячейку
        int[] numbers = {1, 7, 10, 95, 86, 76, 100, 2, 75};
        int[] summa = new int[numbers.length];
        summa[0]=numbers[0]+numbers[1];
        for(int i = 0;i< numbers.length;i++){
            if(i == 0) {
                summa[0] = numbers[0] + numbers[1];
            }
            else if (i == numbers.length-1){
                    summa[numbers.length-1] = numbers[numbers.length-1]+numbers[numbers.length-2];
                } else {
                    summa[i]= numbers[i-1]+numbers[i]+numbers[i+1];
                }
            System.out.println(summa[i]);
        }
    }
}

package lesson16;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils{
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if(number1 == null || number2 == null){
            throw new NullPointerException("number1 == null || number2 == null");
        }

        double num1 = 0;
        double num2 = 0;
        try{
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e){
            throw new NumberFormatException("number1 не число!!!");
        }

        try{
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e){
            throw new NumberFormatException("number2 не число!!!");
        }

        if(num2 == 0.0){
            throw new ArithmeticException("деление на ноль запрещено!");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if(text == null || word == null){
            throw new NullPointerException("text == null || word == null");
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        String[] words = text.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].contains(word)){
                numbers.add(i);
            }
        }
        int[] result = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++){
            result[i] = numbers.get(i);
        }

        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> numbers = new ArrayList<>();
        Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);
        while (m.find()){
            numbers.add(Double.parseDouble(m.group(1)));
        }

        if(numbers.size() == 0){
            throw new CustomException("Чисел не обнаружено");
        }
        double[] result = new double[numbers.size()];
        for(int i = 0; i < numbers.size(); i++){
            result[i] = numbers.get(i);
        }
        return result;
    }
}

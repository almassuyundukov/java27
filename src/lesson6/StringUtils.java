package lesson6;

public class StringUtils {


    /**
     * 1 - модификатор доступа (одно из 4ч видов слов,
     * которое регулирует область видиммости данного метода)
     * public - доступен внутри всего проекта
     * ______ - доступен внутри текущего пакета
     * protected - доступен внутри пакета и класса наследником
     * private - доступ внутри текущего класса
     * 2 - static (или пишем,или нет).
     * 3 - возвращаемый тип (int, String, Date, ...) или void если ничего не возвращается
     * 4 - название метода
     * 5 - входящие параметры (String text, int count) ...
     * 6 - тело метода, то что будет происходить, при вызове данного метода
     */

    public static int countGlassFromText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'i' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'y' || text.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void printTextByWords(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("?", "");
        text = text.replace(";", "");
        text = text.replace("#", "");
        text = text.replace(":", "");
        text = text.replace(">", "");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void coding(String textByCoding) {
        // textByCoding = qwdhwq98y --
        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        String alphabetUpper = alphabet.toUpperCase();
        String result = "";
        for (int i = 0; i < textByCoding.length(); i++) {
            int index = alphabet.indexOf(textByCoding.charAt(i));
            int indexUpper = alphabetUpper.indexOf(textByCoding.charAt(i));
            if (index >= 0) {
                result = result + alphabet.charAt(index + 1);
            } else if (indexUpper >= 0) {
                result = result + alphabetUpper.charAt(indexUpper + 1);
            } else {
                result = result + textByCoding.charAt(i);
            }
        }
        System.out.println(result);
    }

    // Д/З 1) подсчет кол-ва слов в тексте
    public static void countWords(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("?", "");
        text = text.replace(";", "");
        text = text.replace("#", "");
        text = text.replace(":", "");
        text = text.replace(">", "");
        String[] words = text.split(" ");
        int countWords = 0;
        for (int i = 0; i < words.length; i++) {
            countWords++;
        }
        System.out.println(countWords);
    }

    // 2) печатает слова наоборот

    public static void wordsInTextReversed(String text) {
        String[] words = text.split(" ");
        String textByReversed = "";
        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
                String[] lettersByWords = words[i].split("");
                for (int j = lettersByWords.length - 1; j >= -1; j--) {
                    if (j >= 0) {
                        textByReversed = textByReversed + lettersByWords[j];
                    } else {
                        textByReversed = textByReversed + " ";
                    }
                }
            } else {
                String[] lettersByWords = words[i].split("");
                for (int j = lettersByWords.length - 1; j >=0; j--) {
                        textByReversed = textByReversed + lettersByWords[j];
                    }
                }
            }
        System.out.println(textByReversed);
    }

    // 3) Напечатать число согласных букв
    public static int countSoglassFromText(String text) {
        String textLower = text.toLowerCase();
        int countSoglass = 0;
        for (int i = 0; i < text.length(); i++) {
            if (textLower.charAt(i) == 'q' || textLower.charAt(i) == 'w'
                    || textLower.charAt(i) == 'r' || textLower.charAt(i) == 't'
                    || textLower.charAt(i) == 'p' || textLower.charAt(i) == 's'
                    || textLower.charAt(i) == 'd' || textLower.charAt(i) == 'f'
                    || textLower.charAt(i) == 'g' || textLower.charAt(i) == 'h'
                    || textLower.charAt(i) == 'j' || textLower.charAt(i) == 'k'
                    || textLower.charAt(i) == 'l' || textLower.charAt(i) == 'z'
                    || textLower.charAt(i) == 'x' || textLower.charAt(i) == 'c'
                    || textLower.charAt(i) == 'v' || textLower.charAt(i) == 'b'
                    || textLower.charAt(i) == 'n' || textLower.charAt(i) == 'm'){
                countSoglass++;
            }
        }
        return countSoglass;
    }

    // 4) площадь по 3-м сторонам треугольника
    public static double ploshadOnThreeSides (String aString,String bString,String cString){
        double a = Double.parseDouble(aString);
        double b = Double.parseDouble(bString);
        double c = Double.parseDouble(cString);
        double poluperimetr = (a + b +c)/2;
        double ploshadThreeSides = Math.sqrt(poluperimetr*(poluperimetr-a)*(poluperimetr-b)*(poluperimetr-c));
        return ploshadThreeSides;
    }

    // 5) Площадь по высоте и основанию
    public static double ploshadByHeightAndBase (String baseString, String hString){
        double base = Double.parseDouble(baseString);
        double h = Double.parseDouble(hString);
        double ploshadByHeightAndBase = (base*h)/2;
        return ploshadByHeightAndBase;
    }
}

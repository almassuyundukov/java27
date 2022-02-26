package lesson7;

public class DZ7 {
    // 1) подсчет четных цифр в массиве
    public static int countChetInMassiv(int[] numbers) {
        int countChet = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2== 0){
                countChet++;
            }
        }
        return countChet;
    }
    // 2) проверка пароля
    public static boolean checkPassword(String password) {
        char currentSymbol;
        boolean capitalFlag = false;
        boolean numberFlag = false;
        for(int i=0;i < password.length();i++) {
            currentSymbol = password.charAt(i);
            if( Character.isDigit(currentSymbol)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(currentSymbol)) {
                capitalFlag = true;
            }
            if(numberFlag && capitalFlag && password.length()>=8)
                return true;
        }
        return false;
    }

    // 3) проверка email на валидность
    public static boolean emailValidity (String email){
        char currentSymbol;
        boolean sobachkaFlag = false;
        boolean pointFlag = false;
        int countSobachka = 0;
        int countPoint = 0;
        if(!email.startsWith(".") && !email.endsWith(".")) {
            for (int i = 0; i < email.length(); i++) {
                currentSymbol = email.charAt(i);
                if (currentSymbol == '@') {
                    sobachkaFlag = true;
                    countSobachka++;
                }
                    if(currentSymbol == '.'){
                        countPoint++;
                    }
            }
        }
        if (countSobachka ==1 && countPoint == 1) {
            return true;
        }
        return false;
    }

}

package calculator;

// вспомогательный класс для операций над строками
public class Util {
    // проверяет суммарную длину строки и если она больше 40 обрезает до 40 символов, добавляя троеточие в конце строки
    static String stringSumLengthChecker(String checkedString) {
        if (checkedString.length() > 40) {
            return checkedString.substring(0, 40) + "...";
        }
        return checkedString;
    }
    // проверяет длину каждой вводимой строки
    static boolean stringLengthChecker(String[] checkedStrings) {
        for (int i = 0; i < checkedStrings.length; i++) {
            if ((checkedStrings[i].length() > 11)) {
                return false;
            }
        }
        return true;
    }
}
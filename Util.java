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

    static String deleteRepeatedChars(String[] checkedStrings) {
        char[] input1 = checkedStrings[1].toCharArray();
        char[] input2 = checkedStrings[4].toCharArray();
        char[] result = new char[10];


        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                if (input1[i] != input2[j]) {
                    result[i] = input1[i];
                }
            }
        }
        return String.valueOf(result);
    }
}




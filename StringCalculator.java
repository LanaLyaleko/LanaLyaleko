package calculator;

public class StringCalculator {

    String add(String[] inputString) {
        if (Util.stringLengthChecker(inputString)
                && inputString.length > 4) {
            return (inputString[1] + inputString[4]);
        }
        throw new IllegalArgumentException("Ошибка формата ввода данных: \n " +
                "возможные ошибки:\n" + "1. Каждая слагаемая строка должна быть не более 10ти символов\n" +
                "2. Строки должны быть введены в кавычках");
    }

    String subtract(String[] inputString) {
        if (inputString.length > 4) {
            if ((inputString[1]).contains(inputString[4])) {
                return inputString[1].replaceAll(inputString[4], "");
            }
            return inputString[1];
        }
        throw new IllegalArgumentException("Ошибка формата ввода данных: \n " +
                "возможные ошибки:\n" + "1. Каждая слагаемая строка должна быть не более 10ти символов\n" +
                "2. Строки должны быть введены в кавычках");
    }

    String multiply(String[] inputString) {
        if (Util.stringLengthChecker(inputString)
                && inputString.length > 3) {
            int multiplier = Integer.parseInt(((inputString[3].substring(1))));
            return Util.stringSumLengthChecker((inputString[1]).repeat(multiplier));
        }
        throw new IllegalArgumentException("Ошибка формата ввода данных: \n " +
                "возможные ошибки:\n" + "1. Каждая слагаемая строка должна быть не более 10ти символов\n" +
                "2. Первый операнд должен быть строкой и введен в кавычках\n"
                + "3. Второй операнд должен быть числом и введен без кавычек\n");
    }

    String division(String[] inputString) {
        if (inputString.length > 3 && (inputString[1].length()) >= Integer.parseInt((inputString[3].substring(1)))) {
            if(inputString[1].length() == Integer.parseInt(inputString[3].substring(1))) {
                return inputString[1].substring(0,1);
            }
            int result = inputString[1].length()/Integer.parseInt(inputString[3].substring(1));
            return (inputString[1].substring(0, result));
        }
        throw new IllegalArgumentException("Ошибка формата ввода данных: \n " +
                "возможные ошибки:\n" + "1. Каждая слагаемая строка должна быть не более 10ти символов\n" +
                "2. Первый операнд должен быть строкой и введен в кавычках\n"
                + "3. Второй операнд должен быть числом и введен без кавычек\n"
                + "4. Длина первой строки не должна превышать значение делителя");
    }
}




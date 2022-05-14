package calculator;

import java.util.Scanner;

public class StringCalculatorRunner {

    public static void main(String[] args) {

        //Создается  объект калькулятора для доступа к методам
        StringCalculator stringCalculator = new StringCalculator();
        // создается объект сканера для чтения строки
        Scanner sc = new Scanner(System.in);
        // чтение новой строки
        String string = sc.nextLine();
        // разбивается строка на токены по разделителю состоящему из любого символа арифметической операции
        String[] splitStringArray = string.split("([+-/*\"])");

        // выполняется арифметическое действие в зависимости от знака операции
        if (splitStringArray.length < 6) {
            if (string.contains("+")) {
                System.out.println("\"" + stringCalculator.add(splitStringArray) + "\"");
            } else if (string.contains("-")) {
                System.out.println("\"" + stringCalculator.subtract(splitStringArray) + "\"");
            } else if (string.contains("*")) {
                System.out.println("\"" + stringCalculator.multiply(splitStringArray) + "\"");
            } else if (string.contains("/")) {
                System.out.println("\"" + stringCalculator.division(splitStringArray) + "\"");
            } else {
                throw new IllegalArgumentException("неверная арифметическая операция");
            }
        } else throw new IllegalArgumentException("Ошибка формата ввода данных");
    }
}


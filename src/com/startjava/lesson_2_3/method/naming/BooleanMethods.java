package com.startjava.lesson_2_3.method.naming;

public class BooleanMethods {
    public boolean canContinue() {
        System.out.print(Methods.getMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueNumber() {
        System.out.print(Methods.getMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.print(Methods.getMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getMethodName() +
                "() -> в проверяемых числах есть равные цифры? ");
        return true;
    }

    public boolean hasAttempts() {
        System.out.print(Methods.getMethodName() +
                "() -> в игре 'Марио' остались попытки? ");
        return true;
    }

    public boolean isEmptyString() {
        System.out.print(Methods.getMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.print(Methods.getMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidPath() {
        System.out.print(Methods.getMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}
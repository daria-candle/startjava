package com.startjava.lesson_2_3.method.naming;

public class Main {
    public static void main(String[] args) {
        useNonBoolMethods();
        useBoolMethods();
    }

    private static void useNonBoolMethods() {
        System.out.println("\n1.НЕ BOOLEAN-МЕТОДЫ");
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.chooseMenuItem();
        nonBm.calculateAverageGrades();
        nonBm.countUniqueWords();
        nonBm.outMsgError();
        nonBm.syncDataWithCloud();
        nonBm.restoreDataFromBackup();
        nonBm.pauseDownloading();
        nonBm.resetToFactorySettings();
        nonBm.writeToFile();
        nonBm.convertCtoF();
        nonBm.inputMathExpression();
        nonBm.identifyWinner();
        nonBm.findBookByAuthor();
    }

    private static void useBoolMethods() {
        System.out.println("\n2.BOOLEAN-МЕТОДЫ");
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.canContinue());
        System.out.println(bm.hasUniqueNumber());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isEmptyString());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isExistFile());
    }
}
public class Main {
    public static void main(String[] args) {
        useNonBoolMethods();
        useBoolMethods();
    }

    private static void useNonBoolMethods() {
        System.out.println("\n1.НЕ BOOLEAN-МЕТОДЫ");
        NonBooleanMethods nonBoolObject = new NonBooleanMethods();
        nonBoolObject.findLongestWord();
        nonBoolObject.chooseMenuItem();
        nonBoolObject.calculateAverageGrades();
        nonBoolObject.countUniqueWords();
        nonBoolObject.outMsgError();
        nonBoolObject.syncDataWithCloud();
        nonBoolObject.restoreDataFromBackup();
        nonBoolObject.pauseDownloading();
        nonBoolObject.resetToFactorySettings();
        nonBoolObject.writeToFile();
        nonBoolObject.convertCtoF();
        nonBoolObject.inputMathExpression();
        nonBoolObject.identifyWinner();
        nonBoolObject.findBookByAuthor();
    }

    private static void useBoolMethods() {
        System.out.println("\n2.BOOLEAN-МЕТОДЫ");
        BooleanMethods boolObject = new BooleanMethods();
        System.out.println(boolObject.canContinue());
        System.out.println(boolObject.hasUniqueNumber());
        System.out.println(boolObject.isLetter());
        System.out.println(boolObject.hasEqualDigits());
        System.out.println(boolObject.hasAttempts());
        System.out.println(boolObject.isEmptyString());
        System.out.println(boolObject.isEvenNumber());
        System.out.println(boolObject.isValidPath());
        System.out.println(boolObject.isExistFile());
    }
}
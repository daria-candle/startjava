public class Main {
    public static void main(String[] args) {
        callNonBooleanMethods();
        callBooleanMethods();
    }

    private static void callNonBooleanMethods() {
        System.out.println("\n1.НЕ BOOLEAN-МЕТОДЫ");
        NonBooleanMethods nonBool = new NonBooleanMethods();
        nonBool.findLongestWord();
        nonBool.chooseMenuItem();
        nonBool.calculateAverageGrades();
        nonBool.countUniqueWords();
        nonBool.outMsgError();
        nonBool.syncDataWithCloud();
        nonBool.restoreDataFromBackup();
        nonBool.pauseDownloading();
        nonBool.resetToFactorySettings();
        nonBool.writeToFile();
        nonBool.convertCtoF();
        nonBool.inputMathExpression();
        nonBool.identifyWinner();
        nonBool.findBookByAuthor();
    }
    
    private static void callBooleanMethods() {
        System.out.println("\n2.BOOLEAN-МЕТОДЫ");
        BooleanMethods bool = new BooleanMethods();
        System.out.println(bool.isProgramContinue());
        System.out.println(bool.hasUniqueNumber());
        System.out.println(bool.isLetterEntered());
        System.out.println(bool.hasEqualDigits());
        System.out.println(bool.hasAttempts());
        System.out.println(bool.isNullStringEntered());
        System.out.println(bool.isEvenNumber());
        System.out.println(bool.isPathValid());
        System.out.println(bool.isFileExist());
    }
}
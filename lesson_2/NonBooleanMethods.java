public class NonBooleanMethods {
    public void findLongestWord() {
        System.out.println(Methods.getMethodName() +
                "() -> найти самое длинное слово в предложении из книги по Java");
    }

    public void chooseMenuItem() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageGrades() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> подсчитать количество уникальных слов в 'Война и Мир'");
    }

    public void outMsgError() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> вывести сообщение об ошибке");
    }

    public void syncDataWithCloud() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreDataFromBackup() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseDownloading() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> приостановить загрузку mp3-файла группы 'Ария'");
    }

    public void resetToFactorySettings() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeToFile() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> записать содержимое в файл по указанному пути на флешку");
    }

    public void convertCtoF() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void inputMathExpression() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> ввести математическое выражение с тремя аргументами");
    }

    public void identifyWinner() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> выявить победителя среди гонщиков игры 'Need For Speed'");
    }

    public void findBookByAuthor() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                "() -> найти книгу по имени писателя");
    }
}
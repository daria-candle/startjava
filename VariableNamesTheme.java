import javax.swing.JOptionPane;

public class VariableNamesTheme {
    public static void main(String[]args) {
        System.out.println("1. РАЗНЫЕ ПЕРЕМЕННЫЕ");
        // цифра
        int digit = 2;
        System.out.println("цифра = " + digit);
        // сумма чисел
        int integerSum = 2 + 20;
        System.out.println("сумма чисел = " + integerSum);
        // произведение цифр
        int digitMultiplication = digit * digit;
        System.out.println("произведение цифр = " + digitMultiplication);
        // максимальное число
        int integerMax;
        if (integerSum > 21) {
            integerMax = integerSum;
        } else {
            integerMax = 21;
        }
        System.out.println("максимальное число = " + integerMax);
        // количество десятков
        int tenCount = integerMax / 10;
        System.out.println("количество десятков = " + tenCount);
        // вес собаки
        float dogWeight = 22.2f;
        System.out.println("вес собаки = " + dogWeight);
        // исходное число
        int originalNumber = 5;
        System.out.println("исходное число = " + originalNumber);
        // процент по вкладу
        float depositPercentage = 12.5f;
        System.out.println("процент по вкладу = " + depositPercentage);
        // символ &
        char symbolAmpersand = '&';
        System.out.println("символ & = " + symbolAmpersand);
        // код ошибки
        int codeError = 404;
        System.out.println("код ошибки = " + codeError);
        // тип сообщения
        int messageType = JOptionPane.INFORMATION_MESSAGE;
        System.out.println("тип сообщения = " + messageType);
        // число нулей
        int zeroCount = 5;
        System.out.println("число нулей = " + zeroCount);
        // уникальное число
        int integerUnique = 5;
        System.out.println("уникальное число = " + integerUnique);
        // случайное число
        double numberRandom = Math.random();
        System.out.println("случайное число = " + numberRandom);
        // математическое выражение
        double mathExpression = 4.4 / 2;
        System.out.println("математическое выражение = " + mathExpression);
        // счет в игре
        int gameScore = 368;
        System.out.println("счет в игре = " + gameScore);
        // максимальная длина
        float lengthMax = 100.5f;
        System.out.println("максимальная длина = " + lengthMax);
        // пункт меню
        int menuItem = 3;
        System.out.println("пункт меню = " + menuItem);
        // стоимость кофе
        float coffeePrice = 250f;
        System.out.println("стоимость кофе = " + coffeePrice);
        // начальная дата
        String dateInit = "21.01.2026";
        System.out.println("начальная дата = " + dateInit);
        // окончание диапазона
        String rangeEnd = "21.05.2026";
        System.out.println("окончание диапазона = " + rangeEnd);
        // имя работника месяца
        String monthEmployeeName = "Даниил";
        System.out.println("имя работника месяца = " + monthEmployeeName);
        // название электронной книги
        String ebookName = "Осень патриарха";
        System.out.println("название электронной книги = " + ebookName);
        // размер
        String size = "XS";
        System.out.println("размер = " + size);
        // вместимость
        String capacity = "3 литра";
        System.out.println("вместимость = " + capacity);
        // счетчик
        int counter = 26;
        System.out.println("счетчик = " + counter);
        // путь до файла
        String filePath = "C:/Users/1/Desktop/text.txt";
        System.out.println("путь до файла = " + filePath);
        // количество чисел в строке
        int countOfIntegerInLine = 3;
        System.out.println("количество чисел в строке = " + countOfIntegerInLine);

        System.out.println("\n2. BOOLEAN-ПЕРЕМЕННЫЕ");
        // сотни равны?
        boolean isEqualHundreds = true;
        System.out.println("сотни равны? " + isEqualHundreds);
        // компьютер включен?
        boolean isEnableComputer = true;
        System.out.println("компьютер включен? " + isEnableComputer);
        // есть равные цифры?
        boolean hasEqualDigits = false;
        System.out.println("есть равные цифры? " + hasEqualDigits);
        // служба создана?
        boolean isCreatedService = false;
        System.out.println("служба создана? " + isCreatedService);
        // файл пустой?
        boolean isEmptyFile = false;
        System.out.println("файл пустой? " + isEmptyFile);
        // соединение активное?
        boolean isActiveConnection = false;
        System.out.println("соединение активное? " + isActiveConnection);
        // новый?
        boolean isNew = true;
        System.out.println("новый? " + isNew);
        // электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("электронная почта действительная? " + isValidEmail);
        // имеются уникальные строки?
        boolean hasUniqueLines = true;
        System.out.println("имеются уникальные строки? " + hasUniqueLines);

        System.out.println("\n3. АББРЕВИАТУРЫ");
        // старый universally unique identifier
        String uuidOld = "4fdfdd32df35";
        System.out.println("старый universally unique identifier: " + uuidOld);
        // производитель оперативной памяти
        String ramProducer = "Samsung";
        System.out.println("производитель оперативной памяти: " + ramProducer);
        // емкость жесткого диска
        String hddCapacity = "16 GB";
        System.out.println("емкость жесткого диска: " + hddCapacity);
        // определение термина протокола передачи гипертекста
        String httpDefinition = "HTTP - сетевой протокол прикладного уровня.";
        System.out.println("определение термина протокола передачи гипертекста: " + httpDefinition);
        // сокращенный uniform resource locator
        String urlShort = "https://ya.ru";
        System.out.println("сокращенный uniform resource locator: " + urlShort);
        // новый идентификатор клиента
        String clientIdNew = "4fdfdd32df35";
        System.out.println("новый идентификатор клиента: " + clientIdNew);
        // количество символов в american standard code for information interchange
        int asciiCharsCount = 256;
        System.out.println("количество символов в american standard code for information interchange: " +
                 asciiCharsCount);
    }
}
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;

public class VariablesTheme {
    public static void main(String[] args) {
        final LocalTime localTimeStart = LocalTime.now();
        final long timeStart = System.nanoTime();
        System.out.println("1 ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("\nс помощью String.join():");
        System.out.println(String.join(" ","                    ","/\\"));
        System.out.println(String.join(" ","   J","   a"," v     v"," /  \\"));
        System.out.println(String.join(" ","   J","  a a"," v   v"," /_( )\\"));
        System.out.println(String.join(" ","J  J"," aaaaa"," V V"," /      \\"));
        System.out.println(String.join(" "," JJ"," a     a"," V"," /___/\\___\\"));
        System.out.println("\nс помощью текстового блока:");
        System.out.println("""
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                 """);

        System.out.println("\n2 РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println("\nпервый способ решения (без округления):");
        float penCost = 105.5f;
        float bookCost = 235.23f;
        float discont = 0.11f;
        float productsSumFull = penCost + bookCost;
        float discountSum = productsSumFull * discont;
        float productsSumWithDiscount = productsSumFull - discountSum;
        System.out.println("стоимость товаров без скидки: " + productsSumFull + " руб.");
        System.out.println("сумма скидки: " + discountSum + " руб.");
        System.out.println("стоимость товаров со скидкой: " + productsSumWithDiscount + " руб.");
        System.out.println("\nвторой способ решения (с округлением):");
        BigDecimal penCostBd = BigDecimal.valueOf(105.5);
        BigDecimal bookCostBd = BigDecimal.valueOf(235.23);
        BigDecimal discontBd = BigDecimal.valueOf(0.11);
        BigDecimal productsSumFullBd = penCostBd.add(bookCostBd);
        BigDecimal discountSumBd = discontBd.multiply(productsSumFullBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal productsSumWithDiscountBd = productsSumFullBd.subtract(discountSumBd);
        System.out.println("стоимость товаров без скидки: " + productsSumFullBd + " руб.");
        System.out.println("сумма скидки: " + discountSumBd + " руб.");
        System.out.println("стоимость товаров со скидкой: " + productsSumWithDiscountBd + " руб.\n");

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");
        int a1 = 2;
        int b1 = 5;
        System.out.println("Исходные значения переменных: A1 = " + a1 + ", B1 = " + b1);
        System.out.println("\nМетод: третья переменная");
        int c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println("\nМетод: арифметические операции");
        a1 = 2;
        b1 = 5;
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println("\nМетод: побитовый");
        a1 = 2;
        b1 = 5;
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1 + "\n");

        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");
        int asciiCode1 = 1055;
        int asciiCode2 = 1088;
        int asciiCode3 = 1080;
        int asciiCode4 = 1074;
        int asciiCode5 = 1077;
        int asciiCode6 = 1090;
        char character1 = (char) asciiCode1;
        char character2 = (char) asciiCode2;
        char character3 = (char) asciiCode3;
        char character4 = (char) asciiCode4;
        char character5 = (char) asciiCode5;
        char character6 = (char) asciiCode6;
        System.out.printf("%5d%5d%5d%5d%5d%5d%n", asciiCode1, asciiCode2, asciiCode3, 
                asciiCode4, asciiCode5, asciiCode6);
        System.out.printf("%5s%5s%5s%5s%5s%5s%n%n", character1, character2, character3, 
                character4, character5, character6);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА\n");
        int productCode = 123;
        int productGroup = productCode / 100;
        int productSubgroup = (productCode % 100) / 10;
        int packingType = productCode % 10;
        int controlSum = productGroup + productSubgroup + packingType;
        int checkCode = productGroup * productSubgroup * packingType;
        System.out.printf("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d%n
                """, productCode, productGroup, productSubgroup, packingType, controlSum, checkCode);

        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ\n");
        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d)
                """, temperature, ++temperature, --temperature);
        short pressure = Short.MAX_VALUE;
        System.out.printf("""
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d)
                """, pressure, ++pressure, --pressure);
        char systemStatusCode = Character.MAX_VALUE;
        System.out.printf("""
                [Код состояния системы]:
                  Исходное: %d
                  +1: %d
                  -1: %d)
                """, (int) systemStatusCode, (int) ++systemStatusCode, (int) --systemStatusCode);
        int mileage = Integer.MAX_VALUE;
        System.out.printf("""
                [Пройденное расстояние, км]:
                  Исходное: %d
                  +1: %d
                  -1: %d)
                """, mileage, ++mileage, --mileage);
        long startTime = Long.MAX_VALUE;
        System.out.printf("""
                [Время с момента старта, сек]:
                  Исходное: %d
                  +1: %d
                  -1: %d)
                %n""", startTime, ++startTime, --startTime);

        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");
        System.out.println(" Характеристики JVM");
        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        double totalMemory = runtime.totalMemory() / 1000000;
        double freeMemory = runtime.freeMemory() / 1000000;
        double usedMemory = totalMemory - freeMemory;
        double maxMemory = runtime.maxMemory() / 1000000;
        System.out.printf("""
                 - доступное число ядер: %d
                 - выделенная память (МБ): %.1f
                 - свободная память (МБ): %.1f
                 - используемая память (МБ): %.1f
                 - максимально доступная для выделения память (МБ): %.1f
                """, availableProcessors, totalMemory, freeMemory, usedMemory, maxMemory);

        System.out.println("\n Параметры ОС");
        char systemDiskLetter = System.getProperty("user.home").charAt(0);
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        char fileSeparator = System.getProperty("file.separator").charAt(0);
        System.out.printf("""
                 - системный диск (буква): %s
                 - версия ОС: %s
                 - версия Java: %s
                 - символ разделения пути (сепаратор): %s
                %n""", systemDiskLetter, osVersion, javaVersion, fileSeparator);

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА\n");
        long timeFinish = System.nanoTime();
        LocalTime localTimeFinish = LocalTime.now();
        double timeElapsed = (timeFinish - timeStart) / 1000000000.0;
        System.out.printf("""
                | Старт проверки | %1$tH:%1$tM:%1$tS.%1$tL |
                +----------------+--------------+
                | Финиш проверки | %2$tH:%2$tM:%2$tS.%2$tL |
                +----------------+--------------+
                | Время работы   | %3$.3f сек    |
                %n""", localTimeStart, localTimeFinish, timeElapsed);
    }
}


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;

public class VariablesTheme {
    public static void main(String[] args) {
        final LocalTime localTimeStart = LocalTime.now();
        final long timeStart = System.nanoTime();
        System.out.println("\n1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("\nс помощью String.join():");
        System.out.println(String.join("\n",
                "                     /\\",
                "   J    a  v     v  /  \\",
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  V V  /      \\",
                " JJ  a     a  V  /___/\\___\\"));
        System.out.println("\nс помощью текстового блока:");
        System.out.println("""
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """);

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println("\nпервый способ решения (без округления):");
        float penCost = 105.5f;
        float bookCost = 235.23f;
        float discont = 0.11f;
        float basePrice = penCost + bookCost;
        float discountSum = basePrice * discont;
        float discontPrice = basePrice - discountSum;
        System.out.println("стоимость товаров без скидки: " + basePrice + " руб.");
        System.out.println("сумма скидки: " + discountSum + " руб.");
        System.out.println("стоимость товаров со скидкой: " + discontPrice + " руб.");
        System.out.println("\nвторой способ решения (с округлением):");
        BigDecimal penCostBd = BigDecimal.valueOf(105.5);
        BigDecimal bookCostBd = BigDecimal.valueOf(235.23);
        BigDecimal discontBd = BigDecimal.valueOf(0.11);
        BigDecimal basePriceBd = penCostBd.add(bookCostBd);
        BigDecimal discountSumBd = discontBd.multiply(basePriceBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountSumBd);
        System.out.println("стоимость товаров без скидки: " + basePriceBd + " руб.");
        System.out.println("сумма скидки: " + discountSumBd + " руб.");
        System.out.println("стоимость товаров со скидкой: " + discountPriceBd + " руб.\n");

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");
        int a1 = 2;
        int b1 = 5;
        System.out.println("Исходные значения переменных: A1 = " + a1 + ", B1 = " + b1);
        System.out.println("\nМетод: третья переменная");
        int tmp = a1;
        a1 = b1;
        b1 = tmp;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println("\nМетод: арифметические операции");
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println("\nМетод: побитовый");
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
        System.out.printf("%5d%5d%5d%5d%5d%5d%n", asciiCode1, asciiCode2, asciiCode3, 
                asciiCode4, asciiCode5, asciiCode6);
        System.out.printf("%5c%5c%5c%5c%5c%5c%n%n", asciiCode1, asciiCode2, asciiCode3, 
                asciiCode4, asciiCode5, asciiCode6);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА\n");
        int productCode = 123;
        int productGroup = productCode / 100;
        int productSubgroup = (productCode % 100) / 10;
        int packingType = productCode % 10;
        int checkSum = productGroup + productSubgroup + packingType;
        int checkCode = productGroup * productSubgroup * packingType;
        System.out.printf("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d%n
                """, productCode, productGroup, productSubgroup, packingType, checkSum, checkCode);

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
        System.out.println(" Характеристики JVM:");
        Runtime rt = Runtime.getRuntime();
        int bytes = 1024 * 1024;
        int availableProcessors = rt.availableProcessors();
        double totalMemory = rt.totalMemory() / bytes;
        double freeMemory = rt.freeMemory() / bytes;
        double usedMemory = totalMemory - freeMemory;
        double maxMemory = rt.maxMemory() / bytes;
        System.out.printf("""
                 - доступное число ядер: %d
                 - выделенная память (МБ): %.1f
                 - свободная память (МБ): %.1f
                 - используемая память (МБ): %.1f
                 - максимально доступная для выделения память (МБ): %.1f
                """, availableProcessors, totalMemory, freeMemory, usedMemory, maxMemory);

        System.out.println("\n Параметры ОС:");
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
        double timeElapsed = (timeFinish - timeStart) / 1e9;
        System.out.printf("""
                | Старт проверки | %1$tH:%1$tM:%1$tS.%1$tL |
                +----------------+--------------+
                | Финиш проверки | %2$tH:%2$tM:%2$tS.%2$tL |
                +----------------+--------------+
                | Время работы   | %3$.3f сек    |
                %n""", localTimeStart, localTimeFinish, timeElapsed);
    }
}


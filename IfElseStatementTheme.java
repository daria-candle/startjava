import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA\n");
        boolean isMaleGender = false;
        if (!isMaleGender) {
            System.out.println("Вы - мужчина");
        } else {
            System.out.println("Вы - женщина!");
        }
        byte age = 17;
        if (age > 18) {
            System.out.println("Возможно, вы - Юрий Лоза");
        } else {
            System.out.println("Вы точно не Юрий Лоза!");
        }
        float height = 1.7f;
        if (height < 1.8) {
            System.out.println("Вы ниже Дэвида Бекхэма");
        } else {
            System.out.println("Вы как Дэвид Бекхэм или даже выше!");
        }

        System.out.println("\n\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ\n");
        int stepYesterday = 21062;
        int stepToday = 10763;
        System.out.println("Пройдено вчера (в шагах): " + stepYesterday);
        System.out.println("Пройдено сегодня (в шагах): " + stepToday);
        if (stepYesterday > stepToday) {
            System.out.println("Вчера вы прошли больше, чем сегодня!");
        } else if (stepYesterday < stepToday) {
            System.out.println("Вчера вы прошли меньше, чем сегодня!");
        } else {
            System.out.println("Вчера вы прошли столько же, как сегодня!");
        }
        double averageStep = (stepYesterday + stepToday) / 2.0;
        System.out.println("Среднее количество шагов за 2 дня: " + averageStep);

        System.out.println("\n\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ\n");
        int guestsNumber = 15;
        if (guestsNumber == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestsNumber < 0) {
            System.out.println("Ошибка! Количество гостей отрицательное!");
        } else if ((guestsNumber % 2) == 0) {
            System.out.printf("Записалось %d гостей. Можно формировать пары для конкурсов.%n", guestsNumber);
        } else {
            System.out.printf("Записалось %d гостей. Нужны индивидуальные задания.%n", guestsNumber);
        }

        System.out.println("\n\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА\n");
        String nickname = "daria_candle";
        char nicknameFirstLetter = nickname.charAt(0);
        System.out.println("Первый способ решения:");
        System.out.print("Имя " + nickname + " начинается с ");
        if ((nicknameFirstLetter >= 'a' && nicknameFirstLetter <= 'z') | 
                (nicknameFirstLetter >= 'а' && nicknameFirstLetter <= 'я')) {
            System.out.println("маленькой буквы '" + nicknameFirstLetter + "'");
        } else if ((nicknameFirstLetter >= 'A' && nicknameFirstLetter <= 'Z') | 
                (nicknameFirstLetter >= 'А' && nicknameFirstLetter <= 'Я')) {
            System.out.println("большой буквы '" + nicknameFirstLetter + "'");
        } else if (nicknameFirstLetter >= '0' && nicknameFirstLetter <= '9') {
            System.out.println("цифры '" + nicknameFirstLetter + "'");
        } else {
            System.out.println("символа '" + nicknameFirstLetter + "'");
        }
        System.out.println("\nВторой способ решения:");
        System.out.print("Имя " + nickname + " начинается с ");
        if (Character.isLowerCase(nicknameFirstLetter)) {
            System.out.println("маленькой буквы '" + nicknameFirstLetter + "'");
        } else if (Character.isUpperCase(nicknameFirstLetter)) {
            System.out.println("большой буквы '" + nicknameFirstLetter + "'");
        } else if (Character.isDigit(nicknameFirstLetter)) {
            System.out.println("цифры '" + nicknameFirstLetter + "'");
        } else {
            System.out.println("символа '" + nicknameFirstLetter + "'");
        }

        System.out.println("\n\n5. ИНВЕНТАРИЗАЦИЯ\n");
        int dbId = 123;
        int currId = 103;
        int dbIdHundreds = dbId / 100;
        int dbIdTens = (dbId % 100) / 10;
        int dbIdOnes = dbId % 10;
        int currIdHundreds = currId / 100;
        int currIdTens = (currId % 100) / 10;
        int currIdOnes = currId % 10;
        if (dbId == currId) {
            System.out.println("[№" + currId + "]: компьютер на 3-м этаже в кабинете 2");
        } else if (dbIdHundreds != currIdHundreds && dbIdTens != currIdTens &&
                dbIdOnes != currIdOnes) {
            System.out.println("[№" + currId + "]: оборудование не идентифицировано");
        } else {
            System.out.printf("""
                    Нет полного совпадения:
                    База данных: [№%d]
                    Фактический: [%s%s%s]%n
                    """, dbId, dbIdHundreds == currIdHundreds ? dbIdHundreds : "_", 
                    dbIdTens == currIdTens ? dbIdTens : "_",
                    dbIdOnes == currIdOnes ? dbIdOnes : "_");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");
        System.out.println("первый способ решения (без округления):");
        float depositBalance = 321123.79f;
        float depositRate = 0.1f;
        if (depositBalance <= 0.0f) {
            System.out.println("Внимание! Баланс отрицательный");
            depositRate = 0.0f;
        } else if (depositBalance < 100000.0f) {
            depositRate = 0.05f;
        } else if (depositBalance <= 300000.0f) {
            depositRate = 0.07f;
        }
        float depositRateSum = depositBalance * depositRate;
        float depositCommonSum = depositBalance + depositRateSum;
        System.out.println("сумма вклада: " + depositBalance + " руб.");
        System.out.println("сумма начисленного %: " + depositRateSum + " руб.");
        System.out.println("итоговая сумма с %: " + depositCommonSum + " руб.");
        System.out.println("\nвторой способ решения (с округлением):");
        BigDecimal depositBalanceBd = BigDecimal.valueOf(321123.79);
        BigDecimal depositRateBd;
        if (depositBalanceBd.floatValue() <= 0.0f) {
            System.out.println("Внимание! Баланс отрицательный");
            depositRateBd = BigDecimal.valueOf(0.0);
        } else if (depositBalanceBd.floatValue() < 100000.0f) {
            depositRateBd = BigDecimal.valueOf(0.05);
        } else if (depositBalanceBd.floatValue() <= 300000.0f) {
            depositRateBd = BigDecimal.valueOf(0.07);
        } else {
            depositRateBd = BigDecimal.valueOf(0.1);
        }
        BigDecimal depositRateSumBd =
                depositBalanceBd.multiply(depositRateBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal depositCommonSumBd = depositBalanceBd.add(depositRateSumBd);
        System.out.println("сумма вклада: " + depositBalanceBd + " руб.");
        System.out.println("сумма начисленного %: " + depositRateSumBd + " руб.");
        System.out.println("итоговая сумма с %: " + depositCommonSumBd + " руб.");

        System.out.println("\n\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ %\n");
        int historyPercentage = 59;
        int historyGrade = 5;
        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage <= 90) {
            historyGrade = 4;
        }
        int codingPercentage = 92;
        int codingGrade = 5;
        if (codingPercentage <= 60) {
            codingGrade = 2;
        } else if (codingPercentage <= 73) {
            codingGrade = 3;
        } else if (codingPercentage <= 90) {
            codingGrade = 4;
        }
        float gradeAverage = (historyGrade + codingGrade) / 2.0f;
        float resultsAverage = (historyPercentage + codingPercentage) / 2.0f;
        System.out.println("Оценка по истории: " + historyGrade);
        System.out.println("Оценка по программированию: " + codingGrade);
        System.out.println("Средний балл оценок по предметам: " + gradeAverage);
        System.out.println("Средний % по предметам: " + resultsAverage);

        System.out.println("\n\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ %\n");
        BigDecimal revenueMonth = BigDecimal.valueOf(13025.233);
        BigDecimal rentMonth = BigDecimal.valueOf(5123.018);
        BigDecimal costPriceMonth = BigDecimal.valueOf(9001.729);
        BigDecimal monthsCount = BigDecimal.valueOf(12);
        BigDecimal profitYear = revenueMonth.subtract(rentMonth)
                .subtract(costPriceMonth)
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, RoundingMode.HALF_UP);
        if (profitYear.signum() == 1) {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание N1");

        int savingPerMonth = 15000;
        int totalWithPercents = 0;
        int monthNumber = 0;
        while (totalWithPercents <= 2459000) {
            totalWithPercents = totalWithPercents + totalWithPercents/100;
            totalWithPercents = totalWithPercents + savingPerMonth;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ". Сумма накоплений равна: " + totalWithPercents + " рублей.");
        }

        System.out.println();
        System.out.println("Задание N2");

        int j = 10;
        while (j > 0) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задание N3");

        double totalPopulation = 12_000_000;
        double amountOf1000 = totalPopulation / 1000;
        int birthRatePer1000 = 17;
        int mortalityRatePer1000 = 8;
        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation + amountOf1000 * birthRatePer1000 - amountOf1000 * mortalityRatePer1000;
            amountOf1000 = totalPopulation / 1000;
            System.out.println("Год " + year + ". Численность населения составляет " + (int)totalPopulation + " человек.");
        }

        System.out.println();
        System.out.println("Задание N4");

        double startAmount = 15000;
        double percentRate = 0.07;
        monthNumber = 0;
        while (startAmount <= 12_000_000) {
            startAmount = startAmount + startAmount * percentRate;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ". Сумма накоплений равна: " + (int)startAmount + " рублей.");
        }

        System.out.println();
        System.out.println("Задание N5");

        startAmount = 15000;
        percentRate = 0.07;
        monthNumber = 0;
        while (startAmount <= 12_000_000) {
            startAmount = startAmount + startAmount * percentRate;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ". Сумма накоплений равна: " + (int) startAmount + " рублей.");
            }
        }
        System.out.println("Месяц " + monthNumber + ". Сумма накоплений равна: " + (int) startAmount + " рублей.");

        System.out.println();
        System.out.println("Задание N6");

        startAmount = 15000;
        percentRate = 0.07;
        monthNumber = 0;
        int totalPeriodInMonth = 108;
        for (monthNumber = 1; monthNumber<=totalPeriodInMonth; monthNumber++)
         {
            startAmount = startAmount + startAmount * percentRate;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ". Сумма накоплений равна: " + (int) startAmount + " рублей.");
            }
        }

        System.out.println();
        System.out.println("Задание N7");

        int firstFridayIs = 5;
        int fridayIs = 0;
        for (fridayIs = firstFridayIs; fridayIs <= 31; fridayIs = fridayIs + 7) {
            System.out.println("Сегодня пятница, " + fridayIs + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();
        System.out.println("Задание N8");

        int currentYear = 2024;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        int tempYear = yearBefore;
        for (tempYear = yearBefore; tempYear <= yearAfter; tempYear++) {

            if (tempYear % 79 == 0) {
                System.out.println(tempYear);
            }
        }
    }
}
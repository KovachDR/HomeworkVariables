package Lesson_Variables;

public class LessonVariablesHomeworkPart2 {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    }
public static void task1() {
    System.out.println("Задача №1");
        int car = 1000;
        byte bike = 100;
        short bus = 500;
        long train = 100000;
        float weight = 12.2f;
        double length = 153.25;
    System.out.println("Значение переменной car с типом int равно " + car);
    System.out.println("Значение переменной bike с типом byte равно " + bike);
    System.out.println("Значение переменной bus с типом short равно " + bus);
    System.out.println("Значение переменной train с типом long равно " + train);
    System.out.println("Значение переменной weight с типом float равно " + weight);
    System.out.println("Значение переменной length с типом double равно " + length);
}

public static void task2() {
    System.out.println("Задача №2 (Не требует вывода кода по условиям задачи)");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        int d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

}

public static void task3() {
    System.out.println("Задача №3");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int paperLists = 480;
        int totalStudents = studentsLP + studentsAS + studentsEA;
        int paperForOneStudent = paperLists / totalStudents;
    System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги.");

}

public static void task4() {
    System.out.println("Задача №4");
        int productivityMachineForTwoMinutes = 16;
        int productivityMachineForTwentyMinutes = productivityMachineForTwoMinutes * 10;
        int productivityMachineForOneHour = productivityMachineForTwentyMinutes * 3;
        int productivityMachineForOneDay = productivityMachineForOneHour * 24;
        int productivityMachineForThreeDays = productivityMachineForOneDay * 3;
        int productivityMachineForOneMonth = productivityMachineForOneDay * 30;
    System.out.println("За 20 минут машина произвела " + productivityMachineForTwentyMinutes + " штук бутылок");
    System.out.println("За 1 час машина произвела " + productivityMachineForOneHour + " штук бутылок");
    System.out.println("За 3 дня машина произвела " + productivityMachineForThreeDays + " штук бутылок");
    System.out.println("За месяц машина произвела " + productivityMachineForOneMonth + " штук бутылок");
}

public static void task5() {
    System.out.println("Задача №5");
        int totalCansPaintForSchool = 120;
        int quantityCansWhitePaintForOneClass = 2;
        int quantityCansBrownPaintForOneClass = 4;
        int totalCansPaintForOneClass = quantityCansBrownPaintForOneClass + quantityCansWhitePaintForOneClass;
        int quantityClassesInSchool = totalCansPaintForSchool / totalCansPaintForOneClass;
        int totalCansWhitePaintForSchool = quantityClassesInSchool * quantityCansWhitePaintForOneClass;
        int totalCansBrownPaintForSchool = quantityClassesInSchool * quantityCansBrownPaintForOneClass;
    System.out.println("В щколе, где " + quantityClassesInSchool + " классов, нужно " + totalCansWhitePaintForSchool
            + " банок белой краски и " + totalCansBrownPaintForSchool + " банок коричневой краски.");
}

public static void task6 () {
    System.out.println("Задача №6");
    int oneBanana = 80;
    int onePortionMilk100ml = 105;
    int onePortionIceCream = 100;
    int oneEgg = 70;
    int fiveBananas = oneBanana * 5;
    int twoPortionMilk = onePortionMilk100ml * 2;
    int twoPortionIceCream = onePortionIceCream * 2;
    int fourEggs = oneEgg * 4;
    int totalWeightBreakfastInGrams = fiveBananas + twoPortionMilk + twoPortionIceCream + fourEggs;
    double totalWeightBreakfastInKilograms = (double)totalWeightBreakfastInGrams / 1000;
    System.out.println("Общий вес завтрака " + totalWeightBreakfastInGrams + " грамм");
    System.out.println("Общий вес завтрака " + totalWeightBreakfastInKilograms + " килограмм");
}

public static void task7 () {
    System.out.println("Задача №7");
        double totalWeight = 7;
        double loseWeightInOneDayFirstVersion = 0.25;
        double loseWeightInOneDaySecondVersion = 0.5;
        double quantityDaysFirstVersion = totalWeight / loseWeightInOneDayFirstVersion;
        double quantityDaysSecondVersion = totalWeight / loseWeightInOneDaySecondVersion;
        double loseWeightMeanVersion = (loseWeightInOneDayFirstVersion + loseWeightInOneDaySecondVersion) / 2;
        double quantityDayMeanVersion = totalWeight / loseWeightMeanVersion;
    System.out.println("Если терять по 250 грамм, то понадобится " + quantityDaysFirstVersion + " дней");
    System.out.println("Если терять по 500 грамм, то понадобится " + quantityDaysSecondVersion + " дней");
    System.out.printf("Дней, в среднем, понадобится: %.2f%n",quantityDayMeanVersion);
}

public static void task8() {
    System.out.println("Задача №8");
    double salaryMashaForMonth = 67760;
    double salaryDenisForMonth = 83690;
    double salaryCristineForMonth = 76230;
    double salaryMashaForYear = salaryMashaForMonth * 12;
    double salaryDenisForYear = salaryDenisForMonth * 12;
    double salaryCristineForYear = salaryCristineForMonth * 12;

    double salaryIncreaseCoefficient = 1.1;
    double newSalaryMashaForMonth = salaryMashaForMonth * salaryIncreaseCoefficient;
    double newSalaryDenisForMonth = salaryDenisForMonth * salaryIncreaseCoefficient;
    double newSalaryCristineForMonth = salaryCristineForMonth * salaryIncreaseCoefficient;

    double newSalaryMashaForYear = newSalaryMashaForMonth * 12;
    double newSalaryDenisForYear = newSalaryDenisForMonth * 12;
    double newSalaryCristineForYear = newSalaryCristineForMonth * 12;

    double differenceSalaryMashaForYear = newSalaryMashaForYear - salaryMashaForYear;
    double differenceSalaryDenisForYear = newSalaryDenisForYear - salaryDenisForYear;
    double differenceSalaryCristineForYear = newSalaryCristineForYear - salaryCristineForYear;

    System.out.println("Маша теперь получает " + newSalaryMashaForMonth + " рублей. Годовой доход вырос на "
            + differenceSalaryMashaForYear + " рублей");
    System.out.println("Денис теперь получает " + newSalaryDenisForMonth + " рублей. Годовой доход вырос на "
            + differenceSalaryDenisForYear + " рублей");
    System.out.println("Кристина теперь получает " + newSalaryCristineForMonth + " рублей. Годовой доход вырос на "
            + differenceSalaryCristineForYear + " рублей");

}
}


package Lesson_OperatorIf;

public class OperatorIfPart1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int age = 25;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + " то он не достиг совершеннолетия,нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int outsideTemperature = 5;
        if (outsideTemperature < 5){
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int speedOnRoad = 50;
        if (speedOnRoad > 60){
            System.out.println("Если скорость " + speedOnRoad + " то штраф");
        } else {
            System.out.println("Если скорость " + speedOnRoad + " можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача №4");
        int age = 25;
        if (age >= 2 && age <= 6 ){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }else if (age > 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }else if (age > 24){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }else  if (age < 2 && age >= 0){
            System.out.println("Если возраст человека равен " + age + " то он младенец.");
        }else {
            System.out.println("Введён не корректный возраст!!!");
        }
    }

    public static void task5() {
        System.out.println("Задача №5");
        int childAge = 10;
        if (childAge < 5 && childAge >= 0){
            System.out.println("Если возраст ребёнка равен " + childAge + " то ему нельзя кататься на аттракционах");
        } else if (childAge >= 5 && childAge < 14){
            System.out.println("Если возраст ребёнка равен " + childAge
                    + " то ему можно кататься на аттракционах только в сопровождении взрослого");
        } else if (childAge >= 14 && childAge < 18 ){
            System.out.println("Если возраст ребёнка равен " + childAge
                    + " то ему можно кататься на аттракционах самостоятельно");
        } else if (childAge < 0 || childAge >= 18){
            System.out.println("Возраст ребенка введён не корректно!!!");
        }
    }
    public static void task6() {
        System.out.println("Задача №6");
        int capacityCarriage = 102;
        int seatPlace = 60;
        int standPlace = capacityCarriage - seatPlace;

        int seatsUsed = 25;
        int standUsed = 5;

        if (seatsUsed < seatPlace){
            System.out.println("В вагоне есть " + (seatPlace-seatsUsed) + " свободных сидячих мест");
        }
        if (seatsUsed == seatPlace){
            System.out.println("Сидячих мест нет");
        }
        if (standUsed < standPlace){
            System.out.println("В вагоне есть " + (standPlace-standUsed) + " свободных стоячих мест");
        }
        if (standUsed == seatPlace){
            System.out.println("Стоячих мест нет");
        }

    }

    public static void task7() {
        System.out.println("Задача №7");
        int one = 22;
        int two = 33;
        int three = 45;
       if (one > two && one > three){
           System.out.println("Самое большое число " + one);
       } else if (two > one && two > three){
           System.out.println("Самое большое число " + two);
       } else {
           System.out.println("Самое большое число " + three);
       }
    }
}

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Решение задачи 1:");
        int age = 1;

        if (age >= 18 ) {
            System.out.println("Поздравляем с наступившим совершеннолетием!");}

        if (age < 18 ) {
            System.out.println("Возраст совершеннолетия ещё не наступил и нужно немного подождать");}

        System.out.println();

        //Задание 2
        System.out.println("Решение задачи 2:");
        int humanAge = 9;
        if (humanAge >= 7 && humanAge < 18) {System.out.println("Ребенок ходит в школу");}
        if (humanAge >= 18 && humanAge < 24) {System.out.println("Человек уже закончил школу и может отправляться в университет");}
        if (humanAge >= 24) {System.out.println("Человек окончил университет и ему пора искать первую работу");}

        System.out.println();

        //Задание 3
        System.out.println("Решение задачи 3:");
        int totalPlaces = 120;
        int totalSitPlaces = 60;
        int totalStandPlaces = totalPlaces - totalSitPlaces;

        int currentPlaces = 122;
        int currentSitPlaces = 75;
        int currentStandPlaces = 3;

        if (currentPlaces > totalPlaces) {System.out.println("Вагон уже полностью забит");}

        if (currentSitPlaces >= totalSitPlaces) {System.out.println("Сидячих мест в вагоне нет");}
        if (currentSitPlaces < totalSitPlaces) {System.out.println("Сидячие места в вагоне есть");}

        if (currentStandPlaces >= totalStandPlaces) {System.out.println("Стоячих мест в вагоне нет");}
        if (currentStandPlaces < totalStandPlaces) {System.out.println("Стоячие места в вагоне есть");}

        System.out.println();

        //Задание 1 часть 2
        System.out.println("Решение задачи 1 часть 2:");
        int age2 = 19;

        if (age2 >= 18 ) {
            System.out.println("Поздравляем с наступившим совершеннолетием!");
        } else {System.out.println("Возраст совершеннолетия ещё не наступил и нужно немного подождать");}

        System.out.println();

        //Задание 2 часть 2
        System.out.println("Решение задачи 2 часть 2:");
        int humanAge2 = 18;
        if (humanAge2 >= 7 && humanAge2 < 18 ) {System.out.println("Ребенок ходит в школу");}
        if (humanAge2 >= 18 && humanAge2 < 24 ) {System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (humanAge2 >= 24) {System.out.println("Человек окончил университет и ему пора искать первую работу");}

        System.out.println();

        //Задание 3 часть 2
        System.out.println("Решение задачи 3 часть 2:");
        int totalPlaces2 = 120;
        int totalSitPlaces2 = 60;
        int totalStandPlaces2 = totalPlaces2 - totalSitPlaces2;

        int currentPlaces2 = 102;
        int currentSitPlaces2 = 35;
        int currentStandPlaces2 = 3;

        if (currentPlaces2 > totalPlaces2) {System.out.println("Вагон уже полностью забит");}
        else {System.out.println("В вагоне еще есть места");}

        if (currentSitPlaces2 >= totalSitPlaces2) {System.out.println("Сидячих мест в вагоне нет");}
        else {System.out.println("Сидячие места в вагоне есть");}

        if (currentStandPlaces2 >= totalStandPlaces2) {System.out.println("Стоячих мест в вагоне нет");}
        else {System.out.println("Стоячие места в вагоне есть");}

        System.out.println();

        //Задание 1 часть 3
        System.out.println("Решение задачи 1 часть 3:");

        int humanAge3 = 26;
        if (humanAge3 >= 2 && humanAge3 <= 6) {
            System.out.println("Если возраст человека равен " +  humanAge3 + ", то ему нужно ходить в детский сад");}

        if (humanAge3 >= 7 && humanAge3 <= 18) {
            System.out.println("Если возраст человека равен " +  humanAge3 + ", то ему нужно ходить в школу");}

        if (humanAge3 >= 18 && humanAge3 <= 24) {
            System.out.println("Если возраст человека равен " +  humanAge3 + ", то ему нужно ходить в университет");}
        else if (humanAge3 > 24) {
            System.out.println("Если возраст человека равен " +  humanAge3 + ", то ему пора ходить на работу");}


        System.out.println();

        //Задание 2 часть 3
        System.out.println("Решение задачи 2 часть 3:");
        boolean adultEscort = false;
        int ageChild = 11;

        if (ageChild <= 5) {
            System.out.println("Возраст ребенка меньше 5 лет, он не может кататься на аттракционе");
        }

        if (ageChild > 5 && ageChild <= 14 && adultEscort) {
            System.out.println("Возраст ребенка больше 5 лет, но меньше 14, и он может кататься на аттракционе только в сопровождении взрослого");
            } else System.out.println("Сопровождающий отсутствует, кататься на аттракционе ребенку запрещено");

        if (ageChild > 14) {
            System.out.println("Возраст ребенка больше 14 лет, он может кататься на аттракционе без сопровождения взрослого");}


        System.out.println();

        //Задание 3 часть 3
        System.out.println("Решение задачи 3 часть 3:");

        int one = 1;
        int two = 2;
        int free = 3;

        int max;

        if (one > two) max = one;
        else max = two;
        if (free > max) max = free;

        System.out.println("Наибольшее значение трех чисел = " + max);

    }
}

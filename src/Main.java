public class Main {
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

    public static void task1 (){
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);// Результат задачи 1
        System.out.println(cat);// Результат задачи 1
        System.out.println(paper); // Результат задачи 1

    }
    public static void task2 (){
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper +4;
        System.out.println(dog);// Результат задачи 2
        System.out.println(cat);// Результат задачи 2
        System.out.println(paper); // Результат задачи 2

    }
    public static void task3 (){
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog);// Резултат задачи 3
        System.out.println(cat);// Резултат задачи 3
        System.out.println(paper); // Резултат задачи 3

    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println(friend);// Результат задачи 4
        friend = friend + 2;
        System.out.println(friend);// Результат задачи 4
        friend = friend / 7;
        System.out.println(friend); // Результат задачи 4

    }
    public static void task5 () {
        System.out.println("Зачада 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);// Результат задачи 5
        frog = frog / 3.5;
        System.out.println(frog);// Результат задачи 5
        frog = frog + 4;
        System.out.println(frog); // Результат задачи 5

    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println(totalWeight + " кг");// Результат задачи 6
        System.out.println(differenceWeight + " кг"); // Результат задачи 6

    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        var differenceWeightSecond = weightSecondBoxer % weightFirstBoxer ;
        System.out.println(differenceWeight +" кг");// Результат задачи 7
        System.out.println(differenceWeightSecond +" кг");// Результат задачи 7
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var allTime = 640;
        var oneWorker = 8;
        var workers = allTime / oneWorker;
        System.out.println("Всего работников в компании - " + workers + " человек.");// результат задачи 8
        var workersTwo = workers + 94;
        var allTimeTwo = workersTwo * 8;
        System.out.println("Если в компании работает " + workersTwo + " человек, то всего " + allTimeTwo +
                " часов работы может быть поделено между сотрудниками"); // результат задачи 8
    }

}
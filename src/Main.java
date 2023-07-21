public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ты совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
        int age1 = 16;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то ты совершеннолетний");
        }

        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + " то, он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");

        int t = 10;
        if (t >= 5) {
            System.out.println("На улице " + t + " градусов, сегодня тепло, можно идти без шапки");
        }

        if (t < 5) {
            System.out.println("На улице " + t + " градусов, холодно, нужно надеть шапку");
        }

        int t2 = 0;
        if (t2 >= 5) {
            System.out.println("На улице " + t2 + " градусов, сегодня тепло, можно идти без шапки");
        }

        if (t2 < 5) {
            System.out.println("На улице " + t2 + " градусов, холодно, нужно надеть шапку");
        }


        System.out.println("Задача 3");


        int speed = 90;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int speed2 = 50;
        if (speed2 > 60) {
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        }

        if (speed2 <= 60) {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }


        System.out.println("Задача 4");

        int year = 1;
        if (year < 2) {
            System.out.println("Если возраст человека равен " + year + " ,то ему пора спать)");

        }
        int year2 = 4;
        if (year2 >=2 );
        else if (year2 <=6);
        {
            System.out.println("Если возраст человека равен " + year2 + " , то ему нужно ходить в детский сад)");

        }

        int year3 = 10;
        if (year3 >=7 );
        else if (year3 <=18);
        {
            System.out.println("Если возраст человека равен " + year3 + " , то ему нужно ходить в школу)");

        }

        int year4 = 20;
        if (year4 >18);
        else if (year4 <24);
            {
            System.out.println("Если возраст человека равен " + year4 + " , то его место в университете)");

        }


        int year5 = 27;
        if (year5 > 24) {
            System.out.println("Если возраст человека равен " + year5 + " , то ему пора ходить на работу)");

        }

        int year6 = 80;
        if (year6 > 60) {
            System.out.println("Если возраст человека равен " + year6 + " , то он может отдохнуть)");

        }


        System.out.println("Задача 5");

        int child = 4;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен "+ child + " , то он не может кататься на аттракционе");

        }

        int child1 = 13;
        if (child1 >5 );
        else if (child1 <14);
            {
            System.out.println("Если возраст ребенка равен "+ child1 + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");

        }

        int child2 = 17;
        if (child2 >14) {
            System.out.println("Если возраст ребенка равен "+ child2 + " , то он может кататься без сопровождения взрослого");

        }

        System.out.println("Задача 6");

        int train = 102;
        int seat = 60;
        int stand = 42;

        int people = 35;
        if (people <= 60) {
        System.out.println("Есть сидячие места");
        }
       else if (people <=102)  {
            System.out.println("Есть стоячие места");
        }


        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;

       if (one > two && one > three )
        { System.out.println("Максимальное число "+one);
        }
        else if (two > one && two > three) {
             System.out.println("Максимальное число "+ two );
        }
        else if (three > one && three > two) {
           System.out.println("Максимальное число " + three);
       }

    }
}
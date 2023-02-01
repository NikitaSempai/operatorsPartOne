import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstThreeTasks(17, 6, 40);
        remainingTasks(19, 16, 102, 60, 42, 60);
    }


    public static void firstThreeTasks(int age, int degrees, int speed){
        // first task
        System.out.println("--1--");
        if(age < 18 && age > 0 ){
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else if(age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        System.out.println("--2--");
        // second task
        if (degrees < 5) {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки");
        }
        // third task
        System.out.println("--3--");
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }else{
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void remainingTasks(int firstAge, int secondAge, int allPersons, int allSitPlaces, int standPlaces, int sitPlaces){
        // fourth task
        System.out.println("--4--");
        if (firstAge >= 2 && firstAge <= 6){
            System.out.println("Если возраст человека равен " + firstAge + ", то ему нужно ходить в детский сад");
        }
        else if (firstAge >= 7 && firstAge <= 18){
            System.out.println("Если возраст человека равен " + firstAge + ", то ему нужно ходить в школу");
        }
        else if (firstAge >= 19 && firstAge < 24){
            System.out.println("Если возраст человека равен " + firstAge + ", то его место в университете");
        }
        else{
            System.out.println("Если возраст человека равен " + firstAge + ", то ему пора ходить на работу");
        }
        // fifth task
        System.out.println("--5--");
        if(secondAge < 5){
            System.out.println("Если возраст ребенка равен " + secondAge + ", то ему нельзя кататься на аттракционе");
        } else if (secondAge >= 5 && secondAge < 14){
            System.out.println("Если возраст ребенка равен " + secondAge + ", то ему можно кататься на аттракционе в сопровождении");
        }else {
            System.out.println("Если возраст ребенка равен " + secondAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // sixth task
        System.out.println("--6--");
        if (sitPlaces == 60 && standPlaces == allPersons - allSitPlaces){
            System.out.println("Вагон полностью забит");
        } else if (sitPlaces < 60 && standPlaces < allPersons - allSitPlaces){
            System.out.println("В вагоне есть свободные сидячие и стоячие места");
        } else if (sitPlaces < 60 && standPlaces == allPersons - allSitPlaces){
            System.out.println("В вагоне есть свободные сидячие места");
        }else if (sitPlaces == 60 && standPlaces < allPersons - allSitPlaces){
            System.out.println("В вагоне есть свободные стоячие места");
        }else {
            System.out.println("Вы ввели некорректное число");
        }

        // seventh task
        System.out.println("--7--");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int three = scanner.nextInt();
            if(one > two && two >= three){
                System.out.println("Наибольшее число: " + one);
            }else if (two > one && one >= three){
                System.out.println("Наибольшее число: " + two);
            }else if (three > one && one >= two){
                System.out.println("Наибольшее число: " + three);
            }else if (one == three && one == two){
                System.out.println("Числа равны");
            }else if (one > two && one > three){
                System.out.println("Наибольшее число: " + one);
            }else if (two > one && two > three){
                System.out.println("Наибольшее число: " + two);
            }else if (three > one && three > two){
                System.out.println("Наибольшее число: " + three);
            }
        }
    }
}
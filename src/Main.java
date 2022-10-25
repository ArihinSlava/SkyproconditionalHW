import java.sql.PseudoColumnUsage;

public class Main {
    public static void main(String[] args) {
       int age = 19;
       boolean canNotGoToSchool = age < 7 || age > 18;
       if (age >= 18 && age < 21) {
           System.out.println("Ты достаточно взрослый , чтобы водить, но недостаточно , чтобы пить алкоголь");
       }
       if (canNotGoToSchool) {
           System.out.println("Я думаю ты не ходишь в школу");
       }





        /// Задача 1
        System.out.println("Задача 1");
       int userAge = 36;
       if (userAge >= 18) {
           System.out.println("Поздравляем с совершеннолетием!");
       } else {
           System.out.println("Возвраст совершеннолетия ещё не наступил , нужно немного подождать");
       }

       /// Задача 2
        System.out.println("Задача 2");
       int childAge = 24;
       if (childAge >= 7 && childAge < 18) {
           System.out.println("Ребенок ходит в школу");
       }
        else if (childAge >= 18 && childAge < 24) {
           System.out.println("Человек уже закончил школу и может отправлять в университет");
       } else {
           System.out.println("Человек окончил универститет и ему пора искать первую работу");
       }

        /// Задача 3
        System.out.println("Задача 3");

       int Passengers = 50;
       if (Passengers >= 0 && Passengers <= 60) {
           System.out.println("В вагоне есть сидячие места");
       }
       else if (Passengers > 60 && Passengers <= 102) {
           System.out.println("В вагоне есть стоячие места");
       } else {
           System.out.println("Вагон полностью забит");
       }

       /// Задача 4
        System.out.println("Задача 4");

       int peopleAge = 22;
       boolean kindergartenAge = peopleAge >= 2 && peopleAge <= 6;
       boolean schoolAge = peopleAge >= 7 && peopleAge <= 18;
       boolean universityAge = peopleAge > 18 && peopleAge < 24;
       boolean workAge = peopleAge >= 24;
       if (kindergartenAge) {
           System.out.println("Если возраст человека " + peopleAge + " нужно ходить в садик");
       }
       else if (schoolAge) {
           System.out.println(" Если возраст человка " + peopleAge + " нужно ходить в школу");
       }
       else if (universityAge) {
           System.out.println("Если возраст человека " + peopleAge + " нужно ходить в универ");
       } else {
           System.out.println("Если возвраст человека " + peopleAge + " нужно ходить на работу");
        }

       /// Задание 5
        System.out.println("Задание 5");

       int childrenAge = 8;
       boolean noEntry = childrenAge < 5;
       boolean entryWithAdult = childrenAge >= 5 && childrenAge < 14;
       if (noEntry) {
           System.out.println("Нельзя ребенку кататься");
       }
        else if (entryWithAdult) {
           System.out.println("Можно кататься ребенку в сопровождении взрослого");
       } else {
           System.out.println("Можно кататься ребенку без ограничений");
       }
        /// Задание 6
        System.out.println("Задание 6");

        int one = 45;
        int two = 15;
        int three = 30;
        if (one > three && one > two) {
            System.out.println(one);
        }
        else if (two < one && two < three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }





    }
}
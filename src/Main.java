public class Main {
    public static void main(String [] args) {
       //task1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + total/100;
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //task2
        int a = 0;
        while (a < 10){
            a = a + 1; //когда ставлю ++ выводит бесконечное количество нулей
            System.out.print(a + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i = i - 1){ //когда ставлю -- выводит бесконечное количество десяток
            System.out.print(i + " ");
        }
        System.out.println();

        //task3
        int number = 12000000;
        int year;
        for (year = 1; year <= 10; year = year + 1){
            int bornNumber = number / 1000 * 17;
            int deadNumber = number / 1000 * 8;
            number = (bornNumber - deadNumber) + number;
            System.out.println("Год " + year + ", численность населения составляет " + number);
        }

        //task4
        int salary1 = 15000;
        int total1 = 0;
        while (total1 < 12000000) {
            total1 = total1 + (total1 / 100 * 7);
            total1 = total1 + salary1;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }

        //task5
        int salary2 = 15000;
        int total2 = 0;
        while (total2 < 12000000) {
            i = i + 1;
            total2 = total2 + (total2 / 100 * 7);
            total2 = total2 + salary2;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
            }
        }

        //task6
        int salary3 = 15000;
        int total3 = 0;
        for (i = 1; i <= 108; i = i + 1){
            total3 = total3 + (total3 / 100 * 7);
            total3 = total3 + salary3;
            if (i % 6 ==0){
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total3 + " рублей");
            }
        }

        //task7
       for (int dataOctober = 7; dataOctober <= 31; dataOctober = dataOctober + 7) {
               System.out.println("Сегодня пятница, " + dataOctober + "-е число. Необходимо подготовить отчет.");
       }

       //task8
        int cometYear = 2023;
        for (int s = 0; s < cometYear + 100; s = s + 79) {
            if (s > cometYear - 200) {
                System.out.println(s);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
            //задание 1
            System.out.println("задание 1");
            int cleintOS = 1;

            if (cleintOS ==0)  {
                System.out.println("Установите версию приложения IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            //задание 2
            System.out.println("задание 2");
            int cleintOS2 = 0;
            int cleintDeviceYears = 2020;

            if(cleintOS2 == 0) {
                if(cleintDeviceYears < 2015) {
                    System.out.println("Установите облегчённую версию приложения IOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения IOS по ссылке");
                }

            } else {
                if (cleintDeviceYears < 2015) {
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                        //задание 3
                        System.out.println("задание 3");
                        int year = 2021;

                        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                            System.out.println(year + " является високосным");
                        } else {
                            System.out.println(year + " не является високосным");
                        }
                //задание 4
                System.out.println("задание 4");


            }

        }
    }

package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "5 дней", "самолет", "5 звезд", "120000"},
                            {"Турция", "7 дней", "автобус", "4 звезд", "100000"},
                            {"Греция", "6 дней", "самолет", "3 звезд", "90000"},
                            {"Турция", "12 дней", "автобус", "4 звезд", "80000"},
                            {"Турция", "6 дней", "самолет", "5 звезд", "150000"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");

        String country = scanner.nextLine();

        System.out.println("У нас есть вот такие туры в " + country);

        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ", "
                        + tours[i][2] + ", " + tours[i][3] + ", цена - " + tours[i][4]);
            }
        }

        System.out.println("Сколько максимум дней для поездки?");
        String dayStr = scanner.nextLine();

        int day = Integer.parseInt(dayStr);
        for(int i = 0; i < tours.length; i++){
            int dayFromTour = Integer.parseInt(tours[i][1].replaceAll("[\\D]", ""));
            if(dayFromTour <= day){
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ", "
                        + tours[i][2] + ", " + tours[i][3] + ", цена - " + tours[i][4]);
            }
        }

        // вывести на консоль
        // 1 - все туры ОТ и ДО введенной цены
        System.out.println("От скольки рублей Ваш капитал?");
        String minCostStr = scanner.nextLine();
        System.out.println("До скольки рублей Ваш капитал?");
        String maxCostStr = scanner.nextLine();

        int minCost = Integer.parseInt(minCostStr);
        int maxCost = Integer.parseInt(maxCostStr);

        System.out.println("Туры от " + minCost + " до " + maxCost + " :");
        for(int i = 0; i < tours.length; i++){
            int price = Integer.parseInt(tours[i][4]);
            if(price>=minCost && price<=maxCost){
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ", "
                        + tours[i][2] + ", " + tours[i][3] + ", цена - " + tours[i][4]);
            }
        }
        // 2 - среднюю цену в вашем агенстве
        int totalPrice = 0;
        for(int i = 0;i < tours.length;i++){
            int price = Integer.parseInt(tours[i][4]);
            totalPrice = totalPrice + price;
        }
        double srPrice = totalPrice/tours.length;
        System.out.println("Средняя цена тура в агенстве: " + srPrice);
        // 3 - туры от ... звезд и выше
        System.out.println("Введите минимальное количество звезд: ");
        String starsOfUserStr = scanner.nextLine();
        int starsOfUser = Integer.parseInt(starsOfUserStr);

        System.out.println("Туры с " + starsOfUser + " звезд и больше:");
        for(int i = 0; i<tours.length; i++){
            int starsInTour = Integer.parseInt(tours[i][3].replaceAll("[\\D]", ""));
            if(starsInTour >= starsOfUser){
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ", "
                        + tours[i][2] + ", " + tours[i][3] + ", цена - " + tours[i][4]);
            }
        }
    }
}

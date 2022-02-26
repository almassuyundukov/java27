package lesson4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - круг ");
        System.out.println("2 - овал ");
        System.out.println("3 - треугольник ");
        System.out.println("4 - прямоугольник ");
        System.out.println("5 - трапеция ");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус круга: ");
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);
            System.out.println("Площадь или периметр?");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (radius * radius)));
            } else {
                System.out.println("Окружность круга: " + (2 * Math.PI * radius));
            }
        } else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {
            System.out.println("Введите длину большой полуоси: ");
            String lengthSemiMajorAxisStr = scanner.nextLine();
            double lengthSemiMajorAxis = Double.parseDouble(lengthSemiMajorAxisStr);
            System.out.println("Введите длину маленькой полуоси: ");
            String lengthSemiMinorAxisStr = scanner.nextLine();
            double lengthSemiMinorAxis = Double.parseDouble(lengthSemiMinorAxisStr);
            System.out.println("Площадь или периметр?");

            String answerForOval = scanner.nextLine();
            if (answerForOval.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь: " + lengthSemiMajorAxis * lengthSemiMinorAxis * Math.PI);
            } else {
                System.out.println("Периметр: " + 2 * Math.PI * Math.sqrt((Math.pow(lengthSemiMajorAxis, 2) +
                        Math.pow(lengthSemiMinorAxis, 2)) / 2));
            }
        } else if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {
            System.out.println("Введите сторону a: ");
            String aTriangleStr = scanner.nextLine();
            double aTriangle = Double.parseDouble(aTriangleStr);
            System.out.println("Введите сторону b: ");
            String bTriangleStr = scanner.nextLine();
            double bTriangle = Double.parseDouble(bTriangleStr);
            System.out.println("Введите сторону c: ");
            String cTriangleStr = scanner.nextLine();
            double cTriangle = Double.parseDouble(cTriangleStr);
            System.out.println("Площадь или периметр?");
            String answerForTriangle = scanner.nextLine();
            double poluperimetr = (aTriangle + bTriangle + cTriangle) / 2;

            if (answerForTriangle.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь: " + Math.sqrt(poluperimetr * (poluperimetr - aTriangle) *
                        (poluperimetr - bTriangle) * (poluperimetr - cTriangle)));
            } else {
                System.out.println("Периметр: " + poluperimetr * 2);
            }
        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Введите большую сторону: ");
            String aRectangleStr = scanner.nextLine();
            double aRectangle = Double.parseDouble(aRectangleStr);
            System.out.println("Введите меньшую сторону: ");
            String bRectangleStr = scanner.nextLine();
            double bRectangle = Double.parseDouble(bRectangleStr);
            System.out.println("Площадь или периметр?");
            String answerForRectangle = scanner.nextLine();

            if (answerForRectangle.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь: " + aRectangle * bRectangle);
            } else {
                System.out.println("Периметр: " + 2 * (aRectangle + bRectangle));
            }
        } else if (figura.equals("5") || figura.equalsIgnoreCase("трапеция")) {
            System.out.println("Введите меньшее основание: ");
            String aTrapezoidStr = scanner.nextLine();
            double aTrapezoid = Double.parseDouble(aTrapezoidStr);
            System.out.println("Введите большее основание: ");
            String bTrapezoidStr = scanner.nextLine();
            double bTrapezoid = Double.parseDouble(bTrapezoidStr);
            System.out.println("Введите боковую сторону: ");
            String cTrapezoidStr = scanner.nextLine();
            double cTrapezoid = Double.parseDouble(cTrapezoidStr);
            System.out.println("Введите боковую основание: ");
            String dTrapezoidStr = scanner.nextLine();
            double dTrapezoid = Double.parseDouble(dTrapezoidStr);
            System.out.println("Площадь или периметр?");
            String answerForTrapezoid = scanner.nextLine();

            if (answerForTrapezoid.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь: " + (aTrapezoid + bTrapezoid) / 2 * Math.sqrt(Math.pow(cTrapezoid, 2) -
                        Math.pow((Math.pow(bTrapezoid - aTrapezoid, 2) + Math.pow(cTrapezoid, 2) - Math.pow(dTrapezoid, 2)) / (2 *
                                (bTrapezoid - aTrapezoid)), 2)));
            } else {
                System.out.println("Периметр: " + aTrapezoid + bTrapezoid + cTrapezoid + dTrapezoid);
            }
        } else {
            System.out.println("Выберите фигуру из списка!!!");
        }
    }
}
